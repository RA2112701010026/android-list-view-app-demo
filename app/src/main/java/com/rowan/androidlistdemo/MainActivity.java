 package com.rowan.androidlistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {
     ListView listView;
     String  arr[]={"this is my git projects","restaurants-website", "tictactoe-game-with-python ", "face-detection-using-opencv-and-nlp", "React-AeroAura-A--weather-suggest", "React-app-Text-changer ", "REACT-CALCULATOR", "Image-caption-using-transformers-torch ", "REALESTATE-DBMS", "android-app-demo", "IMAGE-CAPTION-USING-DEEP-LEARNING-PROJECT", "android-multi-view-app-demo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);
    }
}