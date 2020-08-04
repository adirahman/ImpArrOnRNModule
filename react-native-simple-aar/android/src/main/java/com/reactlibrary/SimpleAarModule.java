package com.reactlibrary;

import com.arc.myfirstaar.MyFirstAarLandingActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class SimpleAarModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public SimpleAarModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "SimpleAarModule";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    @ReactMethod
    public void callAarActivity(){
        MyFirstAarLandingActivity.startThisActivity(reactContext);
    }
}
