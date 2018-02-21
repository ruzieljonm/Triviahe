package com.ruzieljonm.triviahe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button bttnFirstSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bttnFirstSwitch=(Button)findViewById(R.id.bttnFirstSwitch);
        bttnFirstSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i=new Intent(LoginActivity.this, DisplayNearby.class);
                    startActivity(i);

                }

            });
    }
}
