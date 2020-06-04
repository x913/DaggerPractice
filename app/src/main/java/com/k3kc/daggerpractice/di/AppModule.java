package com.k3kc.daggerpractice.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    static String someString() {
        return "this is a test string";
    }

    @Provides
    static boolean hello() {
        return true;
    }
}
