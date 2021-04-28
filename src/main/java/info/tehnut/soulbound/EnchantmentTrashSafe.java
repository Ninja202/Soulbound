package info.tehnut.soulbound;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class EnchantmentTrashSafe extends Enchantment{
    public EnchantmentTrashSafe() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.BREAKABLE, EquipmentSlot.values());
    }

    @Override
    public int getMinPower(final int level) {
        return level * 25;
    }

    @Override
    public int getMaxPower(final int level) {
        return this.getMinPower(level) + 50;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return true;
    }
}
