package com.example.test22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {


    TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub=findViewById(R.id.tv_sub);
        Intent intent =getIntent();  //값받기
       String str = intent.getStringExtra("str");

        tv_sub.setText(str);   //***
    }
}
