package com.example.administrator.dagger2;

import android.app.Application;

/**
 * Created by Administrator on 2018/6/20.
 */

public class MainApplication extends Application {
    private ApplicationComponent applicationComponent;
    private static MainApplication application;
    private SubComponent subComponent;
    public static MainApplication getInstance(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }

    public SubComponent getSubComponent() {
        if(subComponent == null){
            subComponent = applicationComponent.plus(new SubModule());
        }
        return subComponent;
    }
}
