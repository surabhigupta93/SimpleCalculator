package com.simplecalculator.NavigationBar;

import android.app.Activity;
import android.graphics.Color;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by surabhigupta on 5/15/18.
 */

public class NavigationBarModule extends ReactContextBaseJavaModule {

    public NavigationBarModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "NavigationBar";
    }

    @ReactMethod
    public void setColor(final String color) {
        final Activity activity = getCurrentActivity();
        final int colorInt = Color.parseColor(color);

        activity.getWindow().setNavigationBarColor(colorInt);
    }
}
