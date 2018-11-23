package fr.wcs.blablawild;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ItinerarySearchActivity extends AppCompatActivity {


    public static final String MESSAGE_TO_VOYAGE = "MESSAGEVOYAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);

        Button button = findViewById(R.id.search_button);

        final EditText zDepart = (EditText) findViewById(R.id.departure_text);
        final EditText zArrive = (EditText) findViewById(R.id.destinations_text);



        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast);
        int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context, text, duration);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){


                String depart = zDepart.getText().toString();
                String arrive = zArrive.getText().toString();

                String voyage=depart + " >>> " + arrive;

                Intent goToList = new Intent(getApplicationContext(), ItineraryListActivity.class);



                if (depart.equals("") || arrive.equals("")) {
                    toast.show();
                } else {
                goToList.putExtra(MESSAGE_TO_VOYAGE, voyage);
                startActivity(goToList);
            }
        }
    });


}
}




