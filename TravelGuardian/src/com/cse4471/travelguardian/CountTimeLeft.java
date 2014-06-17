package com.cse4471.travelguardian;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View.OnClickListener;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CountTimeLeft extends ActionBarActivity {
	
	private Button startB;
	public TextView text;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_count__time__left);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		/**
        startB = (Button)findViewById(R.id.startTrip);
        text  = (TextView)findViewById(R.id.count_down_timer);
        text.setText("10"); // Starting from 10.
 
        final MyCounter timer = new MyCounter(10000,1000);
        startB.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.count__time__left, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_count__time__left, container, false);
			return rootView;
		}
	}
	

	/**
	public class MyCounter extends CountDownTimer{
		 
        public MyCounter(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }
 
        @Override
        public void onFinish() {
            text.setText("Timer Completed(Temporary).");
        }
 
        @Override
        public void onTick(long millisUntilFinished) {
            text.setText((millisUntilFinished/1000)+"");
            System.out.println((millisUntilFinished/1000) + "seconds left");
        }
    }
	*/
	
	/** Called when the user clicks the Check-out button */
	public void checkedOut(View view) {
		Intent intent = new Intent(this, CheckedOut.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Panic button */
	public void panic(View view) {
		Intent intent = new Intent(this, Broadcast.class);
		startActivity(intent);
	}

}
