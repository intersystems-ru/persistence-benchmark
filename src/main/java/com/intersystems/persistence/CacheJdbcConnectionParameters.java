/*-
 * $Id$
 */
package com.intersystems.persistence;

import com.intersystems.persistence.ui.CacheJdbcConnectionParametersPanel;

/**
 * @author Andrey Shcheglov &lt;mailto:andrey.shcheglov@intersystems.com&gt;
 */
public class CacheJdbcConnectionParameters extends JdbcConnectionParameters {
	private final String host;

	private final int port;

	private final String namespace;

	private CacheJdbcConnectionParametersPanel view;

	/**
	 * @param host
	 * @param port
	 * @param namespace
	 * @param username
	 * @param password
	 * @param autoCommit
	 */
	public CacheJdbcConnectionParameters(final String host,
			final int port,
			final String namespace,
			final String username,
			final String password,
			final boolean autoCommit) {
		super("jdbc:Cache://" + host + ":" + port + "/" + namespace,
				autoCommit,
				username,
				password);
		this.host = host;
		this.port = port;
		this.namespace = namespace;
	}

	public final String getHost() {
		return this.host;
	}

	public final int getPort() {
		return this.port;
	}

	public final String getNamespace() {
		return this.namespace;
	}

	/**
	 * @see ConnectionParameters#getView()
	 */
	@Override
	public CacheJdbcConnectionParametersPanel getView() {
		return this.view == null
				? this.view = new CacheJdbcConnectionParametersPanel(this)
				: this.view;
	}
}
