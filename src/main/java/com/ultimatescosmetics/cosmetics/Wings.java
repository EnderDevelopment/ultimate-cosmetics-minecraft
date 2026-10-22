package com.ultimatescosmetics.cosmetics;

import org.bukkit.entity.Player;

public class Wings {

    public static void applyWings(Player player) {
        // Apply wings cosmetic to player
        player.sendMessage("Wings cosmetic applied!");
    }

    public static void removeWings(Player player) {
        // Remove wings cosmetic from player
        player.sendMessage("Wings cosmetic removed!");
    }
}