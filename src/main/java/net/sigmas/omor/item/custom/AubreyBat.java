package net.sigmas.omor.item.custom;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.AxeItem;

/* import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List; */

public class AubreyBat extends AxeItem {
    public AubreyBat(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

/*    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.omor.aubrey_bat"));
        appendTooltip(stack, world, tooltip, context);
    } */
}
