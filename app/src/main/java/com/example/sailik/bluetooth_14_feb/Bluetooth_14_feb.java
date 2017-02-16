package com.example.sailik.bluetooth_14_feb;

import android.app.Activity;
import android.app.Application;

/**
 * Created by saili.k on 15-02-2017.
 */

public class Bluetooth_14_feb extends Application {
    public static boolean activityVisible;
    public static Activity mForegroundActivity;

    public static void setCurrentActivity(Activity ForegroundActivity){
        mForegroundActivity = ForegroundActivity;
    }
    public static Activity GetCurrentActivity(){
        return mForegroundActivity;
    }

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void onActivityResume() {
        activityVisible = true;

    }

    public static void onActivityPause() {
        activityVisible = false;
    }
}
