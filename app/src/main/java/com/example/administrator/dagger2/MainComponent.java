package com.example.administrator.dagger2;

import dagger.Component;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/20.
 */

//一般来讲，我们应该对每个Component都定义不同的作用域。
    //MainComponent的作用域不能和ApplicationComponent的作用域一样，否则会报错
@MainScope
@Component(dependencies = ApplicationComponent.class,modules = {DependModule.class})
public abstract class MainComponent {
    abstract void inject(MainActivity activity);
    abstract void inject(Main2Activity activity);
    private static MainComponent mainComponent;
    public static MainComponent getInstance(){

        //MainComponent依赖ApplicationComponent
        if(mainComponent == null){
            mainComponent = DaggerMainComponent.builder().applicationComponent(MainApplication.getInstance().getApplicationComponent())
                    .build();
        }
        return mainComponent;
    }
}
