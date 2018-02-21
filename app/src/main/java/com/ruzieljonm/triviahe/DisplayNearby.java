package com.ruzieljonm.triviahe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class DisplayNearby extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_nearby);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

    }

    private void setSingleEvent(GridLayout mainGrid){
        //loop all child item of main grid
        for(int i =0; i<mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){

                    if(finalI == 0){
                        Intent intent = new Intent(DisplayNearby.this, DisplaySpot.class);
                        startActivity(intent);
                    }

//                    Intent intent = new Intent(DisplayNearby.this, DisplaySpot.class);
//                    intent.putExtra("info","This is activity from card item index " + finalI);
//                    startActivity(intent);
                }
            });


        }
    }

}
