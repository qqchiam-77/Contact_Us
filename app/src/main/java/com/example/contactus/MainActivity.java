package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.facebook_jdsports);
        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFacebookPage("https://www.facebook.com/jdsportsmalaysia");
            }
        });
    }
    private void  goToFacebookPage(String id){
        try {
            Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse ("fb://page" +id));
            StartActivity(intent);

        }catch (ActivityNotFoundException e){
            Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"+id));
            StartActivity(intent);
        }
    }

    private void StartActivity(Intent intent) {
    }
}