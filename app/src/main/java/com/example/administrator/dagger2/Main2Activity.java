package com.example.administrator.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {
    private TextView rainTv,objectTv;
    private Button nextBtn2;
    @Inject
    Gson mGson;
    @Inject
    Mania mania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainComponent.getInstance().inject(this);
        rainTv = (TextView)findViewById(R.id.rainTv);
        objectTv = (TextView)findViewById(R.id.objectTv);
        rainTv.setText(mGson.toJson(mania));
        objectTv.setText(mania+"");
        nextBtn2 = (Button)findViewById(R.id.nextBtn2);
        nextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
            }
        });
    }
}
