package com.ruzieljonm.triviahe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DisplayReviews extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editReviews;
    Button button_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_reviews);

        myDb = new DatabaseHelper(this);

        editReviews = (EditText)findViewById(R.id.editText_Review);
        button_add = (Button)findViewById(R.id.button_add);
        AddData();
    }

    public void AddData(){
        button_add.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = myDb.insertData("User", editReviews.getText().toString());
                        if (isInserted = true)
                            Toast.makeText(DisplayReviews.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(DisplayReviews.this, "Data not Inserted", Toast.LENGTH_SHORT).show();


                    }
                }
        );
    }
}
