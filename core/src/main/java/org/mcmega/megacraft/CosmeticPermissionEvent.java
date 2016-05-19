package org.mcmega.megacraft;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CosmeticPermissionEvent extends Event {
    
    private static HandlerList handlers = new HandlerList();
    
    private final Player player;
    private final CosmeticType type;
    private final String permission;
    private boolean hasPermission;
    
    public CosmeticPermissionEvent(Player player, CosmeticType type, String permission, boolean hasPermission) {
        this.player = player;
        this.type = type;
        this.permission = permission;
        this.hasPermission = hasPermission;
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
    
    public boolean hasPermission() {
        return hasPermission;
    }
    
    public void setHasPermission(boolean hasPerm) {
        this.hasPermission = hasPerm;
    }
    
    public static boolean handleEvent(Player player, CosmeticType type, String permission) {
        boolean has = player.hasPermission(permission);
        CosmeticPermissionEvent event = new CosmeticPermissionEvent(player, type, permission, has);
        Bukkit.getPluginManager().callEvent(event);
        return event.hasPermission();
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
