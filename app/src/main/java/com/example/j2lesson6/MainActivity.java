package com.example.j2lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    boolean isAndroid, isIos, isMiui;
    Button btn_andr , btn_ios , btn_miui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.androidImage);
        initViews();
        initClickers();
    }
        public void initClickers () {
            btn_andr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isAndroid) {
                        Toast.makeText(MainActivity.this, "Вы угадали!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Вы неугадали!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btn_ios.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isIos) {
                        Toast.makeText(MainActivity.this, "Вы угадали!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Вы неугадали!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btn_miui.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (isMiui) {
                        Toast.makeText(MainActivity.this, "Вы угадали!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Вы неугадали!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }




    private void initViews() {
        imageView = findViewById(R.id.androidImage);
        btn_andr = findViewById(R.id.button1);
        btn_ios = findViewById(R.id.button2);
        btn_miui = findViewById(R.id.button3);
    }
@SuppressLint("nonConstantResourceId")
    public void fcbsu(View view) {
        switch (view.getId()) {
            case R.id.buttonAndroid:
                imageView.setImageResource(R.drawable.androidimage);
                isAndroid = true;
                isIos = false;
                isMiui = false;

                break;
            case R.id.buttonIos:
                imageView.setImageResource(R.drawable.iosimage);
                isIos = true;
                isMiui = false;
                isAndroid = false;
                break;
            case R.id.miuiButton:
                imageView.setImageResource(R.drawable.miuiimage);
                isMiui = true;
                isIos = false;
                isAndroid = false;
        }
    }
}