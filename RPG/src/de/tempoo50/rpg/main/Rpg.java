package de.tempoo50.rpg.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.tempoo50.rpg.commands.*;
import de.tempoo50.rpg.files.*;
import de.tempoo50.rpg.listener.*;
import de.tempoo50.rpg.utils.*;

public class Rpg extends JavaPlugin {
	
	private static Rpg inctance;
	private static Rpg plugin;
	
	public static BelohnungsManager belohnungsmanager;
	
	public void onEnable() {
		
		inctance = this;
		plugin = this;
		
		Rpg.belohnungsmanager = new BelohnungsManager();
		
		try {
			
			loadTimer();
            loadFile();
            loadCommands();
            loadListener(Bukkit.getPluginManager());
            loadShop();
           
        }catch (Exception e1) {
        	
            e1.printStackTrace();
            log("§4Fehler: §cPlugin konnte nicht geladen werden.");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
            
        }finally {
        	
            log("§aPlugin geladen.");
            log("§agecodet von Tempoo50.");
            
       }
		
	}
	
	private void loadFile() {
		
		MobNamefile.loadMobs();
		PermissionFile.loadPermission();
		RespawnFile.loadrespwn();
		ItemFile.loadShop();
		TablistFile.loadFile();
		ScoreboardFile.loadFile();
		SpawnFile.loadSpawn();
		ChatFile.loadChatSystem();
		CommandBlockerFile.loadBlocker();
		MessagesFile.loadMessage();
		ServerLinkFile.loadFile();
		FileManagerBelohnung.setDefault();
		
	}
	
	private void loadCommands() {
		
		getCommand("cow").setExecutor(new CowCommand());
		getCommand("zombie").setExecutor(new ZombieCommand());
		getCommand("witch").setExecutor(new WitchCommand());
		getCommand("pig").setExecutor(new PigCommand());
		getCommand("skelett").setExecutor(new SkelettCommand());
		getCommand("spider").setExecutor(new SpiderCommand());
		getCommand("giant").setExecutor(new GiantCommand());
		getCommand("villager").setExecutor(new VillagerCommand());
		getCommand("evoker").setExecutor(new EvokerCommand());
		getCommand("slime").setExecutor(new SlimeCommand());
		getCommand("creeper").setExecutor(new CreeperCommand());
		getCommand("wither").setExecutor(new WitherCommand());
		getCommand("blaze").setExecutor(new BlazeCommand());
		getCommand("illi").setExecutor(new IllusionerCommand());
		getCommand("vindi").setExecutor(new VindicatorCommand());
		getCommand("vex").setExecutor(new VexCommand());
		getCommand("stray").setExecutor(new StrayCommand());
		getCommand("setrespawn").setExecutor(new SetResoawnCommand());
		getCommand("setspawn").setExecutor(new SetSpawnCommand());
		getCommand("spawn").setExecutor(new SpawnCommand());
		getCommand("home").setExecutor(new HomeCommand());
		getCommand("sethome").setExecutor(new SetHomeCommand());
		getCommand("delhome").setExecutor(new DelHomeCommand());
		getCommand("blacklist").setExecutor(new BlacklistCommand());
		getCommand("tp").setExecutor(new TpCommand());
		getCommand("msg").setExecutor(new MsgCommand());
		getCommand("r").setExecutor(new RCommand());
		getCommand("cc").setExecutor(new ChatClearCommand());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("ec").setExecutor(new EcCommand());
		getCommand("day").setExecutor(new DayCommand());
		getCommand("night").setExecutor(new NightCommand());
		getCommand("rundruf").setExecutor(new BroadcastCommand());
		getCommand("twitter").setExecutor(new TwitterCommand());
		getCommand("forum").setExecutor(new ForumCommand());
		getCommand("web").setExecutor(new WebCommand());
		getCommand("vote").setExecutor(new VoteCommand());
		getCommand("ts").setExecutor(new TsCommand());
		getCommand("insta").setExecutor(new InstaCommand());
		getCommand("shop").setExecutor(new ShopCommand());
		getCommand("yt").setExecutor(new YtCommand());
		getCommand("fb").setExecutor(new FbCommand());
		getCommand("belohnung").setExecutor(new BelohnungsCommand());
		
	}
	
	private void loadListener(PluginManager pm) {
		
		pm.registerEvents(new KillZombie(this), this);
		pm.registerEvents(new KillWitch(this), this);
		pm.registerEvents(new KillPig(this), this);
		pm.registerEvents(new KillCow(this), this);
		pm.registerEvents(new KillSkelett(this), this);
		pm.registerEvents(new KillChicken(), this);
		pm.registerEvents(new KillSpider(this), this);
		pm.registerEvents(new KillGiant(this), this);
		pm.registerEvents(new KillVillager(), this);
		pm.registerEvents(new ShopInteract(), this);
		pm.registerEvents(new VillagerInteract(), this);
		pm.registerEvents(new KillEvoker(this), this);
		pm.registerEvents(new KillSlime(this), this);
		pm.registerEvents(new KillBlaze(this), this);
		pm.registerEvents(new KillIllusioner(this), this);
		pm.registerEvents(new KillCreeper(this), this);
		pm.registerEvents(new KillWither(this), this);
		pm.registerEvents(new KillWitherSkelett(), this);
		pm.registerEvents(new KillVindicator(this), this);
		pm.registerEvents(new KillVex(this), this);
		pm.registerEvents(new QuitListener(), this);
		pm.registerEvents(new CommandBlocker(), this);
		pm.registerEvents(new RespawnListener(), this);
		pm.registerEvents(new TabCompleteListener(), this);
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new DeathListener(), this);
		pm.registerEvents(new ChatListener(this), this);
		pm.registerEvents(new BlacklistCommand(), this);
		pm.registerEvents(new SignListener(), this);
		
	}
	
	private void loadShop() {
		
		ShopManager.ShopInv = Bukkit.createInventory(null, 9*2, "§aShop");
		ShopManager.BowInv = Bukkit.createInventory(null, 9*3, "§aBögen");
		ShopManager.SwordInv = Bukkit.createInventory(null, 9*3, "§aSchwerter");
		ShopManager.AxeInv = Bukkit.createInventory(null, 9*3, "§aÄxte");
		ShopManager.ShieldInv = Bukkit.createInventory(null, 9*3, "§aSchilde");
		ShopManager.ArmorInv = Bukkit.createInventory(null, 9*3, "§aRüstungen");
		ShopManager.SpezialInv = Bukkit.createInventory(null, 9*3, "§aSpezial");
		
	}
	
	public void loadTimer() {
		
		new RunUtil(this).startScoreboard();
		new RunUtil(this).startBroadcaster();
		
	}
	
	public static Rpg getPlugin() {
		return plugin;
		
    }
	
	public static Rpg getInctance() {
		return inctance;
	}
	
	   public static void log(String msg){
	        Bukkit.getConsoleSender().sendMessage(msg);
	    }
	    
	    public static void logs(final String message){
	        Bukkit.getConsoleSender().sendMessage(message);
	    }

}
