package hunternif.mc.atlas.client.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import hunternif.mc.atlas.client.Textures;
import hunternif.mc.atlas.client.gui.core.GuiComponentButton;
import hunternif.mc.atlas.util.AtlasRenderHelper;
import org.lwjgl.opengl.GL11;

import java.util.Collections;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GuiLighting;
import net.minecraft.client.resource.language.I18n;

public class GuiPositionButton extends GuiComponentButton {
	private static final int WIDTH = 11;
	private static final int HEIGHT = 11;

	public GuiPositionButton() {
		setSize(WIDTH, HEIGHT);
	}

	@Override
	public void draw(int mouseX, int mouseY, float partialTick) {
		if (isEnabled()) {
			GuiLighting.disable();
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			int x = getGuiX(), y = getGuiY();
			if (isMouseOver) {
				GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			} else {
				GlStateManager.color4f(1.0F, 1.0F, 1.0F, 0.5F);
			}

			AtlasRenderHelper.drawFullTexture(Textures.BTN_POSITION, x, y, WIDTH, HEIGHT);

			GlStateManager.disableBlend();

			if (isMouseOver) {
				drawTooltip(Collections.singletonList(I18n.translate("gui.antiqueatlas.followPlayer")), MinecraftClient.getInstance().textRenderer);
			}
		}
	}
}
