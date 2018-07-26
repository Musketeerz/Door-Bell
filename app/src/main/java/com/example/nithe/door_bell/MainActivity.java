package com.example.nithe.door_bell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.t);
        Bundle b =getIntent().getExtras();
        if(b!=null)
        {
            String myString = b.getString("FACE_DATA");
            t.setText(myString);
        }
    }

    public void bell(View view)
    {
        Intent inent = new Intent("cultoftheunicorn.marvel.Recognize");
        startActivity(inent);
    }

}
