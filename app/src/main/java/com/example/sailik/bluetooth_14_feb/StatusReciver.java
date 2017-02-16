package com.example.sailik.bluetooth_14_feb;

import android.app.Activity;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static android.webkit.ConsoleMessage.MessageLevel.LOG;

/**
 * Created by saili.k on 14-02-2017.
 */



public class StatusReciver extends BroadcastReceiver {

    //String state;
    private static final int FAIL = -1;
    private static final String TAG=MainActivity.class.getName();
    //int flag=2;
    ActivityManager am;
    ActivityManager.AppTask task;

    //private BluetoothAdapter BA = BluetoothAdapter.getDefaultAdapter();


    @Override
    public void onReceive(Context context, Intent intent) {
//        int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,
//                -1);
        Activity activity = Bluetooth_14_feb.GetCurrentActivity();
        boolean appActive = Bluetooth_14_feb.isActivityVisible();
        //Log.d(TAG,"onReceive:receiver");
        String action = intent.getAction();            // Get intent's action string
        Bundle extras = intent.getExtras();            // Get all the Intent's extras
        if (extras == null) return;                    // All intents of interest have extras.


        switch (action) {
            case "android.bluetooth.adapter.action.STATE_CHANGED": {

                int state = extras.getInt("android.bluetooth.adapter.extra.STATE", FAIL);
                switch (state) {
                    case BluetoothAdapter.STATE_OFF: 
                        if (!appActive) {

                                Toast.makeText(context,"Bluetooth:OFF",Toast.LENGTH_SHORT).show();

                        }
                        else{

                            Intent inten = new Intent(context,ConnectivityDialog.class);
                            context.startActivity(inten);

                        }

                        break;
                    
                    case BluetoothAdapter.STATE_ON:


                            Toast.makeText(context,"Bluetooth:ON",Toast.LENGTH_SHORT).show();



                        break;

                }

            }
        }
    }

}



