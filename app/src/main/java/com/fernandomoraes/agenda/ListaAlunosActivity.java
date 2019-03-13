package com.fernandomoraes.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity { // para mostrar algo na tela, você precisa de uma Activity no Android

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos); // R é a representação da pasta res(Reources), que é o atalho usado para
                                                       // acessar arquivos e pastas que estejam lá!
        /*
        Quando inserimos o findViewById ele devolve uma instância da View gerada no setContentView.
        Agora, falta guardar o findViewById. Vamos inserir na Activity uma variável ListView e nomeá-la ListaAluno.

         */
        String[] alunos = {"Alfredo","Klaus","Lady","Moleque"};
        ListView listaAlunos = (ListView)findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        /*No ArrayAdapter o contexto serve para identificação e o que faremos é passar uma referência para a própria Activity
        O segundo parâmetro é o Layout. Como utilizaremos um layout padrão vamos utilizar a classe R
        do próprio Android. Escrevendo, android.R.layout.simple_list_item_1 que é simplesmente um TextView
        que auxilia a mostrar o nome do aluno
        */
    }
}
