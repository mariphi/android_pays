package com.doranco.flash.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.doranco.flash.R;
import com.doranco.flash.models.Specialite;

import java.util.List;

public class SpecialiteAdapter extends RecyclerView.Adapter<SpecialiteAdapter.SpecialiteAdapterViewHolder> {

    private List<Specialite> specialitesList;

    public SpecialiteAdapter(List<Specialite> specialitesList) {
        this.specialitesList = specialitesList;
    }

    @NonNull
    @Override
    public SpecialiteAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_specialite, parent,false);
        return new SpecialiteAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialiteAdapterViewHolder holder, int position) {
        holder.titre.setText(specialitesList.get(position).getTitre());

        // ajout d'un évènement sur le clic d'un titre
        holder.titre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texte = holder.titre.toString();
                Log.i("Click sur ce titre", "Salutation :");



            }
        });

    }

    @Override
    public int getItemCount() {
        return specialitesList.size();
    }

    public class SpecialiteAdapterViewHolder extends ViewHolder{

        public TextView titre;

        public SpecialiteAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            titre = itemView.findViewById(R.id.titreSpecialite);
        }
    }
}
