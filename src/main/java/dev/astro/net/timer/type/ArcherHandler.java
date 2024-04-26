package dev.astro.net.timer.type;

import dev.astro.net.timer.PlayerTimer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

public class ArcherHandler extends PlayerTimer implements Listener {

    public ArcherHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
