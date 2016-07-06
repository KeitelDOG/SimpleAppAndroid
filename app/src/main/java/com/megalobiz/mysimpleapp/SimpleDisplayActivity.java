package com.megalobiz.mysimpleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleDisplayActivity extends AppCompatActivity {

    private EditText etWords;
    private TextView tvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create the Layout in memory
        setContentView(R.layout.activity_simple_display);
        //Views are created in the Layout
        //find reference to those views
        etWords = (EditText) findViewById(R.id.etWords);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
    }

    public void onSubmit(View view) {
        String value = etWords.getText().toString();

        tvLabel.setText(value);
    }
}
