package br.uninove.combustivel.combustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Principal extends AppCompatActivity {


    EditText txtGasolina;
    EditText txtAlcool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtGasolina = (EditText) findViewById(R.id.txtGasolina);
        txtAlcool = (EditText) findViewById(R.id.txtAlcool);

    }
}
