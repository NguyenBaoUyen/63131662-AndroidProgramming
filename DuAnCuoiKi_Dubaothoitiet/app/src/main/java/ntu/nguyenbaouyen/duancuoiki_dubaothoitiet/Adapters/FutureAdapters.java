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

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.FutureDomains;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.Hourly;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class FutureAdapters extends RecyclerView.Adapter<FutureAdapters.viewholder> {
    ArrayList<FutureDomains> item;
    Context context;

    public FutureAdapters(ArrayList<FutureDomains> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public FutureAdapters.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewhodel_future,parent,false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapters.viewholder holder, int position) {
    holder.ngaytxt.setText(item.get(position).getNgay());
    holder.trangthaitxt.setText(item.get(position).getTrangThai());
    holder.caotxtx.setText(item.get(position).getDoCao()+"°");
    holder.thaptxt.setText(item.get(position).getDoThap()+"°");

    int drawableResourceId=holder.itemView.getResources()
            .getIdentifier(item.get(position).getDuongDan(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.hinh);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView ngaytxt,trangthaitxt,thaptxt,caotxtx;
        ImageView hinh;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            ngaytxt=itemView.findViewById(R.id.ngaytxt);
            trangthaitxt=itemView.findViewById(R.id.trangThaitxt);
            caotxtx=itemView.findViewById(R.id.caoTxt);
            thaptxt=itemView.findViewById(R.id.thaptxt);
            hinh=itemView.findViewById(R.id.hinh);
        }
    }
}
