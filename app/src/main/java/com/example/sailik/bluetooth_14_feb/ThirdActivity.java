package com.example.sailik.bluetooth_14_feb;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG=ThirdActivity.class.getName();
    private BluetoothAdapter BA = BluetoothAdapter.getDefaultAdapter();







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG,"third:onCreate()");


        if(BA.isEnabled()){

                Toast.makeText(this, "Bluetooth: ON", Toast.LENGTH_SHORT).show();


        }
        else{
            if(!BA.isEnabled()){

                    Intent i = new Intent(ThirdActivity.this, ConnectivityDialog.class);
                    startActivity(i);

            }

        }


    }

    @Override
    protected void onStart() {
        super.onStart();



    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"third:onResume()");
        //temp=true;
        Bluetooth_14_feb.setCurrentActivity(this);
        Bluetooth_14_feb.onActivityResume();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Bluetooth_14_feb.onActivityPause();
    }
    @Override
    protected void onStop(){

        super.onStop();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();


    }
}
