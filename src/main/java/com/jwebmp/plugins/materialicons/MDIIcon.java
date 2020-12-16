package com.jwebmp.plugins.materialicons;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;

/**
 * A material design icon using an older version - classes only web fonts. prefixed with mdi-
 */
public class MDIIcon<J extends MDIIcon<J>>
		extends Italic<J>
	implements IIcon<com.jwebmp.core.base.interfaces.IComponentHierarchyBase<?,?>, J>
{
	private final MDIIcons icon;

	public MDIIcon()
	{
		this(null);
	}

	public MDIIcon(MDIIcons icon)
	{
		this.icon = icon;
		addClass(icon);
	}

	@Override
	public void preConfigure()
	{
		if(!isConfigured())
		{
			addClass(icon);
		}
		super.preConfigure();
	}

	@Override
	public String getClassName()
	{
		return icon.toString();
	}

	@Override
	public IComponentHierarchyBase<?,?> getIconComponent()
	{
		return this;
	}
}
