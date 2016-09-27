package com.android.vicky.explicitintentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CourseName extends AppCompatActivity {
    ListView listItem;
    private String[] courseArray = { "ANDROID DEVELOPMENT", "BIG DATA DEVELOPMENT", "FRONT END DEVELOPMENT", "ROBOTICS", "NODE JS" };
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_name);

        listItem = (ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(CourseName.this,R.layout.list_link_up,courseArray);
        listItem.setAdapter(arrayAdapter);

        listItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mentorActivity = new Intent(CourseName.this,MentorName.class);
                mentorActivity.putExtra("CourseName",((TextView) view).getText());
                startActivity(mentorActivity);
            }
        });
    }
}
