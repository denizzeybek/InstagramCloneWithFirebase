package com.example.instagramparseclone;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KPofnZyNP2NXeSZUXchWW5HkWcNpqyR3plHKT6Yq")
                .clientKey("n2Guyop6WLj4jjyxrJxKvgO1eX0HO6xHio3UjavD")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
