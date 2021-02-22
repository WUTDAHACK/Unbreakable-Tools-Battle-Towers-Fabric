package wutdahack.unbreakabletoolsbattletowersfabric.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UnbreakableKeyToolMaterial implements ToolMaterial {
    public static final UnbreakableKeyToolMaterial INSTANCE = new UnbreakableKeyToolMaterial();

    @Override
    public int getDurability() {
        return 1750;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }
}
