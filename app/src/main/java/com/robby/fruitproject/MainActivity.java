package com.robby.fruitproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFruit;
    private ArrayList<Fruit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFruit = findViewById(R.id.rv_fruits);
        rvFruit.setHasFixedSize(true);

        list.addAll(FruitData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvFruit.setLayoutManager(new LinearLayoutManager(this));
        ListFruitAdapter listFruitAdapter = new ListFruitAdapter (list, MainActivity.this);
        rvFruit.setAdapter(listFruitAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId){
            case R.id.action_about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
        }
    }
}
