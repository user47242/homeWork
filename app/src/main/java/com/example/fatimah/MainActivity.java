package com.example.fatimah;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button up,down,left,right;
    private ImageView img;
    private int count=0;
    private TextView c,go;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       up = findViewById(R.id.bUp);
        down = findViewById(R.id.bDown);
        left = findViewById(R.id.bLeft);
        right = findViewById(R.id.bRight);
        img = findViewById(R.id.imageView);
        c = findViewById(R.id.count);
        go = findViewById(R.id.textView3);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY()-10);
                if(img.getY()<66)
                {img.setImageResource(R.drawable.sad);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5)
                        go.setText("game over");}
                else
                    img.setImageResource(R.drawable.happy);
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setY(img.getY()+10);
                if(img.getY()>450)
                {img.setImageResource(R.drawable.sad);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5)
                        go.setText("game over");}
                else
                    img.setImageResource(R.drawable.happy);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX()-10);
                if(img.getX()<60)
                {img.setImageResource(R.drawable.sad);
                    count=count+1;
                    c.setText(count+" ");
                if(count==5)
                    go.setText("game over");}
                else
                    img.setImageResource(R.drawable.happy);

            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setX(img.getX()+10);
                if(img.getX()>370+92)
                {img.setImageResource(R.drawable.sad);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5)
                        go.setText("game over");}
                else
                    img.setImageResource(R.drawable.happy);
            }
        });


        };
    }
