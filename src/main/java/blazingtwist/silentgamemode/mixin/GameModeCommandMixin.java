package blazingtwist.silentgamemode.mixin;

import net.minecraft.server.command.GameModeCommand;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameModeCommand.class)
public class GameModeCommandMixin {

	@Inject(at = @At("HEAD"), cancellable = true, method = "sendFeedback")
	private static void onSendFeedback(ServerCommandSource source, ServerPlayerEntity player, GameMode gameMode, CallbackInfo info) {
		info.cancel();
	}

}
