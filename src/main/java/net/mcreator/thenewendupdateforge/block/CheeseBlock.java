
package net.mcreator.thenewendupdateforge.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.thenewendupdateforge.init.TheNewEndUpdateForgeModItems;

import java.util.List;
import java.util.Collections;

public class CheeseBlock extends Block {
	public CheeseBlock() {
		super(BlockBehaviour.Properties.of(Material.SPONGE).sound(SoundType.SLIME_BLOCK).strength(1f, 10f));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheNewEndUpdateForgeModItems.CHEESE_SLICE.get(), 2));
	}
}
