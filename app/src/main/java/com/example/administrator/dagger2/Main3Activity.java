package com.example.administrator.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import javax.inject.Inject;

public class Main3Activity extends AppCompatActivity {
    private TextView thatTv,otherTv;
    @Inject
    Gson mGson;
    @ManiaQualified("A")
    @Inject
    Mania mania;
    @ManiaQualified("B")
    @Inject
    Mania mania2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        thatTv = (TextView)findViewById(R.id.thatTv);
        otherTv = (TextView)findViewById(R.id.otherTv);
        MainApplication.getInstance().getSubComponent().inject(this);
        thatTv.setText(mGson.toJson(mania));
        otherTv.setText(mGson.toJson(mania2));
        if(mGson != null){
            Toast.makeText(Main3Activity.this,"that girl",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(Main3Activity.this,"I keep say no",Toast.LENGTH_SHORT).show();
        }

    }
}
