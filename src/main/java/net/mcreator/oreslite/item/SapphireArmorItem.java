
package net.mcreator.oreslite.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.oreslite.itemgroup.OresLiteItemGroup;
import net.mcreator.oreslite.OresliteModElements;

@OresliteModElements.ModElement.Tag
public class SapphireArmorItem extends OresliteModElements.ModElement {
	@ObjectHolder("oreslite:sapphire_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("oreslite:sapphire_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("oreslite:sapphire_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("oreslite:sapphire_armor_boots")
	public static final Item boots = null;
	public SapphireArmorItem(OresliteModElements instance) {
		super(instance, 172);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 60;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{8, 24, 20, 8}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 36;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "sapphire_armor";
			}

			public float getToughness() {
				return 4.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(OresLiteItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "oreslite:textures/models/armor/sapphire_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("sapphire_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(OresLiteItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "oreslite:textures/models/armor/sapphire_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("sapphire_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(OresLiteItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "oreslite:textures/models/armor/sapphire_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("sapphire_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(OresLiteItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "oreslite:textures/models/armor/sapphire_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("sapphire_armor_boots"));
	}
}
