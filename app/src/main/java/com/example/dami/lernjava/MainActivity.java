package com.example.dami.lernjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dami.lernjava.ExamplePrograms.ExampleProgramsListActivity;
import com.example.dami.lernjava.Lessons.LessonListActivity;
import com.example.dami.lernjava.QuestionsAndAsks.QuestionsAndAsksListActivity;
import com.example.dami.lernjava.Test.TestListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView learn = (TextView) findViewById(R.id.learn_text_view);
        learn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, LessonListActivity.class);
                startActivity(i);
            }
        });

        TextView questionAndAsk = (TextView) findViewById(R.id.questions_and_answers_text_view);
        questionAndAsk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, QuestionsAndAsksListActivity.class);
                startActivity(i);
            }
        });

        TextView examplePrograms = (TextView) findViewById(R.id.example_programs_text_view);
        examplePrograms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, ExampleProgramsListActivity.class);
                startActivity(i);
            }
        });

        TextView test = (TextView) findViewById(R.id.test_text_view);
        test.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, TestListActivity.class);
                startActivity(i);
            }
        });
    }
}
