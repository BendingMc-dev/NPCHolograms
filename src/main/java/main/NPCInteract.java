package main;



import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;
import org.betonquest.betonquest.BetonQuest;
import org.betonquest.betonquest.compatibility.citizens.CitizensConversation;
import org.betonquest.betonquest.conversation.Conversation;
import org.betonquest.betonquest.quest.event.conversation.ConversationEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class NPCInteract implements Listener {
    @EventHandler
    public void NPCInteractStart(NPCRightClickEvent event) {
        NPC npc = event.getNPC();
        Player player = event.getClicker();
        String npcName = npc.getFullName();
        Location npcLocation = npc.getStoredLocation();
        if(npc != null)
            player.sendRawMessage("I just interacted with " + npcName + "! Jack is located at " + npcLocation + "!");
        Bukkit.getLogger().info("NPC:" + npc + "Player:" + player);
        }
        public void NPCDialogue(CitizensConversation citizensConversation) {
        //    Conversation conversation = Conversation.getConversation();
            }

        }

// Interact -> Identify if it's a BQ npc!
