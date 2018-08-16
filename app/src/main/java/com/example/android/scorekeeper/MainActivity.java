package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;
    int possessionForTeamA = 50;
    int possessionForTeamB = 50;
    int foulsByTeamA = 0;
    int foulsByTeamB = 0;
    int shortsForTeamA = 0;
    int shortsForTeamB = 0;
    int cornersForTeamA = 0;
    int cornersForTeamB = 0;
    int chancesForTeamA = 0;
    int chancesForTeamB = 0;
    int yellowCardsForTeamA = 0;
    int yellowCardsForTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Score For Team A
     */
    public void scoresForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Score for Team B
     */
    public void scoresForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * possession For Team A
     */
    public void teamAPossession(View view) {
        possessionForTeamA = possessionForTeamA + 1;
        possessionForTeamB = possessionForTeamB - 1;
        displayPossessionForTeamA(possessionForTeamA);
        displayPossessionForTeamB(possessionForTeamB);
    }

    /**
     * possession For Team B
     */
    public void teamBPossession(View view) {
        possessionForTeamB = possessionForTeamB + 1;
        possessionForTeamA = possessionForTeamA - 1;
        displayPossessionForTeamB(possessionForTeamB);
        displayPossessionForTeamA(possessionForTeamA);
    }

    /**
     * Fouls Committed by Team A
     */
    public void foulsCommittedByTeamA(View view) {
        foulsByTeamA = foulsByTeamA + 1;
        displayFoulsCommittedByTeamA(foulsByTeamA);
    }

    /**
     * Fouls committed by Team B
     */
    public void foulsCommittedByTeamB(View view) {
        foulsByTeamB = foulsByTeamB + 1;
        displayFoulsCommittedByTeamB(foulsByTeamB);
    }

    /**
     * Shorts on Target for team A
     */
    public void shortsOnTargetForTeamA(View view) {
        shortsForTeamA = shortsForTeamA + 1;
        displayShortsOnTargetForTeamA(shortsForTeamA);
    }

    /**
     * Shorts on Target for team B
     */
    public void shortsOnTargetForTeamB(View view) {
        shortsForTeamB = shortsForTeamB + 1;
        displayShortsOnTargetForTeamB(shortsForTeamB);
    }

    /**
     * Corners for team A
     */
    public void cornersForTeamA(View view) {
        cornersForTeamA = cornersForTeamA + 1;
        displayCornersForTeamA(cornersForTeamA);
    }

    /**
     * Corners for Team B
     */
    public void cornersForTeamB(View view) {
        cornersForTeamB = cornersForTeamB + 1;
        displayCornersForTeamB(cornersForTeamB);
    }

    /**
     * Chances created by Team A
     */
    public void chancesCreatedByTeamA(View view) {
        chancesForTeamA = chancesForTeamA + 1;
        displayChancesCreatedByTeamA(chancesForTeamA);
    }

    /**
     * Chances created by Team B
     */
    public void chancesCreatedByTeamB(View view) {
        chancesForTeamB = chancesForTeamB + 1;
        displayChancesCreatedByTeamB(chancesForTeamB);
    }

    /**
     * Red cards for Team A
     */
    public void redCardsForTeamA(View view) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardsForTeamA(redCardsTeamA);
    }

    /**
     * Red cards for Team B
     */
    public void redCardsForTeamB(View view) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardsForTeamB(redCardsTeamB);
    }

    /**
     * Display red cards for team A
     */
    public void displayRedCardsForTeamA(int cardRed) {
        TextView cardRedView = (TextView) findViewById(R.id.red_cards);
        cardRedView.setText(String.valueOf(cardRed));
    }

    /**
     * Display red cards for team B
     */
    public void displayRedCardsForTeamB(int cardRed) {
        TextView cardRedView = (TextView) findViewById(R.id.red_cards_b);
        cardRedView.setText(String.valueOf(cardRed));
    }

    /**
     * Yellow cards for Team A
     */
    public void yellowCardsForTeamA(View view) {
        yellowCardsForTeamA = yellowCardsForTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsForTeamA);
    }

    /**
     * Yellow cards for Team B
     */
    public void yellowCardsForTeamB(View view) {
        yellowCardsForTeamB = yellowCardsForTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsForTeamB);
    }

    /**
     * Display yellow cards for team A
     */
    public void displayYellowCardsForTeamA(int card) {
        TextView cardView = (TextView) findViewById(R.id.yellow_cards);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Display yellow cards for team B
     */
    public void displayYellowCardsForTeamB(int card) {
        TextView cardView = (TextView) findViewById(R.id.yellow_cards_b);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Display chances created by Team A
     */
    public void displayChancesCreatedByTeamA(int chance) {
        TextView chanceView = (TextView) findViewById(R.id.chances_created);
        chanceView.setText(String.valueOf(chance));
    }

    /**
     * Display chances created by Team B
     */
    public void displayChancesCreatedByTeamB(int chance) {
        TextView chanceView = (TextView) findViewById(R.id.chances_created_b);
        chanceView.setText(String.valueOf(chance));
    }

    /**
     * Display corners for Team A
     */
    public void displayCornersForTeamA(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.corners);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Display corners for Team B
     */
    public void displayCornersForTeamB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.corners_b);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Display shorts on target for Team A
     */
    public void displayShortsOnTargetForTeamA(int shorts) {
        TextView shortsView = (TextView) findViewById(R.id.shorts_on_target);
        shortsView.setText(String.valueOf(shorts));
    }

    /**
     * Display shorts on target for Team B
     */
    public void displayShortsOnTargetForTeamB(int shorts) {
        TextView shortsView = (TextView) findViewById(R.id.shorts_on_target_b);
        shortsView.setText(String.valueOf(shorts));
    }

    /**
     * Display Fouls Committed by Team A
     */
    public void displayFoulsCommittedByTeamA(int foulsCommitted) {
        TextView foulsCommittedView = (TextView) findViewById(R.id.fouls_committed);
        foulsCommittedView.setText(String.valueOf(foulsCommitted));
    }

    /**
     * Display Fouls Committed by Team B
     */
    public void displayFoulsCommittedByTeamB(int foulsCommitted) {
        TextView foulsCommittedView = (TextView) findViewById(R.id.fouls_committed_b);
        foulsCommittedView.setText(String.valueOf(foulsCommitted));
    }

    /**
     * Display for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Possession for Team A
     */
    public void displayPossessionForTeamA(int possession) {
        TextView possessionView = (TextView) findViewById(R.id.possession);
        possessionView.setText(String.valueOf(possession));
    }

    /**
     * Display Possession for Team B
     */
    public void displayPossessionForTeamB(int possession) {
        TextView possessionView = (TextView) findViewById(R.id.possession_b);
        possessionView.setText(String.valueOf(possession));
    }

    /**
     * resets scores for both teams A and B to 0
     */
    public void reset(View view) {
        displayForTeamA(scoreForTeamA = 0);
        displayForTeamB(scoreForTeamB = 0);
        displayPossessionForTeamA(possessionForTeamA = 50);
        displayPossessionForTeamB(possessionForTeamB = 50);
        displayFoulsCommittedByTeamA(foulsByTeamA = 0);
        displayFoulsCommittedByTeamB(foulsByTeamB = 0);
        displayShortsOnTargetForTeamA(shortsForTeamA = 0);
        displayShortsOnTargetForTeamB(shortsForTeamB = 0);
        displayChancesCreatedByTeamA(chancesForTeamA = 0);
        displayChancesCreatedByTeamB(chancesForTeamB = 0);
        displayCornersForTeamA(cornersForTeamA = 0);
        displayCornersForTeamB(cornersForTeamB = 0);
        displayYellowCardsForTeamA(yellowCardsForTeamA = 0);
        displayYellowCardsForTeamB(yellowCardsForTeamB = 0);
        displayRedCardsForTeamA(redCardsTeamA = 0);
        displayRedCardsForTeamB(redCardsTeamB = 0);

    }
}


