package com.example.recyclerview1718091;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuisrecyclerview.R;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {
    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga,parent, false);
        return new KeluargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeluargaViewHolder holder, int position) {
        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvStatus.setText(dataList.get(position).getStatus());
        holder.tvGambar.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {

        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNama,tvStatus;
        private ImageView tvGambar;
        public KeluargaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = (TextView) itemView.findViewById(R.id.tv_nama);
            tvStatus = (TextView) itemView.findViewById(R.id.tv_status);
            tvGambar =(ImageView)  itemView.findViewById(R.id.tv_gambar);
        }
    }
}
