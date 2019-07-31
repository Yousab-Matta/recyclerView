package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText name,pass;
    private Button add;
    private RecyclerView recyclerView;
    private ArrayList<String> wName;
    private ArrayList<String> wPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        pass = findViewById(R.id.Pass);
        add = findViewById(R.id.Button);
        wName = new ArrayList<>();
        wPass = new ArrayList<>();


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = name.getText().toString();
                String y = pass.getText().toString();

                wName.add(x);
                wPass.add(y);
            }
        });

        recyclerView = findViewById(R.id.RecyclerView);
        recyclerViewAdapter adapter = new recyclerViewAdapter(wName,wPass,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
