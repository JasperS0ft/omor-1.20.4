package net.sigmas.omor.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sigmas.omor.entity.custom.KelBallProjectileEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class KelBall extends Item {
    public KelBall(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(
                null,
                user.getX(),
                user.getY(),
                user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL,
                0.5F,
                0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
        );
        user.getItemCooldownManager().set(this, 60);
        if (!world.isClient) {
            KelBallProjectileEntity kelBallProjectileEntity = new KelBallProjectileEntity(user, world);
            kelBallProjectileEntity.setItem(itemStack);
            kelBallProjectileEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1F, 1.0F);
            world.spawnEntity(kelBallProjectileEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.omor.kel_ball"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
