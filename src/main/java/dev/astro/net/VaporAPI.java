package dev.astro.net;

import dev.astro.net.deathban.DeathbanManager;
import dev.astro.net.timer.TimerManager;
import dev.astro.net.user.ProfileManager;
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
}
