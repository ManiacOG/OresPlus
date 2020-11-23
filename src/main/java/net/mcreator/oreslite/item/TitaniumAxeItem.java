
package net.mcreator.oreslite.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.oreslite.itemgroup.OresLiteItemGroup;
import net.mcreator.oreslite.OresliteModElements;

@OresliteModElements.ModElement.Tag
public class TitaniumAxeItem extends OresliteModElements.ModElement {
	@ObjectHolder("oreslite:titanium_axe")
	public static final Item block = null;
	public TitaniumAxeItem(OresliteModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(OresLiteItemGroup.tab)) {
		}.setRegistryName("titanium_axe"));
	}
}
