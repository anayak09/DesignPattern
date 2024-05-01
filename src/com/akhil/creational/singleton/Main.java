package com.akhil.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("name", "Akhil");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
