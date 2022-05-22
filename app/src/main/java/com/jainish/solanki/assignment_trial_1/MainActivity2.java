package com.jainish.solanki.assignment_trial_1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }





    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Student Welfare Group");
        m.setImg(R.drawable.ic_launcher_background);
        m.setDescription("it is a society that works for the welfare of students in academic as well as mentorship and conducts various events. ");
        models.add(m);

        m = new Model();
        m.setTitle("Kshitij");
        m.setImg(R.drawable.ic_launcher_background);
        m.setDescription("a society that manages fests in iit kgp and also invites major celebrities on iit kgp platform.");
        models.add(m);

        m = new Model();
        m.setTitle("Spring Fest");
        m.setImg(R.drawable.ic_launcher_background);
        m.setDescription("majorly coordinates the Spring Fest and improves it.");
        models.add(m);

        m = new Model();
        m.setTitle("Institute Wellness Group");
        m.setImg(R.drawable.ic_launcher_background);
        m.setDescription("wellness most imp society takes care of this and helps students of iit Kgp");
        models.add(m);

        m = new Model();
        m.setTitle("Encore");
        m.setImg(R.drawable.ic_launcher_background);
        m.setDescription("encore is a good society..................................");
        models.add(m);

        return models;


    }

}