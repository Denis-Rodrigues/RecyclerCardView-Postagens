package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

  private RecyclerView recyclerPostagem;
  ArrayList<Model>models = new ArrayList <>();

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    recyclerPostagem = findViewById(R.id.recyclerView);

    RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
    recyclerPostagem.setLayoutManager(manager);
    recyclerPostagem.setHasFixedSize(true);

    models.add(new Model("Aldenir Rodrigues","#TBT Viagem legal",R.drawable.imagem1));
    models.add(new Model("Anatalia Rorigues","#",R.drawable.imagem2));
    models.add(new Model("Aldinan Rodrigues","#",R.drawable.imagem3));
    models.add(new Model("Luzia Rodrigues","#",R.drawable.imagem4));

    RecyclerView.Adapter adapter = new AdapterCardView(models, this);
    recyclerPostagem.setAdapter(adapter);
  }

  @Override
  public void onItemClick (AdapterView < ? > parent, View view, int position, long id) {
    Toast.makeText(this, "" + models.get(position).getTitulo(), Toast.LENGTH_SHORT).show( );
  }
}
