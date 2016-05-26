package net.greenrivertech.ramona.quizapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private QuizModel model = new QuizModel();
    private QuestionModel currentQuestion;

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

        currentQuestion = model.getQuestion();

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion());
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
        currentQuestion = model.getQuestion();

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion());
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
        currentQuestion = model.getQuestion();

        TextView textQuestion = (TextView) findViewById(R.id.textViewQuestion);
        textQuestion.setText(currentQuestion.getQuestion());
    }
}
