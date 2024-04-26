package dev.astro.net.deathban;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class DeathbanManager {

    public Deathban applyDeathBan(Player player, String reason) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Deathban applyDeathBan(UUID uuid, Deathban deathban) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
