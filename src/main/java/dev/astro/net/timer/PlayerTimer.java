package dev.astro.net.timer;

import com.google.common.base.Predicate;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public abstract class PlayerTimer extends Timer {

    public PlayerTimer(String name, long defaultCooldown) {
        this(name, defaultCooldown, true);
    }

    public PlayerTimer(String name, long defaultCooldown, boolean persistable) {
        super(name, defaultCooldown);
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void clearCooldown(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasTimer(Player player, Timer timerType) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPaused(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPaused(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setPaused(UUID playerUUID, boolean paused) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasCooldown(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasCooldown(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getRemaining(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getRemaining(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID, long duration, boolean overwrite) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID, long duration, boolean overwrite, Predicate<Long> currentCooldownPredicate) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
