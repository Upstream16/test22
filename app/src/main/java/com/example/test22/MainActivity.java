package com.example.test22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button btn_move;
     Button btn_upload;
     EditText sub_text;
     String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_move =findViewById(R.id.btn_move);
        btn_upload =findViewById(R.id.btn_uploadmove);
        sub_text=findViewById(R.id.sub_text);


      btn_move.setOnClickListener(new View.OnClickListener(){
 //이벤트발생
          @Override
          public void onClick(View v) {   //클릭이벤트
              str= sub_text.getText().toString();// str 로 받아줌 이 값을 다시 putextra 로 뻄
              Intent intent=new Intent(MainActivity.this,SubActivity.class);
             intent.putExtra("str",str);// 값을 집어 넣음
              startActivity(intent);
          }
      } );

        btn_upload.setOnClickListener(new View.OnClickListener(){
            //이벤트발생
            @Override
            public void onClick(View v) {   //클릭이벤트
                Intent intent=new Intent(MainActivity.this,uploadActivity.class);
                startActivity(intent);
            }
        } );
    }
}
