package com.example.mvpdemo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MyModel implements IModel {

	@Override
	public String getWeb(String strurl) {
		String result = "OK";
//		URL url = null;
//
//		try {
//			url = new URL(strurl);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			URLConnection conn = url.openConnection();
//
//			BufferedReader rd = new BufferedReader(new InputStreamReader(
//					conn.getInputStream()));
//			String line = "";
//			while ((line = rd.readLine()) != null) {
//				System.out.println(line);
//				result = result + line;
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return result;
	}

}
