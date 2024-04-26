package dev.astro.net.timer.type;

import dev.astro.net.timer.PlayerTimer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class SpawnTagHandler extends PlayerTimer implements Listener {

    public SpawnTagHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public long getTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void NoBreakInCombat(BlockBreakEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void NoPlaceInCombat(BlockPlaceEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onEntityDamageByEntityLunar(EntityDamageByEntityEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
