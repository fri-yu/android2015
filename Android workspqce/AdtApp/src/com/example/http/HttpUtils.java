package com.example.http;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {
	public HttpUtils() {
	}

	public static String GetContent(String urlPath) {
		try {
			System.out.println("url:"+urlPath);
			URL url = new URL(urlPath);
			System.out.println("url:"+url.toString());
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			System.out.println("connection:"+connection.toString());
			connection.setConnectTimeout(300);
			connection.setRequestMethod("GET");
			connection.setDoInput(true);
			int resCode = connection.getResponseCode();
			return resCode + "";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception"+e.getMessage());
		}
		return "";
	}
	
}
