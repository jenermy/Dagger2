package com.example.administrator.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/20.
 */
@Module
public class SubModule {
    //当有两个不同的方法都可以生成相同的实例时，用@Qualifier限定符来匹配注入方法
    @ManiaQualified("A")
    @SubScope
    @Provides
    public Mania provideMania(){
        return new Mania("电话皇后","庸人自扰");
    }
    @ManiaQualified("B")
    @SubScope
    @Provides
    public Mania provideOtherMania(){
        return new Mania("好想你","是真的真的好想你，不是假的假的好想你");
    }
}
