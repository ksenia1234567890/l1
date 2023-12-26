package com.example.l1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Находим текстовое поле по id
        TextView textSurname = (TextView) findViewById(R.id.textSurname);

        //Получаем данные из первой активити
        textSurname.setText(getIntent().getStringExtra("surname"));
    }
}