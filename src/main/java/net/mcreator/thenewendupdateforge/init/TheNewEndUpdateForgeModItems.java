
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewendupdateforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thenewendupdateforge.item.CheeseSliceItem;
import net.mcreator.thenewendupdateforge.TheNewEndUpdateForgeMod;

public class TheNewEndUpdateForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheNewEndUpdateForgeMod.MODID);
	public static final RegistryObject<Item> CHEESE_SLICE = REGISTRY.register("cheese_slice", () -> new CheeseSliceItem());
	public static final RegistryObject<Item> CHEESE = block(TheNewEndUpdateForgeModBlocks.CHEESE, CreativeModeTab.TAB_FOOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
