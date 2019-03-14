package com.fernandomoraes.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button botaoSalvar = findViewById(R.id.formulario_buttonSalvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() { //Usando o conceito de classe anonima, cria-se um Listener, para que a gente
                                                                   //"ouça" quando o botão for clicado para ser tratado
            @Override
            public void onClick(View v) {
                Toast.makeText(FormularioActivity.this, "Botao Clicado!", Toast.LENGTH_SHORT).show();
                //Toast segue a ideia da torradeira: a mensagem "pula" na tela e fica pelo tempo que for definido pelo programador
            }
        });
    }
}
