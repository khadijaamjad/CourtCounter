package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
char winnerTeam;
int scoreA, scoreB;
TextView tvA,tvB,teamA,teamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvA=findViewById(R.id.scoreA);
        tvB=findViewById(R.id.scoreB);
        teamA=findViewById(R.id.teamA);
        teamB=findViewById(R.id.teamB);
        scoreA=0;
        scoreB=0;
        tvA.setText(""+scoreA);
        tvB.setText(""+scoreB);
        teamA.setText(Dashboard.teamOne);
        teamB.setText(Dashboard.teamTwo);
    }

    public void ResetScore(View view) {
        scoreA=0;
        scoreB=0;
        tvA.setText(""+scoreA);
        tvB.setText(""+scoreB);
    }

    public void AddScore(View view) {
        int btnID=view.getId();
        if(btnID==R.id.A2)
            scoreA+=2;
        else if(btnID==R.id.A3)
            scoreA+=3;
        else if(btnID==R.id.Afree)
            scoreA+=1;
        else if(btnID==R.id.B2)
            scoreB+=2;
        else if(btnID==R.id.B3)
            scoreB+=3;
        else if(btnID==R.id.Bfree)
            scoreB+=1;
        tvA.setText(""+scoreA);
        tvB.setText(""+scoreB);
    }

    public void EndGame(View view) {
        if(scoreA>scoreB)
        {    winnerTeam='A';   }
        if(scoreB>scoreA)
        {    winnerTeam='B';  }
        if(scoreA==scoreB)
        {    winnerTeam='D';   }
        Intent i=new Intent(this,GameEnd.class);
        i.putExtra("winner",winnerTeam);
        startActivity(i);
    }
}
