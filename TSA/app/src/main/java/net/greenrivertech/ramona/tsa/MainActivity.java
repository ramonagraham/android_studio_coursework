package net.greenrivertech.ramona.tsa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

        Random randomNumber = new Random();
       int buttonTap = randomNumber.nextInt(2) + 1;


        if (buttonTap == 1) {
            ImageView arrowRight = (ImageView) findViewById(R.id.imageViewRight);
            arrowRight.setVisibility(View.VISIBLE);
        } else {
            ImageView arrowLeft = (ImageView) findViewById(R.id.imageViewLeft);
            arrowLeft.setVisibility(View.VISIBLE);
        }



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

    public void handleButtonClick(View view) {
           Toast.makeText(
                   this,
                   "follow the arrow for the line",
                   Toast.LENGTH_SHORT).show();

        Random randomNumber = new Random();
        int buttonTap = randomNumber.nextInt(2) + 1;

        ImageView arrowLeft = (ImageView) findViewById(R.id.imageViewLeft);
        ImageView arrowRight = (ImageView) findViewById(R.id.imageViewRight);


        //comment
        if (buttonTap == 1) {
            arrowLeft.setVisibility(View.GONE);
            arrowRight.setVisibility(View.VISIBLE);

        } else {
            arrowRight.setVisibility(View.GONE);
            arrowLeft.setVisibility(View.VISIBLE);
        }
    }
}
