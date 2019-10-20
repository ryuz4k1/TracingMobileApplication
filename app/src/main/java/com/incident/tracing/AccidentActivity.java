package com.incident.tracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AccidentActivity extends AppCompatActivity {

    public static final String EXTRA_ACCIDENTNO = "accidentNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident);

        //Get the drink from the intent
        int accidentNo = (Integer)getIntent().getExtras().get(EXTRA_ACCIDENTNO);
        Accident accident = Accident.accidents[accidentNo];

        //Populate the accident image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(accident.getImageResourceID());
        photo.setContentDescription(accident.getName());

        //Populate the accident name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(accident.getName());

        //Populate the accident description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(accident.getDescription());
    }

    public void onClickInformationActivity(View view){
        Intent intent = new Intent(AccidentActivity.this, InformationActivity.class);
        startActivity(intent);
    }
}
