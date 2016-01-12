package com.example.mvpdemo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.example.mvpdemo.IListener;

public class MyModel implements IModel {
	private String result = "";

	@Override
	public String getWeb(final String strurl, IListener listener) {
//		String result = "";

		new Thread() {
			public void run() {
				URL url = null;
				try {
					url = new URL(strurl);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					URLConnection conn = url.openConnection();

					BufferedReader rd = new BufferedReader(
							new InputStreamReader(conn.getInputStream()));
					String line = "";
					while ((line = rd.readLine()) != null) {
						System.out.println(line);
						result = result + line;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();

		return result;
	}

}
