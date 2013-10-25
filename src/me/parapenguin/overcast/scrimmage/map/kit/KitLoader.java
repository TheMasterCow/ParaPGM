package me.parapenguin.overcast.scrimmage.map.kit;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;

import lombok.Getter;
import me.parapenguin.overcast.scrimmage.ServerLog;
import me.parapenguin.overcast.scrimmage.map.MapLoader;

public class KitLoader {
	
	@Getter Element element;
	
	public KitLoader(Element element) {
		this.element = element;
	}
	
	public ItemKit load() {
		String name = this.element.attributeValue("name");
		List<ItemSlot> slots = new ArrayList<ItemSlot>();
		List<ItemKit> parents = new ArrayList<ItemKit>();
		
		for(Element element : MapLoader.getElements(this.element, "item")) {
			/*
			 * Load the Items with their Item Slawt and sheeeeeeeeet!
			 * Example: <item slot="0">iron sword</item>
			 */
			
			try {
				int slot = element.attributeValue("slot");
			} catch(Exception e) {
				ServerLog.info("Failed to load an item because it threw an exception");
			}
		}
		
		return new ItemKit(name, slots, parents);
	}
	
}
