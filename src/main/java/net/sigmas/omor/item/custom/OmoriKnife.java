package net.sigmas.omor.item.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
/* import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List; */

public class OmoriKnife extends SwordItem {

    public OmoriKnife(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    /* public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.omor.omori_knife"));
        appendTooltip(stack, world, tooltip, context);
    } */
}
