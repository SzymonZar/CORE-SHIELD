package pl.shieldcode.coreshield;


import org.bukkit.plugin.java.JavaPlugin;
import pl.shieldcode.coreshield.commands.*;

public final class CORE_SHIELD extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin CORE-SHIELD włącza się...");

        getCommand("gm").setExecutor(new GmCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("repair").setExecutor(new RepairCommand());
        getCommand("pomoc").setExecutor(new HelpCommand()); // Nieskonczone

    }

    @Override
    public void onDisable() {
        getLogger().severe("Plugin CORE-SHIELD wyłącza się...");
    }
}
