package main;



import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class HologramCreate implements Listener {
    @EventHandler
    public void NPCInteractStart(NPCRightClickEvent event) {
        NPC npc = event.getNPC();
        Player player = event.getClicker();
        if(npc != null)
            player.sendRawMessage("I just interacted with an NPC!");
            Bukkit.getLogger().info("NPC:" + npc + "Player:" + player);
        }
    }

