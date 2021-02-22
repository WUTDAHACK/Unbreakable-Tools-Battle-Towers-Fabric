package wutdahack.unbreakabletoolsbattletowersfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wutdahack.unbreakabletoolsbattletowersfabric.item.*;
import wutdahack.unbreakabletoolsbattletowersfabric.material.UnbreakableKeyArmorMaterial;
import wutdahack.unbreakabletoolsbattletowersfabric.material.UnbreakableKeyToolMaterial;

public class UnbreakableToolsBattleTowers implements ModInitializer {

    public static final ItemGroup UNBREAKABLE_BATTLE_TOWERS_GROUP = FabricItemGroupBuilder.build(new Identifier("unbreakabletoolsbattletowersfabric", "unbreakabletoolsbattletowers_group"), () -> new ItemStack(Items.ENCHANTED_BOOK));

    public static final Item UNBREAKABLE_KEY_AXE = new UnbreakableKeyAxeItem(UnbreakableKeyToolMaterial.INSTANCE, 9, -3.0F, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_HOE = new UnbreakableKeyHoeItem(UnbreakableKeyToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_PICKAXE = new UnbreakableKeyPickaxeItem(UnbreakableKeyToolMaterial.INSTANCE, 5, 2.8F, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_SHOVEL = new UnbreakableKeyShovelItem(UnbreakableKeyToolMaterial.INSTANCE, 4, -3.0F, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_SWORD = new UnbreakableKeySwordItem(UnbreakableKeyToolMaterial.INSTANCE, 8, -2.4F, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));

    public static final Item UNBREAKABLE_KEY_HELMET = new UnbreakableKeyArmorItem(UnbreakableKeyArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_CHESTPLATE = new UnbreakableKeyArmorItem(UnbreakableKeyArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_LEGGINGS = new UnbreakableKeyArmorItem(UnbreakableKeyArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));
    public static final Item UNBREAKABLE_KEY_BOOTS = new UnbreakableKeyArmorItem(UnbreakableKeyArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().maxDamage(-2147483648).group(UNBREAKABLE_BATTLE_TOWERS_GROUP));

    public static UnbreakableBookItem UNBREAKABLE_BOOK = new UnbreakableBookItem(new Item.Settings().group(UNBREAKABLE_BATTLE_TOWERS_GROUP).maxCount(1).maxDamage(-2147483648));

    private static final Identifier ABANDONED_MINESHAFT_LOOT_TABLE_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BURIED_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_LOOT_TABLE_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SHIPWRECK_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON_LOOT_TABLE_ID = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_LIBRARY_LOOT_TABLE_ID = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier TREASURE_FISHING_LOOT_TABLE_ID = new Identifier("minecraft", "gameplay/fishing/treasure");



    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_axe"), UNBREAKABLE_KEY_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_hoe"), UNBREAKABLE_KEY_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_pickaxe"), UNBREAKABLE_KEY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_shovel"), UNBREAKABLE_KEY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_sword"), UNBREAKABLE_KEY_SWORD);

        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_helmet"), UNBREAKABLE_KEY_HELMET);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_chestplate"), UNBREAKABLE_KEY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_leggings"), UNBREAKABLE_KEY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_key_boots"), UNBREAKABLE_KEY_BOOTS);


        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsbattletowersfabric", "unbreakable_book"), UNBREAKABLE_BOOK);

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (ABANDONED_MINESHAFT_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (BURIED_TREASURE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(5)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (DESERT_PYRAMID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 4.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (JUNGLE_TEMPLE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 6.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SHIPWRECK_TREASURE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(3.0F, 6.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(5)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SIMPLE_DUNGEON_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(1.0F, 3.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (STRONGHOLD_LIBRARY_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 10.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });


        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (TREASURE_FISHING_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                                .weight(10)
                                .build());

                supplier.withPool(poolBuilder.build());
            }
        });

    }
}
