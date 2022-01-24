package ca.naln1.rainflake.babyspiders;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ca.naln1.rainflake.babyspiders.entities.BabySpiderEntity;
import ca.naln1.rainflake.babyspiders.entities.BabySpiderRenderer;
import ca.naln1.rainflake.babyspiders.items.BabySpiderSpawnEgg;

@Mod(BabySpiders.MOD_ID)
public class BabySpiders
{
    public static final String MOD_ID = "babyspiders";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MOD_ID);

    //increasing hitbox size increases render distance; (0.7, 0.12) renders from ~50blocks away in a straight line
    public static final RegistryObject<BabySpiderSpawnEgg> BSSE = ITEMS.register("bsse", BabySpiderSpawnEgg::new);
    public static final RegistryObject<EntityType<BabySpiderEntity>> BABY_SPIDER = ENTITIES.register("baby_spider", () -> EntityType.Builder.of(BabySpiderEntity::new, EntityClassification.MONSTER)
                    .sized(0.7f, 0.2f)
                    .clientTrackingRange(8)
                    .build("baby_spider"));

    public BabySpiders() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        //register mob spawning on the Forge event bus, not the mod event bus
        MinecraftForge.EVENT_BUS.addListener(this::spawnMob);


        ENTITIES.register(eventBus);
        ITEMS.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            EntitySpawnPlacementRegistry.register(BABY_SPIDER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::checkMonsterSpawnRules);
        });
    }

    //@SubscribeEvent
    public void spawnMob(final BiomeLoadingEvent event){
        event.getSpawns().addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(BABY_SPIDER.get(), 100,3,5));
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(BABY_SPIDER.get(), BabySpiderRenderer::new);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerAttributes(EntityAttributeCreationEvent event) {
            event.put(BABY_SPIDER.get(), BabySpiderEntity.prepareAttributes().build());
        }
        @SubscribeEvent
        public static void onItemColor(ColorHandlerEvent.Item event) {
            event.getItemColors().register((stack, i) -> BabySpiderSpawnEgg.getColor(i), BabySpiders.BSSE.get());
        }
    }
}
