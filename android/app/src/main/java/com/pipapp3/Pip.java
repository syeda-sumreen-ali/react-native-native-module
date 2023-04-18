package com.pipapp3; // replace your-apps-package-name with your app’s package name
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class Pip extends ReactContextBaseJavaModule {
    // public Pip(@Nullable ReactApplicationContext reactContext){
    //     super(reactContext);
    // }
   public Pip(ReactApplicationContext context) {
        super(context);
    }
    // add to CalendarModule.java
//    @NonNull
    @Override
    public String getName() {
        return "MyPip";
    }
}