package dev.astro.net.timer.type;

import dev.astro.net.timer.PlayerTimer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

public class AppleHandler extends PlayerTimer implements Listener {

    public AppleHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerConsume(PlayerItemConsumeEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
