package com.example.administrator.dagger2;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/6/20.
 */

public class BulingStar {
    public String drakness;
    @Inject
    public BulingStar(){
        drakness = "我希望在你眼里，像星星在夜色里";
    }

}
