package com.example.administrator.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/20.
 */
@Module
public class PoetryModule {

    // 这个方法需要两个String参数，在Dagger2注入中，这些参数也是注入形式的，也就是
    // 要有其他地方提供参数reason和manifestation的生成，不然会造成编译出错
    @ConnectorScope
    @Provides
    public Mania provideMania(String reason,String manifestation){
        return new Mania(reason,manifestation);
    }
//    @Provides
//    public String provideReason(){
//        return "让我做你的眼睛，那样你才看得清，这首情歌唱歌你听，把你当做天上星";
//    }


    // 这里提供了一个生成String的方法，在这个Module里生成Mania实例时，会查找到这里
    // 可以为上面提供String类型的参数
    @Provides String provideManifestation(){
        return  "我在等你，等下完这场雨";
    }
}
