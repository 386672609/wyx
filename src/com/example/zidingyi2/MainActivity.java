package com.example.zidingyi2;

import com.example.zidingyi2.MyToggleButton.AOnClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyToggleButton v = (MyToggleButton) findViewById(R.id.toggle);
		Date d = new Date("µ°µ°",false);
		v.setD(d);
		
		v.setMyOnClickListener(new AOnClickListener() {
			
			@Override
			public void function(Date d) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, d.toString(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
