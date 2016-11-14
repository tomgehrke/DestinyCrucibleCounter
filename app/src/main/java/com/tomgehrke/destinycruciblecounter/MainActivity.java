package com.tomgehrke.destinycruciblecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Create constants for scores
    static final int pointsPerKill = 100;
    static final int pointsPerZoneNeutralized = 25;
    static final int pointsPerZoneCaptured = 75;

    // Initialize variables for team scores
    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointsToScore(View v) {
        switch (v.getId()) {
            case R.id.team_one_kill_button:
                scoreTeamOne += pointsPerKill;
                updateTeamOneScore();
                break;
            case R.id.team_two_kill_button:
                scoreTeamTwo += pointsPerKill;
                updateTeamTwoScore();
                break;
            case R.id.team_one_neutralize_zone_button:
                scoreTeamOne += pointsPerZoneNeutralized;
                updateTeamOneScore();
                break;
            case R.id.team_two_neutralize_zone_button:
                scoreTeamTwo += pointsPerZoneNeutralized;
                updateTeamTwoScore();
                break;
            case R.id.team_one_capture_zone_button:
                scoreTeamOne += pointsPerZoneCaptured;
                updateTeamOneScore();
                break;
            case R.id.team_two_capture_zone_button:
                scoreTeamTwo += pointsPerZoneCaptured;
                updateTeamTwoScore();
                break;
            default:
                break;
        }
    }

    public void resetScores(View v) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        updateScores();
    }

    public void updateScores() {
        updateTeamOneScore();
        updateTeamTwoScore();
    }

    public void updateTeamOneScore() {
        TextView teamOneScoreTextView = (TextView) findViewById(R.id.team_one_score_textview);
        teamOneScoreTextView.setText(String.valueOf(scoreTeamOne));
    }

    public void updateTeamTwoScore() {
        TextView teamOneScoreTextView = (TextView) findViewById(R.id.team_two_score_textview);
        teamOneScoreTextView.setText(String.valueOf(scoreTeamTwo));
    }
}
