package com.example.friendsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    AppCompatButton b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.frndname);
        e3=(EditText) findViewById(R.id.nickname);
        e4=(EditText) findViewById(R.id.descr);
        b1=(AppCompatButton) findViewById(R.id.submitbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getName=e1.getText().toString();
                String getFriendName=e2.getText().toString();
                String getNickName=e3.getText().toString();
                String getDesc=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getFriendName+" "+getNickName+" "+getDesc,Toast.LENGTH_SHORT).show();
            }
        });

    }
}