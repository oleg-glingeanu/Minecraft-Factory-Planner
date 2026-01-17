package github.olegglingeanu.factoryplanner;

import github.olegglingeanu.factoryplanner.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FactoryPlanner.MODID)
public class FactoryPlanner {

    public static final String MODID = "factoryplanner";

    public FactoryPlanner(FMLJavaModLoadingContext context){

        IEventBus modEventBus = context.getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
    }

}
