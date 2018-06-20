package com.example.administrator.dagger2;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/6/20.
 */
@SubScope
@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    void  inject(Main3Activity activity);
}
