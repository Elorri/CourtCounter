package com.elorri.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Object representing the teamA
    Team teamA = new Team();

    //Object representing the teamB
    Team teamB = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        teamA.setScore(teamA.getScore()+1);
        displayForTeamA(teamA.getScore());
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        teamA.setScore(teamA.getScore()+2);
        displayForTeamA(teamA.getScore());
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        teamA.setScore(teamA.getScore()+3);
        displayForTeamA(teamA.getScore());
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        teamB.setScore(teamB.getScore()+1);
        displayForTeamB(teamB.getScore());
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        teamB.setScore(teamB.getScore()+2);
        displayForTeamB(teamB.getScore());
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        teamB.setScore(teamB.getScore()+3);
        displayForTeamB(teamB.getScore());
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        teamA.resetScore();
        teamB.resetScore();
        displayForTeamA(teamA.getScore());
        displayForTeamB(teamB.getScore());
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
