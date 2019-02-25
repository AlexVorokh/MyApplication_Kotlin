package com.best.alex.myapplicationkotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Java_DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Получаем сообщение из объекта intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(Java_Main.EXTRA_MESSAGE);

        // Создаем текстовое поле
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Устанавливаем текстовое поле в системе компоновки activity
        setContentView(textView);
    }
}
