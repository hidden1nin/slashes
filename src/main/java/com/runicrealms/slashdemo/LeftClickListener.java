package com.runicrealms.slashdemo;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class LeftClickListener implements Listener {
    @EventHandler
    public void playerClick(PlayerInteractEvent playerInteractEvent) {
        if (playerInteractEvent.getAction() != Action.LEFT_CLICK_AIR&&playerInteractEvent.getAction()!=Action.LEFT_CLICK_BLOCK) return;
        if (playerInteractEvent.getItem() == null) return;
        if (playerInteractEvent.getItem().getType().toString().contains("SWORD")) {
            SlashEffect.slashHorizontal(playerInteractEvent.getPlayer());
        }
        if (playerInteractEvent.getItem().getType().toString().contains("AXE")) {
            SlashEffect.slashVertical(playerInteractEvent.getPlayer());
        }

    }
}
