package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int lastTeam;
    int undoLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void putTouchdownTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayScoreTeamA(scoreTeamA);
        lastTeam = 1;
        undoLast = 6;
    }

    public void putExtraPointTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        lastTeam = 1;
        undoLast = 1;
    }

    public void putTwoPointConversionTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
        lastTeam = 1;
        undoLast = 2;
    }

    public void putFieldGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
        lastTeam = 1;
        undoLast = 3;
    }

    public void putSafetyTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
        lastTeam = 1;
        undoLast = 2;
    }

    public void putTouchdownTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayScoreTeamB(scoreTeamB);
        lastTeam = 2;
        undoLast = 6;
    }

    public void putExtraPointTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        lastTeam = 2;
        undoLast = 1;
    }

    public void putTwoPointConversionTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
        lastTeam = 2;
        undoLast = 2;
    }

    public void putFieldGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
        lastTeam = 2;
        undoLast = 3;
    }

    public void putSafetyTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
        lastTeam = 2;
        undoLast = 2;
    }

    public void undoLastBtn(View view) {
        if (lastTeam == 1) {
            scoreTeamA = scoreTeamA - undoLast;
            displayScoreTeamA(scoreTeamA);
            undoLast = 0;
        } else if (lastTeam == 2) {
            scoreTeamB = scoreTeamB - undoLast;
            displayScoreTeamB(scoreTeamB);
            undoLast = 0;
        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        undoLast = 0;
    }

   /*
    public void displayValues(View view) {
        showDisplayLastTeam(lastTeam);
        showDisplayUndoValue(undoLast);
    }


    private void showDisplayLastTeam(int showThing) {
        TextView displayValuesTextView = (TextView) findViewById(R.id.undoLastValue);
        displayValuesTextView.setText("" + showThing);
    }

    private void showDisplayUndoValue(int showThingTwo) {
        TextView displayThingTwo = (TextView) findViewById(R.id.teamValue);
        displayThingTwo.setText("" + showThingTwo);
    }
    */

    private void displayScoreTeamA(int totalScoreTeamA) {
        TextView teamATextView = (TextView) findViewById(R.id.scoreTeamA_text_view);
        teamATextView.setText("" + totalScoreTeamA);
    }

    private void displayScoreTeamB(int totalScoreTeamB) {
        TextView teamBTextView = (TextView) findViewById(R.id.scoreTeamB_text_view);
        teamBTextView.setText("" + totalScoreTeamB);
    }
}
