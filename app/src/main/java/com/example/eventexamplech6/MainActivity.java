package com.example.eventexamplech6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
public class MainActivity extends AppCompatActivity {

    // 리스너 객체 생성 방법 1 _ 내부 클래스

    class MyListenerClass implements View.OnClickListener{
        public void onClick(View v){
            Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.b1);

        MyListenerClass listener = new MyListenerClass();
        button.setOnClickListener(listener);
    }


    // 리스너 객체 생성 방법 2 _ 무명 클래스
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.b1);

        button1.setOnClickListener(new View.OnClickListener() {
            // new 어쩌구는 그 어쩌구클래스의 객체를 만드는 것 - 무명객체
            // new View.OnClickListener() 자리에 원래는, OnClickListener를 상속받은 새로 만든 클래스의 객체 이름 자리. 근데 여기서는스 - 무명클래
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼이 눌렸구나!!!", Toast.LENGTH_LONG).show();
            }

        });
    }
     */


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //액티비티에 인터페이스를 구현하는 방법 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "버튼이 눌려버렸지 말이다.", Toast.LENGTH_LONG).show();
    }
}
