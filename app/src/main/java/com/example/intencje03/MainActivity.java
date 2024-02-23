package com.example.intencje03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mojKod = 1;
    private int requestCode;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        startActivityForResult(new Intent(this, another.class), requestCode);
    }
    public void onActivityResult( int requestCode, int resultCode,
                                  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == mojKod) {
            if (resultCode == RESULT_OK) {
                String imie = data.getStringExtra("imie");
                Toast.makeText(this, "Witaj" + imie, Toast.LENGTH_SHORT).show();
            }
        }
    }
}