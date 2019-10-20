package com.incident.tracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: //Accident
                        Intent intent = new Intent(MainActivity.this, AccidentCategoryActivity.class);
                        startActivity(intent);
                        break;
                    case 1: //Wheather
                        Toast.makeText(getApplicationContext(), "Wheather Category has not implemented yet", Toast.LENGTH_LONG).show();
                        break;
                    case 2: //Road Condition
                        Toast.makeText(getApplicationContext(), "Road Condition Category has not implemented yet", Toast.LENGTH_LONG).show();
                        break;
                    case 3: //Robbery
                        Toast.makeText(getApplicationContext(), "Robbery Category has not implemented yet", Toast.LENGTH_LONG).show();
                        break;
                    case 4: //Murder
                        Toast.makeText(getApplicationContext(), "Murder Category has not implemented yet", Toast.LENGTH_LONG).show();
                        break;
                    default: //Nothing
                        Log.d(TAG, "onItemClick: position not avaliable");
                        break;
                }
            }
        };

        ListView lw = (ListView) findViewById(R.id.listView);
        lw.setOnItemClickListener(itemClickListener);
    }
}
