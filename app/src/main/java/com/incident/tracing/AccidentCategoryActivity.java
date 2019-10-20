package com.incident.tracing;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AccidentCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident_category);

        ArrayAdapter<Accident> adapter = new ArrayAdapter<Accident>(this,
                android.R.layout.simple_expandable_list_item_1,
                Accident.accidents);

        ListView lw = (ListView) findViewById(android.R.id.list);
        lw.setAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(AccidentCategoryActivity.this, AccidentActivity.class);
        intent.putExtra(AccidentActivity.EXTRA_ACCIDENTNO, (int) id);
        startActivity(intent);
    }

}
