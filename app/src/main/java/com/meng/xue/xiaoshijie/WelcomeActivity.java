package com.meng.xue.xiaoshijie;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {
private Intent intentwel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //        if(isNetworkAvailable()){
//            Intent intentService=new Intent();
//            startService()
//        }
        intentwel = new Intent(this,FramentActivity.class);
            new Handler().postDelayed(new Runnable(){
            public void run() {
        startActivity(intentwel);
            }
        }, 5000);

//    public boolean isNetworkAvailable() {
//        ConnectivityManager connectivity = (ConnectivityManager) getApplicationContext()
//                .getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (connectivity != null) {
//            NetworkInfo info = connectivity.getActiveNetworkInfo();
//            if (info != null && info.isConnected())
//            {
//                if (info.getState() == NetworkInfo.State.CONNECTED)
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

}
}
