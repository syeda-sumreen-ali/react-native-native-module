package com.pipapp3;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class FileSystemModule extends ReactContextBaseJavaModule {

    public FileSystemModule (@Nullable ReactApplicationContext reactContext) {

        super(reactContext);

    }

    @Override

    public String getName() {

        return "FileSystem";

    }

}