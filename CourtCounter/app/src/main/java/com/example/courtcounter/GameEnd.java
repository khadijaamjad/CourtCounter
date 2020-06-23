package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GameEnd extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_end);
        tv=findViewById(R.id.winner);
        Intent i=getIntent();
        char winnerTeam=i.getCharExtra("winner",' ');
        if(winnerTeam=='A')
        {   tv.setText("TEAM "+Dashboard.teamOne+" !!!");  }
        if(winnerTeam=='B')
        {   tv.setText("TEAM "+Dashboard.teamTwo+" !!!");  }
        if(winnerTeam==' '|| winnerTeam=='D')
        {  tv.setText("Neither. It's a Tie");  }
    }
}
