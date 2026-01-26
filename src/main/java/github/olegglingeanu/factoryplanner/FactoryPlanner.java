package github.olegglingeanu.factoryplanner;

import github.olegglingeanu.factoryplanner.init.ItemInit;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraftforge.client.event.RecipesUpdatedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.server.ServerStartedEvent;


import java.util.ArrayList;
import java.util.List;

@Mod(FactoryPlanner.MODID)
public class FactoryPlanner {

    public static final String MODID = "factoryplanner";

    public static List<Recipe<?>> r = new ArrayList<>();


    public FactoryPlanner(FMLJavaModLoadingContext context){

        IEventBus modEventBus = context.getModEventBus();
        ItemInit.ITEMS.register(modEventBus);

        r.clear();

    }

    @Mod.EventBusSubscriber(modid = MODID)
    public static class ForgeEvents{
        @SubscribeEvent
        public static void onRecipeUpdated(RecipesUpdatedEvent event){
            RecipeManager manager = event.getRecipeManager();
            manager.getRecipes().forEach((recipe) -> {
                // client-side usage
                r.add(recipe);
            }

            );

            System.out.println("Loaded recipes:" + r.size());
        }
    }




}
