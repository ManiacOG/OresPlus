
package net.mcreator.oreslite.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.oreslite.item.LedPickaxeItem;
import net.mcreator.oreslite.OresliteModElements;

@OresliteModElements.ModElement.Tag
public class OresLiteItemGroup extends OresliteModElements.ModElement {
	public OresLiteItemGroup(OresliteModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabores_lite") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LedPickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
