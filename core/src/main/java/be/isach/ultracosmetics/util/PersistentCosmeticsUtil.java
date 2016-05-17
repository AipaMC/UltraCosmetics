package be.isach.ultracosmetics.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;

import be.isach.ultracosmetics.CustomPlayer;
import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.cosmetics.hats.Hat;
import be.isach.ultracosmetics.cosmetics.particleeffects.ParticleEffect;
import be.isach.ultracosmetics.cosmetics.particleeffects.ParticleEffectType;
import be.isach.ultracosmetics.cosmetics.suits.ArmorSlot;
import be.isach.ultracosmetics.cosmetics.suits.Suit;
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
        Hat hat = player.currentHat;
        SuitType helm = player.currentHelmet != null ? player.currentHelmet.getType() : null;
        SuitType chest = player.currentChestplate != null ? player.currentChestplate.getType() : null;
        SuitType legs = player.currentLeggings != null ? player.currentHelmet.getType() : null;
        SuitType boots = player.currentBoots != null ? player.currentBoots.getType() : null;
        ParticleEffect particle = player.currentParticleEffect;
        
        Bukkit.getScheduler().runTaskAsynchronously(UltraCosmetics.getInstance(), new Runnable() {
            @Override
            public void run() {
                if (hat != null) {
                    table.update().set("hat", hat.name()).where("uuid", player.getUuid().toString()).execute();
                }
                if (helm != null) {
                    System.out.println("Saving helm");
                    table.update().set("suit_helm", helm.name()).where("uuid", player.getUuid().toString()).execute();
                }
                if (chest != null) {
                    table.update().set("suit_chest", chest.name()).where("uuid", player.getUuid().toString()).execute();
                }
                if (legs != null) {
                    table.update().set("suit_legs", legs.name()).where("uuid", player.getUuid().toString()).execute();
                }
                if (boots != null) {
                    table.update().set("suit_boots", boots.name()).where("uuid", player.getUuid().toString()).execute();
                }
                if (particle != null) {
                    table.update().set("particle", particle.getType().name()).where("uuid", player.getUuid().toString()).execute();
                }
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
                    System.out.println(suitHelm);
                    String suitChest = rs.getString("suit_chest");
                    String suitLegs = rs.getString("suit_legs");
                    String suitBoots = rs.getString("suit_boots");
                    String particle = rs.getString("particle");
                    Bukkit.getScheduler().runTask(UltraCosmetics.getInstance(), new Runnable() {
                        @Override
                        public void run() {
                            if (hat != null) {
                                player.setHat(Hat.valueOf(hat));
                            }
                            if (suitHelm != null) {
                                System.out.println(suitHelm);
                                System.out.println("Setting");
                                SuitType.valueOf(suitHelm).equip(player.getPlayer(), ArmorSlot.HELMET);
                            }
                            if (suitChest != null) {
                                SuitType.valueOf(suitChest).equip(player.getPlayer(), ArmorSlot.CHESTPLATE);
                            }
                            if (suitLegs != null) {
                                SuitType.valueOf(suitLegs).equip(player.getPlayer(), ArmorSlot.LEGGINGS);
                            }
                            if (suitBoots != null) {
                                SuitType.valueOf(suitBoots).equip(player.getPlayer(), ArmorSlot.BOOTS);
                            }
                            if (particle != null) {
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
