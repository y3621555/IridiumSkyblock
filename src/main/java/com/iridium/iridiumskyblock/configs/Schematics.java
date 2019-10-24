package com.iridium.iridiumskyblock.configs;

import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public class Schematics {
    public List<FakeSchematic> schematics = Arrays.asList(new FakeSchematic("island.schematic", "", Material.GRASS, "&b&lDefault Island", Arrays.asList("&7The default island")));

    public static class FakeSchematic {
        public String name;
        public String permission;
        public Material item;
        public String displayname;
        public List<String> lore;

        public FakeSchematic(String name, String permission, Material item, String displayname, List<String> lore) {
            this.name = name;
            this.permission = permission;
            this.item = item;
            this.displayname = displayname;
            this.lore = lore;
        }
    }
}