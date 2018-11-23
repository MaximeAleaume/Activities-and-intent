package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);


        Intent receptVoyage = getIntent();
        String voyage1 = receptVoyage.getStringExtra(ItinerarySearchActivity.MESSAGE_TO_VOYAGE);


        setTitle(voyage1);
        //textView.setText(voyage1);
    }
}

