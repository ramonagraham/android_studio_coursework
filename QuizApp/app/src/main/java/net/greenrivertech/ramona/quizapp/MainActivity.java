package net.greenrivertech.ramona.quizapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private QuizModel model = new QuizModel();
    private QuestionModel currentQuestion;
    private Button next;
    private Button previous;
    private int questionNumber = 0;
    final static int minNumberQuestions = 0; // min represents the array's 0 element
    final static int maxNumberQuestions = 3; // max represents the array's last number of elements


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        currentQuestion = model.getQuestion(questionNumber);

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion(questionNumber));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void handleTrue(View view) {
        // if android:text = true and model.response = true
        if(currentQuestion.getResponse() == true) {
            Toast.makeText(this,
                    "You are right!",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,
                    "You are incorrect!",
                    Toast.LENGTH_SHORT).show();
        }
        questionNumber++;
        if (questionNumber > maxNumberQuestions) {
            questionNumber = minNumberQuestions;
        }
        currentQuestion = model.getQuestion(questionNumber);

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion(questionNumber));
    }


    public void handleFalse(View view) {
        //if android:test == false and model.response == false
        if(currentQuestion.getResponse() == false) {
            Toast.makeText(this,
                    "You are right!",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,
                    "You are incorrect!",
                    Toast.LENGTH_SHORT).show();
        }

        questionNumber++;
        if (questionNumber > maxNumberQuestions) {
            questionNumber = minNumberQuestions;
        }

        currentQuestion = model.getQuestion(questionNumber);

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion(questionNumber));
    }

    public void handleNext (View view) {
        if (view == next) {
            questionNumber++;
            currentQuestion = model.getQuestion(questionNumber);
            TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
            textQuestion.setText(currentQuestion.getQuestion(questionNumber));
        }
// else if (view == previous){
//            questionNumber--;
//            currentQuestion = model.getQuestion(questionNumber);
//        }
    }

    public void handlePrevious (View view) {
        if (view == previous) {
            questionNumber--;
            currentQuestion = model.getQuestion(questionNumber);
            TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
            textQuestion.setText(currentQuestion.getQuestion(questionNumber));
        }
    }
}

