package dev.astro.net.user;

import org.bukkit.plugin.IllegalPluginAccessException;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;

public class ProfileManager {

    public void save(UUID uuid) throws IOException {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Profile getByUuid(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Profile getByName(String name) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Set<Profile> getOfflinePlayers() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
