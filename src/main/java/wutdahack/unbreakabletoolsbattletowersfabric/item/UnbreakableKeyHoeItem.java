package wutdahack.unbreakabletoolsbattletowersfabric.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public class UnbreakableKeyHoeItem extends HoeItem {
    public UnbreakableKeyHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public Text getName(ItemStack stack) {
        return new TranslatableText(this.getTranslationKey(stack)).formatted(Formatting.GOLD);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
