package com.abdullaev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        EditText editTextText = (EditText) findViewById(R.id.editTextText1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        EditText editTextTex2 = (EditText) findViewById(R.id.editTextText2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Подписка на рассылку успешно оформлена для пользователя " + editTextText.getText() + "на электронный адрес " + editTextTex2.getText();
                textView3.setText(name);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
            }
        });
    }


}