package com.example.whiskyhunterapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Whisky_Distillerries_Info extends AppCompatActivity {
    ListView list;
    ArrayList<String> names1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky_distillerries_info);

        list = findViewById(R.id.list_Distilleries);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names1);
        list.setAdapter(arrayAdapter);

        Call<List<PosstDistilleries>> call = RetrofitDistilleries.getInstance().getMyApi().getDistilleries();
        call.enqueue(new Callback<List<PosstDistilleries>>() {
            @Override
            public void onResponse(Call<List<PosstDistilleries>> call, Response<List<PosstDistilleries>> response) {
                for (PosstDistilleries post : response.body())
                {
                    names1.add(post.getNameDistilleries());
                }
                arrayAdapter.notifyDataSetChanged();


            }


            @Override
            public void onFailure(Call<List<PosstDistilleries>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_LONG).show();
            }
        });
    }
}