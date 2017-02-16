package com.example.sailik.bluetooth_14_feb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ConnectivityDialog extends AppCompatActivity implements View.OnClickListener {
    private Button mOK;

    private static final String TAG=SeondActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_connectivity_dialog);
            mOK = (Button) findViewById(R.id.button_ok);

            mOK.setOnClickListener(ConnectivityDialog.this);


    }
    @Override
    protected void onStart(){
        super.onStart();

    }

    @Override
    public void onClick(View v) { // Parameter v stands for the view that was clicked.

        switch (v.getId()) {
            case R.id.button_ok:

                finish();
                break;

        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

    }
}