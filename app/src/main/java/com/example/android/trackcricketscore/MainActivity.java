package com.example.android.trackcricketscore;

/**
 * Created by sandesha21 on 2019-09-14
 * Package name: com.example.android.trackcricketscore
 **/

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score and wickets for Team A
    int scoreTeamA = 0;
    int wicketsTeamA = 0;

    // Tracks the score and wickets for Team B
    int scoreTeamB = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 run.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 runs.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 runs.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 4 runs.
     */
    public void addFourForTeamA(View v) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 6 runs.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 run.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 runs.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 runs.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 4 runs.
     */
    public void addFourForTeamB(View v) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 6 runs.
     */
    public void addSixForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamAWicket(wicketsTeamA);
        displayForTeamBWicket(wicketsTeamB);
    }

    /**
     * Increase wicket fallen for Team A by 1.
     */
    public void OneMoreWicketTeamA(View v) {
        if (wicketsTeamA == 10) {
            return; // In cricket, team is all out after 10 wickets.
        } else {
            wicketsTeamA++;
            displayForTeamAWicket(wicketsTeamA);
        }
    }

    /**
     * Increase wicket fallen for Team B by 1.
     */
    public void OneMoreWicketTeamB(View v) {
        if (wicketsTeamB == 10) {
            return; // In cricket, team is all out after 10 wickets.
        } else {
            wicketsTeamB++;
            displayForTeamBWicket(wicketsTeamB);
        }
    }


    /**
     * Displays score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays wickets fallen for Team A.
     */
    public void displayForTeamAWicket(int wicket) {
        TextView wicketView = (TextView) findViewById(R.id.team_a_wicket);
        wicketView.setText(String.valueOf(wicket));
    }

    /**
     * Displays wickets fallen for Team B.
     */
    public void displayForTeamBWicket(int wicket) {
        TextView wicketsView = (TextView) findViewById(R.id.team_b_wicket);
        wicketsView.setText(String.valueOf(wicket));
    }
}