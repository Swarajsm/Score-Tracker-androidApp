package in.swarajmahindre.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(int number){
        TextView scoreTextView = (TextView) findViewById(R.id.score_text);
        scoreTextView.setText("" + score);
    }

    public void addTwo(View view){

        score = score + 2;
        displayScore(score);
    }

    public  void addThree(View view){

        score = score + 3;
        displayScore(score);
    }

    public void freePoint(View view){
        score = score +1;
        displayScore(score);
    }


    public void reset(View view){
        score = 0;
        displayScore(score);
    }
}