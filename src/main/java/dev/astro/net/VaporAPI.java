package dev.astro.net;

import dev.astro.net.deathban.DeathbanManager;
import dev.astro.net.timer.TimerManager;
import dev.astro.net.user.ProfileManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class VaporAPI {

    public ProfileManager getProfileManager() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public TimerManager getTimerManager() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public DeathbanManager getDeathban(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isSpawn(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isWarzone(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isWilderness(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPlayerFaction(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isRoad(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isEvent(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isEndPortal(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isDTC(Location location) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
