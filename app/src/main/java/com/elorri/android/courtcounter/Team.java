package com.elorri.android.courtcounter;

/**
 * Created by Elorri on 13/07/2016.
 */
public class Team {

    //The current score of the team
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void resetScore(){
        this.score=0;
    }
}
