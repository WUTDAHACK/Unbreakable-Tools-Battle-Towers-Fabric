package wutdahack.unbreakabletoolsbattletowersfabric.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import wutdahack.unbreakabletoolsbattletowersfabric.impl.SetBonusTooltipAppender;

import java.util.List;

public class UnbreakableKeyArmorItem extends ArmorItem {
    public UnbreakableKeyArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public Text getName(ItemStack stack) {
        return new TranslatableText(this.getTranslationKey(stack)).formatted(Formatting.GOLD);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        if(world != null && world.isClient) {
            SetBonusTooltipAppender.appendKeyTooltip(stack, world, tooltip, context);
        }
    }

}
