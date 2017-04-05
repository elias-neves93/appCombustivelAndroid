package br.uninove.combustivel.combustivel;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate (Bundle saveIntanceState) {
        super.onCreate(saveIntanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(this,2000);

    }

    @Override
    public void run() {
        Intent it = new Intent(this, Principal.class);
        startActivity(it);
        finish();
    }
}