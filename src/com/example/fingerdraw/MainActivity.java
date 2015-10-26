package com.example.fingerdraw;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity {
	public DisplayMetrics metrics;
	DemoPath dp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		dp = new DemoPath(this, metrics.widthPixels, metrics.heightPixels);  
		setContentView(dp);
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, 1, 0, "生成图片");
		menu.add(0, 2, 0, "绿色");
		menu.add(0, 3, 0, "蓝色");
		menu.add(0, 4, 0, "红色");
		menu.add(0, 5, 0, "橡皮擦");
		menu.add(0, 6, 0, "清空");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int id = item.getItemId();
		switch (id) {
		case 1:
			dp.createImg();
			break;
		case 2:
			dp.mPaint.setColor(0xff00ff00);
			break;
		case 3:
			dp.mPaint.setColor(0xff00ccff);
			break;
		case 4:
			dp.mPaint.setColor(0xffff0000);
			break;
		case 5:
			dp.mPaint.setColor(0xffffffff);
			break;
		case 6:
			dp.clearAll();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
