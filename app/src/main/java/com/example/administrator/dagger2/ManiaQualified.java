package com.example.administrator.dagger2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Administrator on 2018/6/20.
 */

//区分调用
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ManiaQualified {
    String value() default "";
}
