package com.sl.URLs;

import com.sl.urlmanager.core.URLManager;

/**
 * A Demo , create a Movies Module URL manager , this URL manager is part of Client
 * 
 * @author Stephen
 * 
 */
public class MoviesURL extends URLManager {

	/**
	 * Get URL by Singleton
	 * */
	private static MoviesURL	mInstace;
	public static MoviesURL getInstance() {
		if (mInstace == null) {
			mInstace = new MoviesURL();
		}
		return mInstace;
	}

	// init
	public MoviesURL() {
		setScheme("http");
		// setHost("search.voga360.com");
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
