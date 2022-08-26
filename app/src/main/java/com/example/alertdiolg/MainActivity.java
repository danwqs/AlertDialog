package com.example.alertdiolg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view00) {

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar Titulo e Mensagem
        dialog.setTitle("Titulo da Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Configurar Cancelamento
        dialog.setCancelable(false);

        //Configurar ícone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        //Configurar acões para sim e não
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(
                        getApplicationContext(), "Executar ação ao clicar no botão Confirmar",
                        Toast.LENGTH_LONG
                ).show();

            }
        });

        dialog.setNegativeButton("Negar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(
                        getApplicationContext(), "Executar ação ao clicar no botão Negar",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }

}