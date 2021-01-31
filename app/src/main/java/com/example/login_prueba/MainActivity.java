package com.example.login_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   String user;
   String pass;
   Button btnverifica;

   Button btniniciar;
   Button btnregistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnverifica=findViewById(R.id.btnverifica);
        btniniciar=findViewById(R.id.btniniciar);
        btnregistrar=findViewById(R.id.btnregristrar);
        user=findViewById(R.id.txtuser).toString();
        pass=findViewById(R.id.txtpassord).toString();

        btnverifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validavacio()){
                    Toast.makeText(getApplicationContext(),"Campos vacios",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Campos lleno",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public boolean validavacio(){
        if(user.isEmpty() && pass.isEmpty()){

        return false;
        }
        return true;
    }



}