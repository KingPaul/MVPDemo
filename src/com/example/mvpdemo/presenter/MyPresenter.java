package com.example.mvpdemo.presenter;

import android.os.Handler;

import com.example.mvpdemo.IListener;
import com.example.mvpdemo.IView;
import com.example.mvpdemo.model.IModel;
import com.example.mvpdemo.model.MyModel;

public class MyPresenter {

	private IModel model;
	private IView view;
	private Handler mHandler = new Handler();
	private String content;

	public MyPresenter(IView view) {
		super();
		this.view = view;
		this.model = new MyModel();
	}

	public void printWeb(String url) {
		content = model.getWeb(url, new IListener() {
			@Override
			public void callBack() {
				// TODO Auto-generated method stub
				mHandler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						view.setText(content);
					}
				});
			}
		});
		// view
	}
}
