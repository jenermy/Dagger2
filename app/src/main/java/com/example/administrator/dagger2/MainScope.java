package com.example.administrator.dagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Administrator on 2018/6/20.
 */

//自定义@Scope注解，主要是为了调用Component连接器时共用同一个实例，这个例子里面就是MainActivity的Mania实例和Main2Activity的Mania实例是同一个
    //自定义的注解@MainScope需要在Component和Module相关的方法处加上@MainScope
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MainScope {

}
