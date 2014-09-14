package com.sl.urlmanager.core;

/**
 * 
 * 
 * @author Stephen
 */
public class URLEnvironment {
	
	/**
	 * the settings , Client version 
	 */
	protected final static EnvEnum	EvnType	= EnvEnum.DEBUG;
	
	/**
	 * Client global environment of Internet , URLManager will call setHost with this value
	 */
	public final static String	EvnHost;

	/**
	 * environment type enum
	 */
	protected enum EnvEnum {
		DEBUG, TEST, RELEASE,
	}

	/**
	 * static init block
	 * */
	static {
		EvnHost = getHostWithEvnType(EvnType);
	}
	
	/**
	 * create EvnHost by environment type
	 * 
	 * @param evnType
	 * @return
	 */
	private static String getHostWithEvnType(EnvEnum evnType) {
		String host = "";
		if (evnType == EnvEnum.DEBUG) {
			host = "10.0.0.1";
		} else if (evnType == EnvEnum.TEST) {
			host = "192.168.0.1";
		} else {
			host = "www.baidu.com";
		}
		return host;
	}
}
