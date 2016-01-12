package com.example.mvpdemo.model;

import com.example.mvpdemo.IListener;

public interface IModel {
	void getWeb(String url,IListener listen);
	String getResult();
}
