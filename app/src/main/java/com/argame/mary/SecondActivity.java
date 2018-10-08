package com.argame.mary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void display1(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnMap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5895, 120.9753"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
        }
    }

}