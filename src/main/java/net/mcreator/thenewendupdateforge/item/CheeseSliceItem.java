
package net.mcreator.thenewendupdateforge.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class CheeseSliceItem extends Item {
	public CheeseSliceItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
