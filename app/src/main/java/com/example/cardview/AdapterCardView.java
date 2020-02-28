package com.example.cardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/**
 * Created by Aldenir Rodrigues on 28/02/2020.
 */
public class AdapterCardView extends RecyclerView.Adapter<AdapterCardView.MyViewHouder> {

  ArrayList<Model>models;
  Context context;

  public AdapterCardView (ArrayList < Model > models, Context context) {
    this.models = models;
    this.context = context;
  }

  @NonNull
  @Override
  public MyViewHouder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_cardview, parent, false);
    return new MyViewHouder(view);
  }

  @Override
  public void onBindViewHolder (@NonNull MyViewHouder holder, int position) {
    Model model = models.get(position);
    holder.titulo.setText(model.getTitulo());
    holder.detalhes.setText(model.getDetalhes());
    holder.imCardView.setImageResource(model.getFoto());
    holder.curtir.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View v) {
        Toast.makeText(context, "Curtiu", Toast.LENGTH_SHORT).show( );
      }
    });
    holder.comentar.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View v) {
        Toast.makeText(context, "Comentou", Toast.LENGTH_SHORT).show( );
      }
    });

  }

  @Override
  public int getItemCount () {
    return models.size();
  }

  public class MyViewHouder extends RecyclerView.ViewHolder {

    TextView titulo;
    TextView detalhes;
    ImageView imCardView;
    Button comentar;
    Button curtir;

    public MyViewHouder (@NonNull View itemView) {
      super(itemView);

      titulo = itemView.findViewById(R.id.textTitulo);
      detalhes = itemView.findViewById(R.id.textDetalhes);
      imCardView = itemView.findViewById(R.id.imageCardView);
      comentar = itemView.findViewById(R.id.buttonComentar);
      curtir = itemView.findViewById(R.id.buttonCurtir);
    }
  }
}
