package com.example.zidingyi2;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class MyToggleButton extends TextView {
	long time1;
	long time2;
	private int count=0;
	private Date d;
	
	public MyToggleButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();

		
	}
	
	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
		this.setText(d.getName());
	}


	class MyOnClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 time1 =System.currentTimeMillis();
			
			if( time1-time2<1000){
				 count++;
                if(count%2==1){
		        if(d.getCheck()==false){
		        	changeBg("#999999");
				d.setCheck(true);
		        }else{
		        	d.setCheck(false);
		        	changeBg("#343434");
		        }
				if (aOnClickListener != null) {
					aOnClickListener.function(d);
				}
                }
		}else{
			count=0;
		}
			time2=System.currentTimeMillis();
		}
	}
	private void changeBg(String str) {
		this.setBackgroundColor(Color.parseColor(str));
	}
	public AOnClickListener aOnClickListener;

	public interface AOnClickListener {
		public void function(Date d);
	}

	public void setMyOnClickListener(AOnClickListener aOnClickListener) {
		this.aOnClickListener = aOnClickListener;
	}
	private void initView() {
		this.setOnClickListener(new MyOnClickListener());
	}

}
