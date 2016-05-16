package be.isach.ultracosmetics.cosmetics.suits;

import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.inventory.meta.LeatherArmorMeta;

/**
 * Created by Aipa on 5/16/16
 */
public abstract class ColoredSuits {
    
    public static class BlueSuit extends Suit {
        public BlueSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.BLUE);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.BLUE);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class GreenSuit extends Suit {
        public GreenSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.GREEN);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.GREEN);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class YellowSuit extends Suit {
        public YellowSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.YELLOW);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.YELLOW);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class OrangeSuit extends Suit {
        public OrangeSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.ORANGE);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.ORANGE);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class RedSuit extends Suit {
        public RedSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.RED);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.RED);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class PinkSuit extends Suit {
        public PinkSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.PINK);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.FUCHSIA);
            itemStack.setItemMeta(itemMeta);
        }
    }
    public static class PurpleSuit extends Suit {
        public PurpleSuit(UUID owner, ArmorSlot armorSlot) {
            super(owner, armorSlot, SuitType.PURPLE);
            
            LeatherArmorMeta itemMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            itemMeta.setColor(Color.PURPLE);
            itemStack.setItemMeta(itemMeta);
        }
    }

}
