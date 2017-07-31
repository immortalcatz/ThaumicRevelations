package mortvana.thaumrev.melteddashboard.lib;

import net.minecraft.block.Block;
import net.minecraft.item.*;

import thaumcraft.api.ItemApi;

public class ThaumcraftLibrary {

	private static boolean loaded = false;

	public static void init() {
		if (!loaded) {
			load();
		}
		loaded = true;
	}

	private static void load() {
		blockWoodenDevice = getBlock("blockWoodenDevice");

		itemGoggles = getItem("itemGoggles");

		itemChestRobe = getItem("itemChestRobe");
		itemLegsRobe = getItem("itemLegsRobe");
		itemBootsRobe = getItem("itemBootsRobe");

		itemThaumonomicon = getItem("itemThaumonomicon");
		itemThaumometer = getItem("itemThaumometer");

		itemResource = getItem("itemResource");
		itemShard = getItem("itemShard");
		itemNugget = getItem("itemNugget");

		planksGreatwood = new ItemStack(blockWoodenDevice, 1, 6);

		stackGoggles = new ItemStack(itemGoggles);

		stackChestRobe = new ItemStack(itemChestRobe);
		stackLegsRobe = new ItemStack(itemLegsRobe);
		stackBootsRobe = new ItemStack(itemBootsRobe);

		stackThaumonomicon = new ItemStack(itemThaumonomicon);
		stackThaumometer = new ItemStack(itemThaumometer);

		itemAlumentum = new ItemStack(itemResource, 1, 0);
		itemNitor = new ItemStack(itemResource, 1, 1);
		ingotThaumium = new ItemStack(itemResource, 1, 2);
		itemEnchantedFabric = new ItemStack(itemResource, 1, 7);
		dustSalisMundus = new ItemStack(itemResource, 1, 14);
		itemPrimalCharm = new ItemStack(itemResource, 1, 15);

		shardBalanced = new ItemStack(itemShard, 1, 6);

		itemQuicksilverDrop = new ItemStack(itemNugget, 1, 5);
	}

	public static Block getBlock(String field) {
		return ((ItemBlock) ItemApi.getBlock(field, 0).getItem()).field_150939_a;
	}

	public static Item getItem(String field) {
		return ItemApi.getItem(field, 0).getItem();
	}


	/** BLOCKS **/

	/** EQUIPMENT **/
	public static Item itemGoggles;
	/**public static Item itemHoverHarness;
	public static Item itemBootsTraveller;*/
	public static Item itemChestRobe;
	public static Item itemLegsRobe;
	public static Item itemBootsRobe;
	/**public static Item itemHelmetThaumium;
	public static Item itemChestThaumium;
	public static Item itemBootsThaumium;
	public static Item itemLegsThaumium;
	public static Item itemHelmetFortress;
	public static Item itemChestFortress;
	public static Item itemBootsFortress;
	public static Item itemLegsFortress;
	public static Item itemHelmetVoid;
	public static Item itemChestVoid;
	public static Item itemBootsVoid;
	public static Item itemLegsVoid;
	public static Item itemHelmetVoidRobe;
	public static Item itemChestVoidRobe;
	public static Item itemLegsVoidRobe;
	public static Item itemHelmetCultistRobe;
	public static Item itemChestCultistRobe;
	public static Item itemLegsCultistRobe;
	public static Item itemBootsCultist;
	public static Item itemHelmetCultistPlate;
	public static Item itemChestCultistPlate;
	public static Item itemLegsCultistPlate;
	public static Item itemHelmetCultistLeaderPlate;
	public static Item itemChestCultistLeaderPlate;
	public static Item itemLegsCultistLeaderPlate;

	public static Item itemPickThaumium;
	public static Item itemAxeThaumium;
	public static Item itemShovelThaumium;
	public static Item itemSwordThaumium;
	public static Item itemHoeThaumium;
	public static Item itemPickVoid;
	public static Item itemAxeVoid;
	public static Item itemShovelVoid;
	public static Item itemSwordVoid;
	public static Item itemHoeVoid;
	public static Item itemPickElemental;
	public static Item itemAxeElemental;
	public static Item itemShovelElemental;
	public static Item itemSwordElemental;
	public static Item itemHoeElemental;
	public static Item itemBowBone;
	public static Item itemSwordCrimson;
	public static Item itemPrimalCrusher;*/

	public static Item itemThaumonomicon;
	public static Item itemThaumometer;

	/**public static Item itemWandCasting;
	public static Item itemFocusPouch;
	public static Item itemFocusFire;
	public static Item itemFocusFrost;
	public static Item itemFocusShock;
	public static Item itemFocusTrade;
	public static Item itemFocusExcavation;
	public static Item itemFocusHellbat;
	public static Item itemFocusWarding;
	public static Item itemFocusPrimal;*/

	/** ITEMS **/
	public static Item itemResource;
	public static Item itemShard;
	public static Item itemNugget;

	/** ITEMSTACKS (BLOCK) **/
	public static ItemStack planksGreatwood;

	/** ITEMSTACKS (EQUIPMENT) **/
	public static ItemStack stackGoggles;

	public static ItemStack stackChestRobe;
	public static ItemStack stackLegsRobe;
	public static ItemStack stackBootsRobe;

	public static ItemStack stackThaumonomicon;
	public static ItemStack stackThaumometer;


	/** ITEMSTACKS (ITEM) **/
	public static ItemStack itemAlumentum;
	public static ItemStack itemNitor;
	public static ItemStack ingotThaumium;
	public static ItemStack itemEnchantedFabric;
	public static ItemStack dustSalisMundus;
	public static ItemStack itemPrimalCharm;

	public static ItemStack shardBalanced;

	public static ItemStack itemQuicksilverDrop;




	/**public static Item itemWandCap;
	public static Item itemWandRod;
	public static Item itemEssence;
	public static Item itemWispEssence;
	public static Item itemCrystalEssence;
	public static Item itemNuggetChicken;
	public static Item itemNuggetBeef;
	public static Item itemNuggetPork;
	public static Item itemNuggetFish;
	public static Item itemTripleMeatTreat;
	public static Item itemPhotoPlate;
	public static Item itemManaBean;
	public static Item itemZombieBrain;
	public static Item itemResearchNotes;
	public static Item itemInkwell;
	public static Item itemSpawnerEgg;
	public static Item itemFocusPortableHole;
	public static Item itemFocusPech;
	public static Item itemFlyingCarpet;
	public static Item itemGolemPlacer;
	public static Item itemGolemBell;
	public static Item itemGolemDecoration;
	public static Item itemGolemCore;
	public static Item itemGolemUpgrade;
	public static Item itemArcaneDoor;
	public static Item itemJarFilled;
	public static Item itemJarNode;
	public static Item itemKey;
	public static Item itemHandMirror;
	public static Item itemTrunkSpawner;
	public static Item itemResonator;
	public static Item itemBathSalts;
	public static Item itemBucketDeath;
	public static Item itemBucketPure;
	public static Item itemEldritchObject;
	public static Item itemSanitySoap;
	public static Item itemSanityChecker;
	public static Item itemBottleTaint;
	public static Item itemLootbag;
	public static Item itemBaubleBlanks;
	public static Item itemAmuletRunic;
	public static Item itemRingRunic;
	public static Item itemGirdleRunic;
	public static Item itemGirdleHover;
	public static Item itemAmuletVis;
	public static Item itemPrimalArrow;
	public static Item itemCompassStone;

	public static Block blockFluxGoo;
	public static Block blockFluxGas;
	public static Block blockFluidPure;
	public static Block blockFluidDeath;
	public static Block blockHole;
	public static Block blockArcaneFurnace;
	public static Block blockMetalDevice;
	public static Block blockMagicalLog;
	public static Block blockStoneDevice;*/
	public static Block blockWoodenDevice;
	/**public static Block blockMagicalLeaves;
	public static Block blockTable;
	public static Block blockChestHungry;
	public static Block blockCustomOre;
	public static Block blockCustomPlant;
	public static Block blockCandle;
	public static Block blockJar;
	public static Block blockArcaneDoor;
	public static Block blockWarded;
	public static Block blockLifter;
	public static Block blockAiry;
	public static Block blockCrystal;
	public static Block blockCosmeticOpaque;
	public static Block blockCosmeticSolid;
	public static Block blockMirror;
	public static Block blockTaint;
	public static Block blockTaintFibres;
	public static Block blockManaPod;
	public static Block blockTube;
	public static Block blockMagicBox;
	public static Block blockEldritch;
	public static Block blockEldritchPortal;
	public static Block blockEssentiaReservoir;
	public static Block blockStairsArcaneStone;
	public static Block blockStairsSilverwood;
	public static Block blockStairsGreatwood;
	public static Block blockStairsEldritch;
	public static Block blockSlabWood;
	public static Block blockSlabStone;
	public static Block blockDoubleSlabWood;
	public static Block blockDoubleSlabStone;
	public static Block blockEldritchNothing;
	public static Block blockAlchemyFurnace;
	public static Block blockLootUrn;
	public static Block blockLootCrate;*/
}