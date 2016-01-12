package com.example.mvpdemo.model;

import com.example.mvpdemo.IListener;

public interface IModel {
	String getWeb(String url,IListener listen);
}
