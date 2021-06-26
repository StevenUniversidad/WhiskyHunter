package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controladorWhisky();
        controladorDistilleies();
    }


    public void controladorWhisky() {

        ImageView entry = (ImageView) findViewById(R.id.pasar);

//hago clic y se abre el 2
        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), Whisky_Auctions_Info.class);
                startActivity(ListSong);
            }
        });

    }
    public void controladorDistilleies() {

        ImageView entry = (ImageView) findViewById(R.id.pasardesti);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), Whisky_Distillerries_Info.class);
                startActivity(ListSong);
            }
        });

    }
}