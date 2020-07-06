package com.example.uitarea03;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uitarea03.adapters.RecyclerViewAdapter;
import com.example.uitarea03.entities.Items;
import com.example.uitarea03.io.JsonPlaceHolderApi;
import com.example.uitarea03.io.Listado;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rvListItems);
        manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new RecyclerViewAdapter(this,GetListItems());
        recyclerView.setAdapter(adapter);
    }
    private ArrayList<Items> GetListItems() {
        final ArrayList<Items> ListItems= new ArrayList<>();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fipo.equisd.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<Listado> call = jsonPlaceHolderApi.getListado();
        call.enqueue(new Callback<Listado>() {
            @Override
            public void onResponse(Call<Listado> call, Response<Listado> response) {
                Listado listado= response.body();
                Listado.Usuario[] usuarios = listado.getObjects();
                for (int i=0;i<usuarios.length;i++) {
                    ListItems.add(new Items(usuarios[i].getFirst_name(),usuarios[i].getLast_name()));
                }
            }
            @Override
            public void onFailure(Call<Listado> call, Throwable t) {
            }
        });
        return ListItems;
    }
}