package be.isach.ultracosmetics.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;

import be.isach.ultracosmetics.CustomPlayer;
import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.cosmetics.hats.Hat;
import be.isach.ultracosmetics.cosmetics.particleeffects.ParticleEffectType;
import be.isach.ultracosmetics.cosmetics.suits.ArmorSlot;
import be.isach.ultracosmetics.cosmetics.suits.SuitType;
import be.isach.ultracosmetics.mysql.Table;

public class PersistentCosmeticsUtil {
    
    private static Table table;
    
    public static void open() {
        try {
            PreparedStatement persistSQL = UltraCosmetics.getInstance().co.prepareStatement("CREATE TABLE IF NOT EXISTS UltraCosmeticsActive(" +
                    "id INTEGER not NULL AUTO_INCREMENT," +
                    " uuid VARCHAR(36) NOT NULL," +
                    " hat VARCHAR(255)," +
                    " suit_helm VARCHAR(255)," +
                    " suit_chest VARCHAR(255)," +
                    " suit_legs VARCHAR(255)," +
                    " suit_boots VARCHAR(255)," +
                    " particle VARCHAR(255),"
                    + " PRIMARY KEY ( id ))");
            persistSQL.executeUpdate();
            table = new Table(UltraCosmetics.getInstance().co, "UltraCosmeticsActive");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void save(CustomPlayer player) {
        //Get these sync so when they are cleared we still have them
        String hat = player.currentHat != null ? player.currentHat.name() : "";
        String helm = player.currentHelmet != null ? player.currentHelmet.getType().name() : "";
        String chest = player.currentChestplate != null ? player.currentChestplate.getType().name() : "";
        String legs = player.currentLeggings != null ? player.currentHelmet.getType().name() : "";
        String boots = player.currentBoots != null ? player.currentBoots.getType().name() : "";
        String particle = player.currentParticleEffect != null ? player.currentParticleEffect.getType().name() : "";
        
        Bukkit.getScheduler().runTaskAsynchronously(UltraCosmetics.getInstance(), new Runnable() {
            @Override
            public void run() {
                table.update().set("hat", hat)
                .set("suit_helm", helm)
                .set("suit_chest", chest)
                .set("suit_legs", legs)
                .set("suit_boots", boots)
                .set("particle", particle)
                .where("uuid", player.getUuid().toString()).execute();
            }
        });
    }

    public static void initPersistent(CustomPlayer player) {
        //Wait a second to allow the save task to finish (if coming from another server)
        Bukkit.getScheduler().runTaskLaterAsynchronously(UltraCosmetics.getInstance(), new Runnable() {

            @Override
            public void run() {
                try (ResultSet rs = table.select().where("uuid", player.getUuid().toString()).execute()) {
                    if (!rs.first()) {
                        table.insert().insert("uuid").value(player.getUuid().toString()).execute();
                        return;
                    }
                    String hat = rs.getString("hat");
                    String suitHelm = rs.getString("suit_helm");
                    String suitChest = rs.getString("suit_chest");
                    String suitLegs = rs.getString("suit_legs");
                    String suitBoots = rs.getString("suit_boots");
                    String particle = rs.getString("particle");
                    Bukkit.getScheduler().runTask(UltraCosmetics.getInstance(), new Runnable() {
                        @Override
                        public void run() {
                            if (hat != null && !hat.isEmpty()) {
                                player.setHat(Hat.valueOf(hat));
                            }
                            if (suitHelm != null && !suitHelm.isEmpty()) {
                                SuitType.valueOf(suitHelm).equip(player.getPlayer(), ArmorSlot.HELMET);
                            }
                            if (suitChest != null && !suitChest.isEmpty()) {
                                SuitType.valueOf(suitChest).equip(player.getPlayer(), ArmorSlot.CHESTPLATE);
                            }
                            if (suitLegs != null && !suitLegs.isEmpty()) {
                                SuitType.valueOf(suitLegs).equip(player.getPlayer(), ArmorSlot.LEGGINGS);
                            }
                            if (suitBoots != null && !suitBoots.isEmpty()) {
                                SuitType.valueOf(suitBoots).equip(player.getPlayer(), ArmorSlot.BOOTS);
                            }
                            if (particle != null && !particle.isEmpty()) {
                                ParticleEffectType.valueOf(particle).equip(player.getPlayer());
                            }
                        }
                    });
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
        }, 20);
    }
    
}
