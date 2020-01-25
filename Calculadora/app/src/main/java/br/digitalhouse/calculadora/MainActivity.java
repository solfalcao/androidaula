package br.digitalhouse.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumeroUm;
    private EditText inputNumberDois;
    private Button botaoCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logicaBotaoCalcular();
            }

            });
    }

    private void logicaBotaoCalcular() {
        if(!inputNumeroUm.getText().toString().isEmpty() && !inputNumberDois.getText().toString().isEmpty()){

            int numero1 = Integer.parseInt(inputNumeroUm.getText().toString());
            int numero2 = Integer.parseInt(inputNumberDois.getText().toString());

           String resultado = String.valueOf(calcular(numero1, numero2));

           inputNumeroUm.getText().clear();
           inputNumberDois.getText().clear();

           textViewResultado.setText (resultado);

        }else{
            inputNumeroUm.setError("Campo inválido");
            inputNumberDois.setError("Campo inválido");

        }
    }

    private void initViews(){
        inputNumeroUm = findViewById(R.id.edit_text_numero_um);
        inputNumberDois = findViewById(R.id.edit_text_numero_dois);
        botaoCalcular = findViewById(R.id.botao_calcular);
        textViewResultado = findViewById(R.id.texto_resultado);

    }

    private int calcular(int numero1, int numero2){
        return numero1+numero2;
    }
}
