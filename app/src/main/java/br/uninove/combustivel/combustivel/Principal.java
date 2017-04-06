package br.uninove.combustivel.combustivel;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void verificaMelhorOpcao(View view){
        Cotacao c = new Cotacao();
        c.setValorGasolina(Double.parseDouble(txtGasolina.getText().toString()));
        c.setValorAlcool(Double.parseDouble(txtAlcool.getText().toString()));

        Intent it = new Intent(this, CalcularActivity.class);
        it.putExtra("objCotacao", c);
        startActivity(it);

    }
}
