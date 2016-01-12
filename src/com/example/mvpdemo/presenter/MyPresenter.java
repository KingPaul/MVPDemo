package com.example.mvpdemo.presenter;

import com.example.mvpdemo.IView;
import com.example.mvpdemo.model.IModel;
import com.example.mvpdemo.model.MyModel;

public class MyPresenter {

	private IModel model;
	private IView view;

	public MyPresenter(IView view) {
		super();
		this.view = view;
		this.model = new MyModel();
	}

	public void printWeb(String url) {
		String content = model.getWeb(url);
		view.setText(content);
	}

}
