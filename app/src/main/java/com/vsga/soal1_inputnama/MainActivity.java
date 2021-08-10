package com.vsga.soal1_inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputNama;
    TextView tampilNama;
    Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNama=(EditText)findViewById(R.id.editTextNama);
        tampilNama=(TextView) findViewById(R.id.textTampil);
        hasil=(Button) findViewById(R.id.button);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampilNama.setText("Halo, "+inputNama.getText());
            }
        });


    }


}