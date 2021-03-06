/*-
 * $Id$
 */
package com.intersystems.persistence.ui;

import java.awt.Component;

import com.intersystems.persistence.CacheObjBindingConnectionParameters;

/**
 * @author Andrey Shcheglov &lt;mailto:andrey.shcheglov@intersystems.com&gt;
 */
public final class CacheObjBindingConnectionParametersPanel extends CacheJdbcConnectionParametersPanel {
	private static final long serialVersionUID = 2425121880992010985L;

	/**
	 * @param connectionParameters
	 */
	public CacheObjBindingConnectionParametersPanel(final CacheObjBindingConnectionParameters connectionParameters) {
		super(connectionParameters);

		this.removeAll();
	}

	/**
	 * @see Component#getName()
	 */
	@Override
	public String getName() {
		return "Cach\u00e9 Object Binding";
	}
}
