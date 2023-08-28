
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thenewendupdateforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thenewendupdateforge.block.NewEndBiomePortalBlock;
import net.mcreator.thenewendupdateforge.block.CheeseBlock;
import net.mcreator.thenewendupdateforge.TheNewEndUpdateForgeMod;

public class TheNewEndUpdateForgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheNewEndUpdateForgeMod.MODID);
	public static final RegistryObject<Block> CHEESE = REGISTRY.register("cheese", () -> new CheeseBlock());
	public static final RegistryObject<Block> NEW_END_BIOME_PORTAL = REGISTRY.register("new_end_biome_portal", () -> new NewEndBiomePortalBlock());
}
