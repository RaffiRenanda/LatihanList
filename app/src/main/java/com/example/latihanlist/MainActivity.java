package com.example.latihanlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin = findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada Layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variabel edpasssword dengan componen button pada Layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user edittext email kedalam variabel nama
                password = edpassword.getText().toString();


                if (nama.equals("raffi@gmail.com") && password.equals("raffi")) {
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();



                    //membuat object untuk pindah halaman
                    Intent i = new Intent(MainActivity.this, ActivityHome.class);

                    startActivity(i);

                } else if (nama.equals(nama) && password.equals("raffi")) {
                    Toast.makeText(MainActivity.this, "Nama yang anda masukkan salah", Toast.LENGTH_SHORT).show();
                } else if (nama.equals("raffi@gmail.com") && password.equals(password)) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email dan Password salah", Toast.LENGTH_SHORT).show();
                }

            }


        });
    }
}