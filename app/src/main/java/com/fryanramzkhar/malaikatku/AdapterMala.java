package com.fryanramzkhar.malaikatku;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AdapterMala extends RecyclerView.Adapter<AdapterMala.ViewHolder>{
    Context context;
    String[] namaMalaikat,tugasMalaikat;

    public AdapterMala(Context context, String[] namaMalaikat, String[] tugasMalaikat) {
        this.context = context;
        this.namaMalaikat = namaMalaikat;
        this.tugasMalaikat = tugasMalaikat;
    }

    @NonNull
    @Override
    public AdapterMala.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_mala, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMala.ViewHolder viewHolder, final int i) {
        viewHolder.txtMalaikat.setText(namaMalaikat[i]);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, TugasMalaikat.class);
                pindah.putExtra("nm", namaMalaikat[i]);
                pindah.putExtra("tm", tugasMalaikat[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaMalaikat.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtMalaikat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMalaikat = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
