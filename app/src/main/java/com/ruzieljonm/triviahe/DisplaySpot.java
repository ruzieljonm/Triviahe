package com.ruzieljonm.triviahe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;


public class DisplaySpot extends AppCompatActivity {

    CardView photosCard;
    CardView ratingsCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_spot);


        photosCard = (CardView) findViewById(R.id.photosCard);
        photosCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DisplaySpot.this, DisplayPhotos.class);
                startActivity(i);

            }

        });

        ratingsCard = (CardView) findViewById(R.id.ratingsCard);
        ratingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DisplaySpot.this, DisplayReviews.class);
                startActivity(i);

            }

        });

    }

}
