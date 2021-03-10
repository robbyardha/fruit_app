package com.robby.fruitproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String nama = getIntent().getStringExtra("KeyFruit");
        String deskripsi = getIntent().getStringExtra("KeyDesc");
        String gambar = getIntent().getStringExtra("KeyFoto");

        TextView textviewdetail = findViewById(R.id.tv_TVDT);
        TextView textviewdesc = findViewById(R.id.tv_DESC);
        ImageView imageviewfoto = findViewById(R.id.iv_foto);

        textviewdetail.setText(nama);
        textviewdesc.setText(deskripsi);
        Glide.with(DetailActivity.this)
                .load(gambar)
                .apply(new RequestOptions().override(55, 55))
                .into(imageviewfoto);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
