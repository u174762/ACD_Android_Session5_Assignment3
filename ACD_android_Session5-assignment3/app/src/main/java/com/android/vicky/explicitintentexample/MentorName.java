package com.android.vicky.explicitintentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MentorName extends AppCompatActivity {
    TextView txtMentorName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_name);
        txtMentorName = (TextView)findViewById(R.id.mentorName);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String mentorName = extras.getString("CourseName");
            switch (mentorName){
                case "ANDROID DEVELOPMENT" :      txtMentorName.setText("Deepti Sharma");
                                                break;
                case "BIG DATA DEVELOPMENT" :               txtMentorName.setText("Suman Sarkar");
                                                break;
                case "FRONT END DEVELOPMENT" :          txtMentorName.setText("Rohit Panchali");
                                                break;
                case "ROBOTICS" :                txtMentorName.setText("Suraj Deshai");
                                                break;
                case "NODE JS" :                 txtMentorName.setText("Rahul Kumar");
                                                break;
            }
        }
    }
}
