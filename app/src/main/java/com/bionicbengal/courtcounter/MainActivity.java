package com.bionicbengal.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAPts=0;
    int TeamBPts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayA(int score){
        TextView scoreView=(TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void submit3PtsA (View view){
        TeamAPts+=3;
        displayA(TeamAPts);
    }
    public void submit2PtsA (View view){
        TeamAPts+=2;
        displayA(TeamAPts);
    }
    public void submitFreeThrowA (View view){
        TeamAPts+=1;
        displayA(TeamAPts);
    }

    public void displayB(int score){
        TextView scoreView=(TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void submit3PtsB (View view){
        TeamBPts+=3;
        displayB(TeamBPts);
    }
    public void submit2PtsB (View view){
        TeamBPts+=2;
        displayB(TeamBPts);
    }
    public void submitFreeThrowB (View view){
        TeamBPts+=1;
        displayB(TeamBPts);
    }

    public void resetValues (View view){
        TeamAPts=0;
        TeamBPts=0;
        displayA(TeamAPts);
        displayB(TeamBPts);
    }

}