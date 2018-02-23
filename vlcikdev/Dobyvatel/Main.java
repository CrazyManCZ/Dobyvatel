package vlcikdev.Dobyvatel;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import vlcikdev.Dobyvatel.memoryloaders.LanguageLoader;

public class Main extends JavaPlugin{
	
	public static Main instance;
	public static FileConfiguration mainConfig;
	
	public void onEnable() {
		System.out.println("Conqueror enabled. ");
		saveDefaultConfig();
		System.out.println("config.yml from Java archive was copied to config.yml in Conqueror data folder");
		instance = this;
		mainConfig = instance.getConfig();
		useLoaders();
	}

	private void useLoaders() {
		LanguageLoader.load();
	}
	
}
