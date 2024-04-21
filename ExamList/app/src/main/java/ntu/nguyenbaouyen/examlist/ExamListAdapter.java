package ntu.nguyenbaouyen.examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExamListAdapter extends RecyclerView.Adapter<ExamListAdapter.ItemLandHolder> {
    Context context;
    ArrayList<ExamList> lsData;

    public ExamListAdapter(Context context, ArrayList<ExamList> lsData) {
        this.context = context;
        this.lsData = lsData;
    }
    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.exam_card, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ExamListAdapter.ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        ExamList examHienThi = lsData.get(position);
        //Trích thông tin
        String Name = examHienThi.getName();
        String Date = examHienThi.getDate();
        String Note = examHienThi.getNote();
        //Đặt vào các trường thông tin của holder
        holder.tvName.setText(Name);
        holder.tvDate.setText(Date);
        holder.tvNote.setText(Note);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }
    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        TextView tvDate;
        TextView tvNote;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvExamName);
            tvDate = itemView.findViewById(R.id.tvExamDate);
            tvNote = itemView.findViewById(R.id.tvExamNote);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int vitriDuocClick = getAdapterPosition();
            Exam phanTuDuocClick = lsData.get(vitriDuocClick);
            //bóc thông tin
            String ten = phanTuDuocClick.getName();
            String ngay = phanTuDuocClick.getDate();
            String ghiChu = phanTuDuocClick.getNote();
            //Toat tên
            String chuoiThongBao = "Bạn vừa chọn: " + ten;
            Toast.makeText(v.getContext(),chuoiThongBao,Toast.LENGTH_SHORT).show();
        }
    }
}
