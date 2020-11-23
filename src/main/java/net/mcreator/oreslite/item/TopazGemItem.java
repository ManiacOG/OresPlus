
package net.mcreator.oreslite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.oreslite.itemgroup.OresLiteItemGroup;
import net.mcreator.oreslite.OresliteModElements;

@OresliteModElements.ModElement.Tag
public class TopazGemItem extends OresliteModElements.ModElement {
	@ObjectHolder("oreslite:topaz_gem")
	public static final Item block = null;
	public TopazGemItem(OresliteModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OresLiteItemGroup.tab).maxStackSize(64));
			setRegistryName("topaz_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
