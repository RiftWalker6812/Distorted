package riftwalker0.distortion.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import riftwalker0.distortion.Main;
import riftwalker0.distortion.init.ItemInit;
import riftwalker0.distortion.util.IHasModel;


public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
