package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Dashboard extends AppCompatActivity {
public static String teamOne,teamTwo;
EditText one,two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        one=findViewById(R.id.txtTeamA);
        two=findViewById(R.id.txtTeamB);
    }

    public void StartGame(View view) {
        teamOne=one.getText().toString();
        teamTwo=two.getText().toString();
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
