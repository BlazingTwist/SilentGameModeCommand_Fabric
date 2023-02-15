package blazingtwist.silentgamemode;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SilentGameModeMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("silentgamemode");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SilentGameMode mod.");
	}
}
