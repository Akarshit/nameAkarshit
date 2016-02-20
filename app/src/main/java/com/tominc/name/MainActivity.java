package com.tominc.name;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    Button submit;
    TextView fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (EditText) findViewById(R.id.first_name);
        lastName = (EditText) findViewById(R.id.last_name);
        submit = (Button) findViewById(R.id.submit);
        fullName = (TextView) findViewById(R.id.full_name);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = firstName.getText().toString();
                String last = lastName.getText().toString();
                String full = first + " " + last;
                fullName.setVisibility(View.VISIBLE);
                fullName.setText(full);
            }
        });
    }
}
