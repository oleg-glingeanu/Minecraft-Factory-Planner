package github.olegglingeanu.factoryplanner.init;

import github.olegglingeanu.factoryplanner.FactoryPlanner;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FactoryPlanner.MODID);
    public static final RegistryObject<Item> ATOMIC_BOMB = ITEMS.register("atomic_bomb",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(20)
                            .saturationMod(20)
                            .effect(
                                    () -> new MobEffectInstance(MobEffects.ABSORPTION,
                                            200,
                                            4),
                                    1.0f)
                            .build())));
}
