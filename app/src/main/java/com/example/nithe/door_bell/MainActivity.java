package com.example.nithe.door_bell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bell(View view)
    {
        Intent inent = new Intent("cultoftheunicorn.marvel.Recognize");
        startActivity(inent);
    }

}
