package fr.hybridetv.oldpvp.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import fr.hybridetv.oldpvp.OldPvpMain;

public class OffHandEvent implements Listener {
	
	private OldPvpMain pl;

	public OffHandEvent(OldPvpMain pl) {
		this.pl = pl;
	}

    @EventHandler
    public void onSwapHandItems(PlayerSwapHandItemsEvent e) {
    	if(e.getOffHandItem() != null) {
    		e.setCancelled(true);
    	}
    }
	
    @EventHandler
    public void onClick(InventoryClickEvent e) {
    	//if(e.getInventory().getType() != InventoryType.CRAFTING) {
    		if (e.getSlot() == 40) {
    			if (e.getInventory().getType() == InventoryType.CRAFTING) {
    		      e.setCancelled(true); 
    		  }
    			else {
    				e.setCancelled(false);
    			}
    		}
    		else {
				e.setCancelled(false);
			}
    	}
    		
	
	 @EventHandler
	    public void onMove(PlayerMoveEvent e) {
	        Player p = e.getPlayer();
	        if((p.getInventory().getItemInOffHand() != null) && (p.getInventory().getItemInOffHand().getType() != Material.AIR)) {
	                p.getWorld().dropItem(p.getLocation(), p.getInventory().getItemInOffHand());
	                p.getInventory().setItemInOffHand(null);
	            }
	        }
}
