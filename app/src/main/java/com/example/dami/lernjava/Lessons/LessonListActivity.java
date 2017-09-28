package com.example.dami.lernjava.Lessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dami.lernjava.Lessons.Advance.LessonAdvanceActivity;
import com.example.dami.lernjava.Lessons.Basic.LessonBasicActivity;
import com.example.dami.lernjava.Lessons.Medium.LessonMediumActivity;
import com.example.dami.lernjava.R;

public class LessonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_leasons_list);

        TextView basic=(TextView) findViewById(R.id.lesson_list_basic_text_view);
        basic.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonListActivity.this, LessonBasicActivity.class);
                startActivity(i);
            }
        });

        TextView medium=(TextView) findViewById(R.id.lesson_list_medium_text_view);
        medium.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonListActivity.this, LessonMediumActivity.class);
                startActivity(i);
            }
        });

        TextView advance=(TextView) findViewById(R.id.lesson_list_advance_text_view);
        advance.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(LessonListActivity.this, LessonAdvanceActivity.class);
                startActivity(i);
            }
        });
    }
}
