package com.example.fatimah;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button up,down,left,right;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       up = findViewById(R.id.bUp);
        down = findViewById(R.id.bDown);
        left = findViewById(R.id.bLeft);
        right = findViewById(R.id.bRight);
        img = findViewById(R.id.imageView);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY()-5);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY()+5);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX()-5);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX()+5);
            }
        });

        };
    }
