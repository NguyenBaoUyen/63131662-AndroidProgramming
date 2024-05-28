package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.Hourly;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewholder> {
    ArrayList<Hourly> item;
    Context context;

    public HourlyAdapters(ArrayList<Hourly> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public HourlyAdapters.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.viewholder_hourly,parent,false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewholder holder, int position) {
    holder.giotxt.setText(item.get(position).getGio());
    holder.nhiettxt.setText(item.get(position).getNhiet());

    int drawableResourceId=holder.itemView.getResources()
            .getIdentifier(item.get(position).getDuongDan(),
                    "drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.hinh);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView giotxt,nhiettxt;  ImageView hinh;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            giotxt=itemView.findViewById(R.id.giotxt);
            nhiettxt=itemView.findViewById(R.id.nhiettxt);
            hinh=itemView.findViewById(R.id.hinh);
        }
    }
}
