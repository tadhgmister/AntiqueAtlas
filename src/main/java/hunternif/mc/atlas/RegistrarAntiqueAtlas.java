package hunternif.mc.atlas;

import hunternif.mc.atlas.item.ItemAtlas;
import hunternif.mc.atlas.item.ItemEmptyAtlas;
import hunternif.mc.atlas.item.RecipeAtlasCloning;
import hunternif.mc.atlas.item.RecipeAtlasCombining;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistrarAntiqueAtlas {
    // TODO FABRIC itemgroups
    public static final ItemEmptyAtlas EMPTY_ATLAS = new ItemEmptyAtlas(new Item.Settings());
    public static final ItemAtlas ATLAS = new ItemAtlas(new Item.Settings().stackSize(1));

    public static void register() {
        if (SettingsConfig.gameplay.itemNeeded) {
            Registry.register(Registry.ITEM, new Identifier("antiqueatlas:empty_antique_atlas"), EMPTY_ATLAS);
            Registry.register(Registry.ITEM, new Identifier("antiqueatlas:antique_atlas"), ATLAS);
        }
        /* if (SettingsConfig.gameplay.itemNeeded) {
            event.getRegistry().register(new ShapelessOreRecipe(new Identifier(AntiqueAtlasMod.ID, "atlas"), new ItemStack(EMPTY_ATLAS), aud.XX_1_13_2_aS_XX, aud.XX_1_13_2_aX_XX).setRegistryName("atlas_blank"));
            event.getRegistry().register(new RecipeAtlasCloning().setRegistryName("atlas_clone"));
            event.getRegistry().register(new RecipeAtlasCombining().setRegistryName("atlas_combine"));
        } */
        // TODO FABRIC
    }
}
