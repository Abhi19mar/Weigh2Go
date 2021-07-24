package com.example.weigh2go;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private String text1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner list1=findViewById(R.id.workouttype);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.workout_types,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        list1.setAdapter(adapter);
        list1.setOnItemSelectedListener(this);

        final Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.equals("Chest")) {
                    Intent i = new Intent(MainActivity.this, Chest.class);
                    startActivity(i);
                }
                if (text1.equals("Back")) {
                    Intent i = new Intent(MainActivity.this, Back.class);
                    startActivity(i);
                }
                if (text1.equals("Triceps")) {
                    Intent i = new Intent(MainActivity.this, Triceps.class);
                    startActivity(i);
                }
                if (text1.equals("Abs")) {
                    Intent i = new Intent(MainActivity.this, Abs.class);
                    startActivity(i);
                }
                if (text1.equals("Shoulders")) {
                    Intent i = new Intent(MainActivity.this, Shoulder.class);
                    startActivity(i);
                }
                if (text1.equals("Legs")) {
                    Intent i = new Intent(MainActivity.this, Legs.class);
                    startActivity(i);
                }
                if (text1.equals("Biceps")) {
                    Intent i = new Intent(MainActivity.this, Biceps.class);
                    startActivity(i);
                }
                if (text1.equals("Diet Plan")) {
                    Intent i = new Intent(MainActivity.this, Diet.class);
                    startActivity(i);
                }
                if(text1.equals("Body Mass Index(BMI)")){
                    Intent i = new Intent(MainActivity.this,Body.class);
                    startActivity(i);

                }


            }














        }

        );





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


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.workouttype)
        {
            text1=parent.getItemAtPosition(position).toString();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }








}
