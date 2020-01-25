package br.digitalhouse.ciclodevidaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Ciclo","----> CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo", "-----> START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo", "----> RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo", "----> PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo", "----> STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo", "----> DESTROY");
    }
}
