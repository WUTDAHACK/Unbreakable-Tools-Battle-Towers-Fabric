package wutdahack.unbreakabletoolsbattletowersfabric.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UnbreakableBookItem extends Item {
    public UnbreakableBookItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }
}
