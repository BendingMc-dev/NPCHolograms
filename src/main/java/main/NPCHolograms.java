package main;

import de.oliver.fancyholograms.api.FancyHologramsPlugin;
import net.citizensnpcs.Citizens;
import net.citizensnpcs.api.CitizensAPI;
import org.betonquest.betonquest.BetonQuest;
import org.betonquest.betonquest.api.logger.BetonQuestLoggerFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;



public final class NPCHolograms extends JavaPlugin {

    @Override
    public void onEnable() {
        // Runs other classes
        getServer().getPluginManager().registerEvents(new NPCInteract(), this);
        // Variables to check if APIS are running
        FancyHologramsPlugin hologramsLoaded = FancyHologramsPlugin.get();

        BetonQuest instance = BetonQuest.getInstance();

        Plugin citizensInstance = CitizensAPI.getPlugin();
        // Logs to make sure API has loaded.
        if(CitizensAPI.getPlugin().isEnabled())
            getLogger().info("Citizens API has loaded! " + citizensInstance);
        else
            getLogger().info("Citizens API hasn't loaded! " + citizensInstance);
        if(hologramsLoaded == null)
            getLogger().info("Fancy Holograms API has not loaded: " + hologramsLoaded);
        else
            getLogger().info("Fancy Holograms API has loaded: " + hologramsLoaded);
        if (instance == null)
            getLogger().info("BetonQuest has not loaded: " + instance);
        else
            getLogger().info("BetonQuest api has loaded: "  + instance); {
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("NPCHolograms has been disabled!");
    }
}
