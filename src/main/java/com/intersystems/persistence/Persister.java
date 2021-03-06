/*-
 * $Id$
 */
package com.intersystems.persistence;

import javax.swing.DefaultListModel;

/**
 * @author Andrey Shcheglov &lt;mailto:andrey.shcheglov@intersystems.com&gt;
 */
public interface Persister {
	String getClientVersion();

	String getServerVersion();

	boolean isRunning();

	/**
	 * @param testResult
	 */
	void setTestResult(final TestResult testResult);

	TestResult getTestResult();

	/**
	 * @param listModel
	 * @param index
	 */
	void setListModel(final DefaultListModel<Persister> listModel, final int index);

	/**
	 * @return a shared copy used for state transfer.
	 */
	ConnectionParameters getConnectionParameters();


	TestResult setUp();

	/**
	 * @param event
	 */
	void persist(final Event event);

	void tearDown();
}
