package com.argame.mary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display2(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnMap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select app");
            startActivity(chooser);
        }
    }
}
