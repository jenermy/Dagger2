package com.example.administrator.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    @Inject
    BulingStar mBulingStar;
    private TextView eyeTv,loveTv,waitTv;
    private Button nextBtn;
    @Inject
    Gson mGson; //通过@Module生成实例
    @Inject
    Mania mMania;
    @Inject
    String myEye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //由ConnectorComponent类注入生成实例
//        DaggerConnectorComponent.builder().build().inject(this);
        MainComponent.getInstance().inject(this);
        eyeTv = (TextView)findViewById(R.id.eyeTv);
        eyeTv.setText(mGson.toJson(mBulingStar));
        loveTv = (TextView)findViewById(R.id.loveTv);
        loveTv.setText(myEye);
        waitTv = (TextView)findViewById(R.id.waitTv);
        waitTv.setText(mMania+"");
        nextBtn = (Button)findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

    }
}
