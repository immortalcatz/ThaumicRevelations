package mortvana.thaumrev.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

import mortvana.melteddashboard.lib.ThaumcraftLibrary;

import mortvana.thaumrev.library.ThaumRevLibrary;
import mortvana.thaumrev.network.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ThaumRevLibrary.MOD_ID, name = ThaumRevLibrary.MOD_NAME, version = ThaumRevLibrary.MOD_VERSION, dependencies = ThaumRevLibrary.MOD_DEPENDENCIES)
public class ThaumicRevelations {

	@Instance
	public static ThaumicRevelations instance;

	@SidedProxy(clientSide = "mortvana.thaumrev.network.ClientProxy", serverSide = "mortvana.thaumrev.network.CommonProxy", modId = ThaumRevLibrary.MOD_ID)
	public static CommonProxy proxy;

	// Move to Melted Dashboard Core once I have enough stuff to warrant creating it as a separate library.
	public static final Logger logger = LogManager.getLogger("Flux Gear");

	public static ThaumRevConfig config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		config = new ThaumRevConfig(event, "/Mortvana/ThaumicRevelations.cfg");
		proxy.initRenderers();
		//GuiHandler.init();
		//AspectInfusionHandler.init();
		ThaumRevContent.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ThaumRevContent.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ThaumcraftLibrary.init();
		ThaumRevContent.postInit();
	}
}
