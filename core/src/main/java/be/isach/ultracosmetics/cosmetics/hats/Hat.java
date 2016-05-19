package be.isach.ultracosmetics.cosmetics.hats;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.config.MessageManager;
import be.isach.ultracosmetics.config.SettingsManager;
import be.isach.ultracosmetics.util.ItemFactory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sacha on 15/10/15.
 */
public enum Hat {

    // Most horrible cosmetic to register.
    //MegaCraft Hats
    MELON(ItemFactory.createSkull("YzNmZWQ1MTRjM2UyMzhjYTdhYzFjOTRiODk3ZmY2NzExYjFkYmU1MDE3NGFmYzIzNWM4ZjgwZDAyOSJ9fX0="), "Melon", "&7&oWear a melon hat"),
    TV(ItemFactory.createSkull("N2Y0YjhjOWYzMzc4NjkxNTllZDMxYTcxYmQ1MDNiNzI1YjJlZTI2NGE2ZWIxMWU1OGU2NTdlMWE4YTk5YyJ9fX0="), "TV", "&7&oWear a TV hat"),
    MOSSYCOBBLE(ItemFactory.createSkull("YTQ0YzFlOGU4MjY3MmJiYTU4OTJmZDQ2NTlmOGRhZDg0ZDE1NDVkYjI2ZGI1MmVjYzkxOGYzMmExMzkxNTEzIn19fQ=="), "MossyCobble", "&7&oWear a mossy cobble hat"),
    COBBLE(ItemFactory.createSkull("NDU0ZDljNDg4YzNmYmRlNTQ1NGUzODYxOWY5Y2M1YjViYThjNmMwMTg2ZjhhYTFkYTYwOTAwZmNiYzNlYTYifX19"), "Cobble", "&7&oWear a cobble hat"),
    ENCHANTTABLE(ItemFactory.createSkull("NjI2NzJjODdlZWY2ODE4ODI4OTE4ZGQzY2EwMzg1NmNjYjQzNjZlN2M5YWMyNjI0YTk0MmYwZGI3ZTk2YSJ9fX0="), "EnchantTable", "&7&oWear a enchantment table hat"),
    CHORUSFLOWER(ItemFactory.createSkull("OTJlYjMwYTBiZTNkN2M3ZTE2MmM3NmU3MmEzYzRjYzQ0MjIzNTY3MTYyYTk0MTc1MjU3MmFlNmNjZWI5NmM4NiJ9fX0="), "ChorusFlower", "&7&oWear a chorus flower hat"),
    OAKLOG(ItemFactory.createSkull("NmQyZTMxMDg3OWE2NDUwYWY1NjI1YmNkNDUwOTNkZDdlNWQ4ZjgyN2NjYmZlYWM2OWM4MTUzNzc2ODQwNmIifX19"), "OakLog", "&7&oWear a oak log hat"),
    SLIMEBLOCK(ItemFactory.createSkull("OTBlNjVlNmU1MTEzYTUxODdkYWQ0NmRmYWQzZDNiZjg1ZThlZjgwN2Y4MmFhYzIyOGE1OWM0YTk1ZDZmNmEifX19"), "SlimeBlock", "&7&oWear a slime block hat"),
    PORTAL(ItemFactory.createSkull("YjBiZmMyNTc3ZjZlMjZjNmM2ZjczNjVjMmM0MDc2YmNjZWU2NTMxMjQ5ODkzODJjZTkzYmNhNGZjOWUzOWIifX19"), "Portal", "&7&oWear a portal hat"),
    NOTEBLOCK(ItemFactory.createSkull("NGNlZWI3N2Q0ZDI1NzI0YTljYWYyYzdjZGYyZDg4Mzk5YjE0MTdjNmI5ZmY1MjEzNjU5YjY1M2JlNDM3NmUzIn19fQ=="), "Noteblock", "&7&oWear a note block hat"),
    STONESLAB(ItemFactory.createSkull("OGRkMGNkMTU4YzJiYjY2MTg2NTBlMzk1NGIyZDI5MjM3ZjViNGMwZGRjN2QyNThlMTczODBhYjY5NzlmMDcxIn19fQ=="), "StoneSlab", "&7&oWear a stone slab hat"),
    IRONBLOCK(ItemFactory.createSkull("MTI2Yjc3MjMyOWNmMzJmODY0M2M0OTI4NjI2YjZhMzI1MjMzZmY2MWFhOWM3NzI1ODczYTRiZDY2ZGIzZDY5MiJ9fX0"), "IronBlock", "&7&oWear a iron block hat"),
    GOLDBLOCK(ItemFactory.createSkull("NTRiZjg5M2ZjNmRlZmFkMjE4Zjc4MzZlZmVmYmU2MzZmMWMyY2MxYmI2NTBjODJmY2NkOTlmMmMxZWU2In19fQ=="), "GoldBlock", "&7&oWear a gold block hat"),
    DIAMONDBLOCK(ItemFactory.createSkull("OTYzMTU5N2RjZTRlNDA1MWU4ZDVhNTQzNjQxOTY2YWI1NGZiZjI1YTBlZDYwNDdmMTFlNjE0MGQ4OGJmNDhmIn19fQ=="), "DiamondBlock", "&7&oWear a diamond block hat"),
    EMERALDBLOCK(ItemFactory.createSkull("YWM5MDZkNjg4ZTY1ODAyNTY5ZDk3MDViNTc5YmNlNTZlZGM4NmVhNWMzNmJkZDZkNmZjMzU1MTZhNzdkNCJ9fX0="), "EmeraldBlock", "&7&oWear a emerald block hat"),
    OBSIDIAN(ItemFactory.createSkull("Nzg0MGI4N2Q1MjI3MWQyYTc1NWRlZGM4Mjg3N2UwZWQzZGY2N2RjYzQyZWE0NzllYzE0NjE3NmIwMjc3OWE1In19fQ=="), "Obsidian", "&7&oWear a obsidian hat"),
    BRICK(ItemFactory.createSkull("Y2UyNWJjNDJkNDExNDkxOThjOGM1MjNjMjM5MjA3MzdiOWNlZGRhOWE5OWVkYTUzZjMyMzJmNDg5NjQifX19"), "Brick", "&7&oWear a brick hat"),
    BEACON(ItemFactory.createSkull("Y2RlMzNjOTVmZWMxYjhkOTg4MjUwZjVmNWIzYTI0ODU3NDI0MzlmYWVhYTc1ZWQ1MDZlYTAxZDc1ZTE3ZjIxIn19fQ=="), "Beacon", "&7&oWear a beacon hat"),
    LAPISBLOCK(ItemFactory.createSkull("ODZmNDc2ODcxZWQyM2Y3OWU3YjlkNDk1NDg5ODg3ZTI0NGM2MTljNWUxOWU0MWNmOTViMjcxYTJlYmU3NSJ9fX0="), "LapisBlock", "&7&oWear a lapis block hat"),
    BEDROCK(ItemFactory.createSkull("MzZkMWZhYmRmM2UzNDI2NzFiZDlmOTVmNjg3ZmUyNjNmNDM5ZGRjMmYxYzllYThmZjE1YjEzZjFlN2U0OGI5In19fQ=="), "Bedrock", "&7&oWear a bedrock hat"),
    REDSTONEORE(ItemFactory.createSkull("NTY5YTFmMTE0MTUxYjQ1MjEzNzNmMzRiYzE0YzI5NjNhNTAxMWNkYzI1YTY1NTRjNDhjNzA4Y2Q5NmViZmMifX19"), "RedstoneOre", "&7&oWear a redstone ore hat"),
    GOLDORE(ItemFactory.createSkull("NzNiYzk2NWQ1NzljM2M2MDM5ZjBhMTdlYjdjMmU2ZmFmNTM4YzdhNWRlOGU2MGVjN2E3MTkzNjBkMGE4NTdhOSJ9fX0="), "GoldOre", "&7&oWear a gold ore hat"),
    DIAMONDORE(ItemFactory.createSkull("MTFlZDlhYmY1MWZlNGVhODRjZmNiMjcyOTdmMWJjNTRjZDM4MmVkZjg1ZTdiZDZlNzVlY2NhMmI4MDY2MTEifX19"), "DiamondOre", "&7&oWear a diamond ore hat"),
    
    ASTRONAUT(ItemFactory.createSkull("M2U4YWFkNjczMTU3YzkyMzE3YTg4YjFmODZmNTI3MWYxY2Q3Mzk3ZDdmYzhlYzMyODFmNzMzZjc1MTYzNCJ9fX0="), "Astronaut", "&7&oHouston, we have got a problem."),
    SCARED(ItemFactory.createSkull("NjM2ZTI2YzQ0NjU5ZTgxNDhlZDU4YWE3OWU0ZDYwZGI1OTVmNDI2NDQyMTE2ZjgxYjU0MTVjMjQ0NmVkOCJ9fX0="), "Scared", "&7&oOh gawd, that scared me!"),
    ANGEL(ItemFactory.createSkull("M2UxZGViYzczMjMxZjhlZDRiNjlkNWMzYWMxYjFmMThmMzY1NmE4OTg4ZTIzZjJlMWJkYmM0ZTg1ZjZkNDZhIn19fQ=="), "Angel", "&7&oDid it hurt when you fell from heaven?"),
    EMBARASSED(ItemFactory.createSkull("ZjcyMGRmOTExYzA1MjM3NzA2NTQwOGRiNzhhMjVjNjc4Zjc5MWViOTQ0YzA2MzkzNWFlODZkYmU1MWM3MWIifX19"), "Embarassed", "&7&oI am kinda embarassed by that."),
    KISSY(ItemFactory.createSkull("NTQ1YmQxOGEyYWFmNDY5ZmFkNzJlNTJjZGU2Y2ZiMDJiZmJhYTViZmVkMmE4MTUxMjc3Zjc3OWViY2RjZWMxIn19fQ=="), "Kissy", "&7&oWanna kiss?"),
    SAD(ItemFactory.createSkull("MTQ5NjhhYzVhZjMxNDY4MjZmYTJiMGQ0ZGQxMTRmZGExOTdmOGIyOGY0NzUwNTUzZjNmODg4MzZhMjFmYWM5In19fQ=="), "Sad", "&7&oI am so sad."),
    COOL(ItemFactory.createSkull("ODY4ZjRjZWY5NDlmMzJlMzNlYzVhZTg0NWY5YzU2OTgzY2JlMTMzNzVhNGRlYzQ2ZTViYmZiN2RjYjYifX19"), "Cool", "&7&oI am such a cool guy."),
    SURPRISED(ItemFactory.createSkull("YmMyYjliOWFlNjIyYmQ2OGFkZmY3MTgwZjgyMDZlYzQ0OTRhYmJmYTEzMGU5NGE1ODRlYzY5MmU4OTg0YWIyIn19fQ=="), "Surprised", "&7&oWow, did not expect that!"),
    DEAD(ItemFactory.createSkull("YjM3MWU0ZTFjZjZhMWEzNmZkYWUyNzEzN2ZkOWI4NzQ4ZTYxNjkyOTk5MjVmOWFmMmJlMzAxZTU0Mjk4YzczIn19fQ=="), "Dead", "&7&ogot rekt"),
    CRYING(ItemFactory.createSkull("MWYxYjg3NWRlNDljNTg3ZTNiNDAyM2NlMjRkNDcyZmYyNzU4M2ExZjA1NGYzN2U3M2ExMTU0YjViNTQ5OCJ9fX0="), "Crying", "&7&oi cri evrytiem"),
    BIGSMILE(ItemFactory.createSkull("NTA1OWQ1OWViNGU1OWMzMWVlY2Y5ZWNlMmY5Y2YzOTM0ZTQ1YzBlYzQ3NmZjODZiZmFlZjhlYTkxM2VhNzEwIn19fQ=="), "BigSmile", "&7&oUh, because I am really happy!"),
    WINK(ItemFactory.createSkull("ZjRlYTJkNmY5MzlmZWZlZmY1ZDEyMmU2M2RkMjZmYThhNDI3ZGY5MGIyOTI4YmMxZmE4OWE4MjUyYTdlIn19fQ=="), "Wink", "&7&oYou know what I mean ;)"),
    DERP(ItemFactory.createSkull("M2JhYWJlNzI0ZWFlNTljNWQxM2Y0NDJjN2RjNWQyYjFjNmI3MGMyZjgzMzY0YTQ4OGNlNTk3M2FlODBiNGMzIn19fQ=="), "Derp", "&7&oDerp Derp Derping all around"),
    SMILE(ItemFactory.createSkull("NTJlOTgxNjVkZWVmNGVkNjIxOTUzOTIxYzFlZjgxN2RjNjM4YWY3MWMxOTM0YTQyODdiNjlkN2EzMWY2YjgifX19"), "Smile", "&7&oUh, because I am happy"),
    IRON(ItemFactory.createSkull("YmJhODQ1OTE0NWQ4M2ZmYzQ0YWQ1OGMzMjYwZTc0Y2E1YTBmNjM0YzdlZWI1OWExYWQzMjM0ODQ5YzkzM2MifX19"), "Iron", "&7&oAs hard as iron!"),
    GOLD(ItemFactory.createSkull("YjZkMWNlNjk3ZTlkYmFhNGNjZjY0MjUxNmFhYTU5ODEzMzJkYWMxZDMzMWFmZWUyZWUzZGNjODllZmRlZGIifX19"), "Gold", "&7&oMy precious!"),
    DIAMOND(ItemFactory.createSkull("YzAxNDYxOTczNjM0NTI1MTk2ZWNjNzU3NjkzYjE3MWFkYTRlZjI0YWE5MjgzNmY0MmVhMTFiZDc5YzNhNTAyZCJ9fX0="), "Diamond", "&7&oThis is really strong!"),
    PISTON(ItemFactory.createSkull("YWE4NjhjZTkxN2MwOWFmOGU0YzM1MGE1ODA3MDQxZjY1MDliZjJiODlhY2E0NWU1OTFmYmJkN2Q0YjExN2QifX19"), "Piston", "&7&oHave you got the redstone?"),
    COMMANDBLOCK(ItemFactory.createSkull("ODUxNGQyMjViMjYyZDg0N2M3ZTU1N2I0NzQzMjdkY2VmNzU4YzJjNTg4MmU0MWVlNmQ4YzVlOWNkM2JjOTE0In19fQ=="), "CommandBlock", "&7&oControl the world with it!"),
    MUSIC(ItemFactory.createSkull("NGNlZWI3N2Q0ZDI1NzI0YTljYWYyYzdjZGYyZDg4Mzk5YjE0MTdjNmI5ZmY1MjEzNjU5YjY1M2JlNDM3NmUzIn19fQ=="), "Music", "&7&oYou are so musical."),
    SQUID(ItemFactory.createSkull("MDE0MzNiZTI0MjM2NmFmMTI2ZGE0MzRiODczNWRmMWViNWIzY2IyY2VkZTM5MTQ1OTc0ZTljNDgzNjA3YmFjIn19fQ=="), "Squid", "&7&oBloop Bloop!"),
    CHICKEN(ItemFactory.createSkull("MTYzODQ2OWE1OTljZWVmNzIwNzUzNzYwMzI0OGE5YWIxMWZmNTkxZmQzNzhiZWE0NzM1YjM0NmE3ZmFlODkzIn19fQ=="), "Chicken", "&7&oBwwaaaaaaaaaaaakkkkk!"),
    PIG(ItemFactory.createSkull("NjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0="), "Pig", "&7&oOink Oink!"),
    BLAZE(ItemFactory.createSkull("Yjc4ZWYyZTRjZjJjNDFhMmQxNGJmZGU5Y2FmZjEwMjE5ZjViMWJmNWIzNWE0OWViNTFjNjQ2Nzg4MmNiNWYwIn19fQ=="), "Blaze", "&7&oWatch out for the fire!"),
    SHEEP(ItemFactory.createSkull("ZjMxZjljY2M2YjNlMzJlY2YxM2I4YTExYWMyOWNkMzNkMThjOTVmYzczZGI4YTY2YzVkNjU3Y2NiOGJlNzAifX19"), "Sheep", "&7&oBaaaa, baa"),
    GOLEM(ItemFactory.createSkull("ODkwOTFkNzllYTBmNTllZjdlZjk0ZDdiYmE2ZTVmMTdmMmY3ZDQ1NzJjNDRmOTBmNzZjNDgxOWE3MTQifX19"), "Golem", "&7&oI am your guard."),
    ENDERMAN(ItemFactory.createSkull("N2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0="), "Enderman", "&7&oNow I am here, now I am there."),
    MARIO(ItemFactory.createSkull("ZGJhOGQ4ZTUzZDhhNWE3NTc3MGI2MmNjZTczZGI2YmFiNzAxY2MzZGU0YTliNjU0ZDIxM2Q1NGFmOTYxNSJ9fX0="), "Mario", "&7&oIt is me! Mario!"),
    LUIGI(ItemFactory.createSkull("ZmYxNTMzODcxZTQ5ZGRhYjhmMWNhODJlZGIxMTUzYTVlMmVkMzc2NGZkMWNlMDI5YmY4MjlmNGIzY2FhYzMifX19"), "Luigi", "&7&oLuigi time!"),
    BATMAN(ItemFactory.createSkull("ZjI1NmY3MTczNWVmNDU4NTgxYzlkYWNmMzk0MTg1ZWVkOWIzM2NiNmVjNWNkNTk0YTU3MTUzYThiNTY2NTYwIn19fQ=="), "Batman", "&7&oI am batman!"),
    CHEST(ItemFactory.createSkull("NmY2OGQ1MDliNWQxNjY5Yjk3MWRkMWQ0ZGYyZTQ3ZTE5YmNiMWIzM2JmMWE3ZmYxZGRhMjliZmM2ZjllYmYifX19"), "Chest", "&7&oOpen, and close"),
    SKULL(ItemFactory.createSkull("MTFmNTRmZjliYjQyODUxOTEyYWE4N2ExYmRhNWI3Y2Q5ODE0Y2NjY2ZiZTIyNWZkZGE4ODdhZDYxODBkOSJ9fX0="), "Skull", "&7&oWho iss headless now?"),
    GHOST(ItemFactory.createSkull("NjhkMjE4MzY0MDIxOGFiMzMwYWM1NmQyYWFiN2UyOWE5NzkwYTU0NWY2OTE2MTllMzg1NzhlYTRhNjlhZTBiNiJ9fX0="), "Ghost", "&7&o2spooky4u"),
    JACKOLANTERN(ItemFactory.createSkull("MDI4OWQ0YjRjOTYyOTU5MTVmMDY4Yjk5YzI3ZDM5NDI3M2Y5ZjI2NGZjOTY4YzVkNWM0N2RmMmY1YmUyIn19fQ=="), "JackOLantern", "&7&oA little pumkin"),
    SCARYCLOW(ItemFactory.createSkull("ODZkYmMxZGViYzU3NDM4YTVkZTRiYTkxNTE1MTM4MmFiYzNkOGYxMzE4ZTJhMzVlNzhkZmIzMGYwNGJjNDY3In19fQ=="), "ScaryClown", "&7&oHope you are not scared of clowns."),
    SANTA(ItemFactory.createSkull("MmQ2MWNjYmZkY2RmODk0MWFkYWY3NmM2YzBlMDE4MmQyYzhiYmI1ZGMxOGYzNzQ4OTU2NTJiYzY2MWI2ZWQifX19"), "Santa", "&7&oOh oh oh! Merry Christmas!"),
    SNOWMAN(ItemFactory.createSkull("OThlMzM0ZTRiZWUwNDI2NDc1OWE3NjZiYzE5NTVjZmFmM2Y1NjIwMTQyOGZhZmVjOGQ0YmYxYmIzNmFlNiJ9fX0="), "Snowman", "&7&oI don't have a skull.. or bones"),
    PRESENT(ItemFactory.createSkull("ZjBhZmE0ZmZmZDEwODYzZTc2YzY5OGRhMmM5YzllNzk5YmNmOWFiOWFhMzdkODMxMjg4MTczNDIyNWQzY2EifX19"), "Present", "&7&oFrom Santa, to you!"),
    ELF(ItemFactory.createSkull("ODJhYjZjNzljNjNiODMzNGIyYzAzYjZmNzM2YWNmNjFhY2VkNWMyNGYyYmE3MmI3NzdkNzdmMjhlOGMifX19"), "Elf", "&7&oI work for Santa!");

    /**
     * STATIC list of all the enabled hats.
     */
    public static List<Hat> enabled = new ArrayList<>();

    /**
     * Config path name.
     */
    private String configName;

    /**
     * The Hat ItemStack
     */
    private ItemStack itemStack;

    /**
     * The required permission of the Hat.
     */
    private String permission;

    /**
     * The Hat Description (in menu).
     */
    private String description;

    Hat(ItemStack itemStack, String configName, String defaultDesc) {
        this.itemStack = itemStack;
        this.configName = configName;
        this.permission = configName.toLowerCase();
        if (SettingsManager.getConfig().get("Hats." + configName + ".Description") == null) {
            this.description = defaultDesc;
            UltraCosmetics.config.addDefault("Hats." + configName + ".Description", getColoredDescription(), "description of this hat.");
        } else {
            this.description = fromList(((List<String>) SettingsManager.getConfig().get("Hats." + configName + ".Description")));
        }
    }

    /**
     * Gets the Hat Description, with colors.
     *
     * @return the Hat Description, with colors.
     */
    public List<String> getColoredDescription() {
        return Arrays.asList(description.split("\n"));
    }

    /**
     * The Hat Description without colors.
     *
     * @return The Hat Description without colors.
     */
    public List<String> getDescription() {
        List<String> desc = new ArrayList<>();
        for (String string : description.split("\n")) {
            desc.add(string.replace('&', '§'));
        }
        return desc;
    }

    /**
     * Checks if hat should show its description in Hats Menu.
     *
     * @return {@code true} if hat should show its description in Hats Menu, {@code false} otherwise.
     */
    public boolean showsDescription() {
        return SettingsManager.getConfig().getBoolean("Hats." + configName + ".Show-Description");
    }

    /**
     * Checks if hat can be found in Treasure Chests.
     *
     * @return {@code true} if hat can be found in treasure chests, {@code false} otherwise.
     */
    public boolean canBeFound() {
        return SettingsManager.getConfig().getBoolean("Hats." + configName + ".Can-Be-Found-In-Treasure-Chests");
    }

    /**
     * Converts The description from a String List to a String.
     *
     * @param description The Description as a List.
     * @return The Description as a String.
     */
    private String fromList(List<String> description) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < description.size(); i++) {
            stringBuilder.append(description.get(i) + (i < description.size() - 1 ? "\n" : ""));
        }
        return stringBuilder.toString();
    }

    /**
     * Gets the hat permission.
     *
     * @return the required hat permission.
     */
    public String getPermission() {
        return "ultracosmetics.hats." + permission;
    }

    /**
     * Gets the config path name.
     *
     * @return the config path name.
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * Checks if the Hat is enabled.
     *
     * @return {@code true} if it is enabled, otherwise {@code false}.
     */
    public boolean isEnabled() {
        return SettingsManager.getConfig().getBoolean("Hats." + configName + ".Enabled");
    }

    /**
     * Gets the Hat ItemStack.
     *
     * @return the Hat ItemStack.
     */
    public ItemStack getItemStack() {
        return itemStack;
    }

    /**
     * Gets the Hat Name (in Menu).
     *
     * @return the Hat Name (in Menu).
     */
    public String getName() {
        return MessageManager.getMessage("Hats." + configName + ".Name");
    }

    /**
     * Gets the list of all the enabled hats.
     *
     * @return the list of all the enabled hats.
     */
    public static List<Hat> enabled() {
        return enabled;
    }

}
