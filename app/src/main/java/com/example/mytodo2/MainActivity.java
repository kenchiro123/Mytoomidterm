package com.example.mytodo2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


import com.example.mytodo2.model.Auth;

public class MainActivity extends AppCompatActivity {
    private static final String EMAIL = "ken@hotmail.com"; //**
    private static final String PASSWORD = "123456"; //**

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbuttom =findViewById(R.id.login_button);

        loginbuttom.setOnClickListener(new View.OnClickListener() {
                             Toast t=Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT);

            @Override
            public void onClick(View view) {
                EditText eamieditText=findViewById(R.id.email_edit);
                EditText paswordeditText=findViewById(R.id.password_edit);
                CheckBox checkBox = findViewById(R.id.checkBox);

                String inputemail=eamieditText.getText().toString();
                String inputpasword=paswordeditText.getText().toString();

               Auth auth = new Auth(inputemail,inputpasword);
                Boolean c = auth.check();
                if(c==true){
                    if(checkBox.isChecked()==true){
                        Toast.makeText(MainActivity.this,"คุณเลือกจำรหัสผ่าน",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"คุณไม่เลือกจำรหัสผ่าน",Toast.LENGTH_SHORT).show();
                    }
                    /*Toast.makeText(MainActivity.this,R.string.login_success,Toast.LENGTH_SHORT).show();*/

                }
                else{
                    AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                     dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {

                         }
                     });
                     dialog.setNegativeButton("cacel", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {

                         }
                     });
                     dialog.setNeutralButton("Innote", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {

                         }
                     });
                     dialog.show();

                }
            }
        });
    }
}
