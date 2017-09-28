package com.example.dami.lernjava.Lessons.Basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dami.lernjava.Lessons.Advance.LessonAdvanceActivity;
import com.example.dami.lernjava.Lessons.LessonListActivity;
import com.example.dami.lernjava.Lessons.Medium.LessonMediumActivity;
import com.example.dami.lernjava.Lessons.show.LessonShowActivity;
import com.example.dami.lernjava.R;

public class LessonBasicActivity extends AppCompatActivity {
    private String pathToFile1="/root/LearnJava/Lessons/basic/1.txt";
    private String pathToFile2="/root/LearnJava/Lessons/basic/2.txt";
    private String pathToFile3="/root/LearnJava/Lessons/basic/3.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_basic);

        LinearLayout linearLayout1=(LinearLayout) findViewById(R.id.linear_layout_1);
        linearLayout1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonBasicActivity.this, LessonShowActivity.class);
                i.putExtra("FILE_PATH" , pathToFile1);
                startActivity(i);
            }
        });

        LinearLayout linearLayout2=(LinearLayout) findViewById(R.id.linear_layout_2);
        linearLayout2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonBasicActivity.this, LessonShowActivity.class);
                i.putExtra("FILE_PATH" , pathToFile2);
                startActivity(i);
            }
        });

        LinearLayout linearLayout3=(LinearLayout) findViewById(R.id.linear_layout_3);
        linearLayout3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonBasicActivity.this, LessonShowActivity.class);
                i.putExtra("FILE_PATH" , pathToFile3);
                startActivity(i);
            }
        });

    }
}
