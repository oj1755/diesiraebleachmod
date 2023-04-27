/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.diesiraebleach;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class DiesiraebleachModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public DiesiraebleachModElements() {
		sounds.put(new ResourceLocation("diesiraebleach", "panzer"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "panzer")));
		sounds.put(new ResourceLocation("diesiraebleach", "panzersummon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "panzersummon")));
		sounds.put(new ResourceLocation("diesiraebleach", "gunfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "gunfire")));
		sounds.put(new ResourceLocation("diesiraebleach", "guncharge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "guncharge")));
		sounds.put(new ResourceLocation("diesiraebleach", "beikuihassha"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "beikuihassha")));
		sounds.put(new ResourceLocation("diesiraebleach", "kaze"), new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kaze")));
		sounds.put(new ResourceLocation("diesiraebleach", "beikeisei"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "beikeisei")));
		sounds.put(new ResourceLocation("diesiraebleach", "finger"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "finger")));
		sounds.put(new ResourceLocation("diesiraebleach", "dageki"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "dageki")));
		sounds.put(new ResourceLocation("diesiraebleach", "bakuhatsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "bakuhatsu")));
		sounds.put(new ResourceLocation("diesiraebleach", "fire"), new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "fire")));
		sounds.put(new ResourceLocation("diesiraebleach", "kenzangeki"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kenzangeki")));
		sounds.put(new ResourceLocation("diesiraebleach", "kensuburi"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kensuburi")));
		sounds.put(new ResourceLocation("diesiraebleach", "ewigkeite"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "ewigkeite")));
		sounds.put(new ResourceLocation("diesiraebleach", "punchsuburi"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "punchsuburi")));
		sounds.put(new ResourceLocation("diesiraebleach", "speed1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "speed1")));
		sounds.put(new ResourceLocation("diesiraebleach", "speed2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "speed2")));
		sounds.put(new ResourceLocation("diesiraebleach", "speed3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "speed3")));
		sounds.put(new ResourceLocation("diesiraebleach", "speed4"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "speed4")));
		sounds.put(new ResourceLocation("diesiraebleach", "timestop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "timestop")));
		sounds.put(new ResourceLocation("diesiraebleach", "beikeisei2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "beikeisei2")));
		sounds.put(new ResourceLocation("diesiraebleach", "bakuhatsu2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "bakuhatsu2")));
		sounds.put(new ResourceLocation("diesiraebleach", "kaensmall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kaensmall")));
		sounds.put(new ResourceLocation("diesiraebleach", "kaen"), new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kaen")));
		sounds.put(new ResourceLocation("diesiraebleach", "hellfire"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "hellfire")));
		sounds.put(new ResourceLocation("diesiraebleach", "terror"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "terror")));
		sounds.put(new ResourceLocation("diesiraebleach", "kyusei"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("diesiraebleach", "kyusei")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("diesiraebleach").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == DiesiraebleachModElements.ModElement.class)
						elements.add((DiesiraebleachModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(DiesiraebleachModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new DiesiraebleachModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		DiesiraebleachMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final DiesiraebleachModElements elements;
		protected final int sortid;

		public ModElement(DiesiraebleachModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
