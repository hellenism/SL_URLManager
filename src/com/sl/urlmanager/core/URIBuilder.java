package com.sl.urlmanager.core;

public class URIBuilder {
	private static final String COLON = ":";
	private static final String PATH = "://";
	private static final String DOT = ".";
	
	/**
	 * create Scheme
	 * 
	 * @param scheme
	 * @return correct scheme
	 * 			ex: http:// , https://
	 */
	public static String createScheme(String scheme)
	{
		String result = scheme;
		
		if(!result.endsWith(PATH))
		{
			result += PATH;
		}
		
		return result;
	}
	
	/**
	 * create Port
	 * 
	 * @param port
	 * @return correct port
	 * 			ex: :80 , :8080
	 */
	public static String createPort(String port)
	{
		String result = port;
		
		if(!result.startsWith(COLON))
		{
			result = COLON + port;
		}
		
		return result;
	}
	
	/**
	 * create Suffix
	 * 
	 * @param suffix
	 * @return correct suffix
	 * 			ex: .json , .xml
	 */
	public static String createSuffix(String suffix)
	{
		String result = suffix;
		
		if(!result.startsWith(DOT))
		{
			result = DOT + suffix;
		}
		
		return result;
	}
}
