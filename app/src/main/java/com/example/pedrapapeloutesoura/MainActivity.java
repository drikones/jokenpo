package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] opcoesImagem = {R.drawable.pedra,R.drawable.papel,R.drawable.tesoura};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int escolhaCPU (){
        ImageView imgApp = findViewById(R.id.imgOpcaoApp);
        int escolhaApp = (int)(Math.random() * opcoesImagem.length);
        imgApp.setImageResource(opcoesImagem[escolhaApp]);
        return opcoesImagem[escolhaApp];
    }

    public void pedra(View view){
        TextView resultado = findViewById(R.id.txtResultado);
        int escolhaApp = escolhaCPU();
        switch(escolhaApp){
            case R.drawable.pedra:
                resultado.setText(R.string.empate);
                break;
            case R.drawable.papel:
                resultado.setText(R.string.derrota);
                break;
            case R.drawable.tesoura:
                resultado.setText(R.string.vitoria);
                break;
            default:
                resultado.setText(R.string.escolha_opcao);
                break;
        }
    }

    public void papel(View view){
        TextView resultado = findViewById(R.id.txtResultado);
        int escolhaApp = escolhaCPU();
        switch(escolhaApp){
            case R.drawable.pedra:
                resultado.setText(R.string.vitoria);
                break;
            case R.drawable.papel:
                resultado.setText(R.string.empate);
                break;
            case R.drawable.tesoura:
                resultado.setText(R.string.derrota);
                break;
            default:
                resultado.setText(R.string.escolha_opcao);
                break;
        }
    }

    public void tesoura(View view){
        TextView resultado = findViewById(R.id.txtResultado);
        int escolhaApp = escolhaCPU();
        switch(escolhaApp){
            case R.drawable.pedra:
                resultado.setText(R.string.derrota);
                break;
            case R.drawable.papel:
                resultado.setText(R.string.vitoria);
                break;
            case R.drawable.tesoura:
                resultado.setText(R.string.empate);
                break;
            default:
                resultado.setText(R.string.escolha_opcao);
                break;
        }
    }
}