package com.example.administrator.dagger2;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/6/20.
 */
@Singleton
@Component(modules = MainModule.class)
public interface ApplicationComponent {

    Gson getGson(); //暴露Gson对象

    SubComponent plus(SubModule subModule);
}
