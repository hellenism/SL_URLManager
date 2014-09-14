package com.sl.urlmanager.core;

import android.text.TextUtils;

public abstract class URLManager extends URLEnvironment {

	/**
	 * Ex: 
	 * https://github.com/hellenism/getDataaaaa.json?type=1&id=15
	 *  | 			|		   |		  | 	  | 		| 
	 *  scheme    Host 		AppPath  Interface 	Suffix QueryString
	 * */

	protected String	mScheme		= "http://";	// 协议
	protected String	mDebugHost	= "";
	protected String	mHost		= "";			// 主机
	protected String	mAppPath	= "";			// 应用程序路径
	protected String	mPort		= ":80";		// 端口
	protected String	mSuffix		= "";			// ".json";
	protected String	mFullPath	= "";			// https://github.com/hellenism.json?type=1&id=15

	/**
	 * set scheme
	 * 
	 * @param scheme
	 */
	public void setScheme(String scheme) {
		mScheme = URIBuilder.createScheme(scheme);
	}

	/**
	 * set port
	 * 
	 * @param port
	 */
	public void setPort(String port) {
		mPort = URIBuilder.createPort(port);
	}

	/**
	 * set suffix
	 * 
	 * @param suffix
	 */
	public void setSuffix(String suffix) {
		mSuffix = URIBuilder.createSuffix(suffix);
	}

	/**
	 * set host , usually, this methods be used client
	 * 
	 * @param host
	 */
	public void setHost(String host) {
		mHost = EvnHost;
	}

	/**
	 * set host , usually, this methods be used THIRD-PARTY-SERVER URL manager 
	 * 
	 * @param debugHost
	 * @param releaseHost
	 */
	public void setHost(String debugHost, String releaseHost) {
		mDebugHost = debugHost;
		mHost = releaseHost;
	}

	/**
	 * set application path
	 * 
	 * @param path
	 */
	public void setAppPath(String path) {
		mAppPath = path;
	}

	/**
	 * create full url without interface and suffix
	 */
	public void createFullPath() {
		StringBuilder sb = new StringBuilder();
		String host = mHost;

		if (!TextUtils.isEmpty(mDebugHost)) {
			if (EvnType != EnvEnum.RELEASE) {
				host = mDebugHost;
			}
		}

		sb.append(mScheme).append(host).append(mPort).append(mAppPath);
		mFullPath = sb.toString();
	}
}
