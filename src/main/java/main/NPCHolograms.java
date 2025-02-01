package main;

import de.oliver.fancyholograms.api.FancyHologramsPlugin;
import org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory;
import org.bukkit.plugin.java.JavaPlugin;

public final class NPCHolograms extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new NPCInteract(), this);


        FancyHologramsPlugin hologramsLoaded = FancyHologramsPlugin.get();
        BetonQuestLoggerFactory loggerFactory = getServer().getServicesManager().load(BetonQuestLoggerFactory.class);
        if(hologramsLoaded == null)
            getLogger().info("Fancy Holograms API has not loaded." + hologramsLoaded);
        else
            getLogger().info("Fancy Holograms API has loaded:" + hologramsLoaded);
        if (loggerFactory == null)
            getLogger().info("BetonQuest has not loaded!" + loggerFactory);
        else
            getLogger().info("BetonQuest api has loaded!" + loggerFactory); {
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NPCHolograms has been disabled!");
    }
}
