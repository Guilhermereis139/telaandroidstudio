package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
    }

    public void carregarMenu(View v){
        setContentView(R.layout.menu_principal);
    }
    public void carregarConstraintLayout(View v){
        setContentView(R.layout.activity_main);
    }
    public void carregarTableLayout(View v){
        setContentView(R.layout.tabela);
    }
}