package com.sl.URLs;

import com.sl.urlmanager.core.URLManager;

/**
 * A Demo , create a Third-Party Module URL manager , this URL be privoded third-party server 
 * 
 * @author Stephen
 * 
 */
public class ThirdPartyURL extends URLManager {
	public static ThirdPartyURL	mInstace;
	public static ThirdPartyURL getInstace() {
		if (null == mInstace) {
			mInstace = new ThirdPartyURL();
		}
		return mInstace;
	}

	// init
	public ThirdPartyURL() {
		setScheme("http");
		// setHost(apiURL); usually , third-pary url don 't private DEBUG url , but ...
		setHost("www.baidu-1.com","www.baidu-2.com"); 
		setPort("80");
		setAppPath("/api/");
		setSuffix("json");

		createFullPath();
	}

	/**
	 * DataInterface define here .
	 * */
	public String getComment() {
		return mFullPath + "/movies/comment/getComment" + mSuffix;
	}
}
