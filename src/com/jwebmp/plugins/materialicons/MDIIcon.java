package com.jwebmp.plugins.materialicons;

import com.jwebmp.base.html.Italic;

/**
 * A material design icon using an older version - classes only web fonts. prefixed with mdi-
 */
public class MDIIcon<J extends MDIIcon<J>>
		extends Italic<J>
{
	public MDIIcon()
	{
		this(null);
	}

	public MDIIcon(MDIIcons icon)
	{
		super();
		addClass(icon);
	}

}
