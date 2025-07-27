package dev.lieonlion.stam1ocreatetweaks;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Stam1oTweaks.MODID)
public class Stam1oTweaks {
	public static final String MODID = "stam1ocreatetweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger("Stam1oTweaks");

	public Stam1oTweaks() {
		LOGGER.info("Initialising Stam1oTweaks");
	}

	public static ResourceLocation asId(String id) {
		return ResourceLocation.fromNamespaceAndPath(MODID, id);
	}
}