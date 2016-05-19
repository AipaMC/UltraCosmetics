package org.mcmega.megacraft;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class NoPermItemRenderEvent extends Event {
    
    private static HandlerList handlers = new HandlerList();
    
    private final Player player;
    private final CosmeticType type;
    private final String cosmeticName;
    private final String permission;
    private ItemStack item;
    
    public NoPermItemRenderEvent(Player player, CosmeticType type, String cosmeticName, String permission) {
        this.player = player;
        this.type = type;
        this.cosmeticName = cosmeticName;
        this.permission = permission;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public CosmeticType getType() {
        return type;
    }
    
    public String getPermissionNode() {
        return permission;
    }
    
    public String getCosmeticName() {
        return cosmeticName;
    }
    
    public void setItemStack(ItemStack item) {
        this.item = item;
    }
    
    public static ItemStack handleEvent(Player player, CosmeticType type, String cosmeticName, String permission) {
        NoPermItemRenderEvent event = new NoPermItemRenderEvent(player, type, cosmeticName, permission);
        Bukkit.getPluginManager().callEvent(event);
        return event.item;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
