package com.example.latihanlist;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    Bundle bundle = getIntent().getExtras();
    String nama = bundle.getString("a");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lihatdata_activity);


        switch (nama)
        {
            case "Raffi":
                tvnama.setText("Raffi Renanda");
                tvnomor.setText("083867600369");
                break;
            case "Nisa":
                tvnama.setText("Khoirunisa");
                tvnomor.setText("083554667534");
                break;
            case "Azis":
                tvnama.setText("Haji Azis");
                tvnomor.setText("087838298788");
                break;
            case "Eny":
                tvnama.setText("Raden Rara Eny");
                tvnomor.setText("081987645643");
                break;
            case "Rama":
                tvnama.setText("Rama Dzaky");
                tvnomor.setText("081786543099");
                break;
            case "Syinta":
                tvnama.setText("Syinta Kamila");
                tvnomor.setText("081267876000");
                break;
            case "Wahyu":
                tvnama.setText("Wahyu Kurniawan");
                tvnomor.setText("08386234543");
                break;
            case "Zahra":
                tvnama.setText("Azahra");
                tvnomor.setText("083867603324");
                break;
            case "Nayla":
                tvnama.setText("Nayla Putri");
                tvnomor.setText("084778665432");
                break;
            case "Dani":
                tvnama.setText("Moh Dani");
                tvnomor.setText("083432566871");
                break;
            case "Ninda":
                tvnama.setText("Aninda");
                tvnomor.setText("083657899009");
                break;
        }
    }
}
