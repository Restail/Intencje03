package com.example.intencje03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class another extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }
    public void onClick(View view){
        Intent intent = new Intent();

        EditText imie = (EditText) findViewById(R.id.imie);

        intent.putExtra("imie", imie.getText().toString());
            setResult(RESULT_OK, intent);
        finish();
    }
}