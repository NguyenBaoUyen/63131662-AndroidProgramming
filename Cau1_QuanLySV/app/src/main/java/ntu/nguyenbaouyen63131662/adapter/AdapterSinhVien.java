package ntu.nguyenbaouyen63131662.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import ntu.nguyenbaouyen63131662.R;
import ntu.nguyenbaouyen63131662.model.SinhVien;

public class AdapterSinhVien extends ArrayAdapter<SinhVien> {
    //Màn hình sử dụng
    Activity context;
    //Layout từng dòng muioons hiển thị
    int resource;
    //Danh sách nguồn dữ liệu muốn hiển thị trên màn hình
    @NonNull List<SinhVien> objects;
    public AdapterSinhVien(@NonNull Activity context, int resource, @NonNull List<SinhVien> objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        //Đây là một lớp để build layout bình tờng thành code java mà androis sử dungnj đc
        //Load file sml vào hệ thống và build thnahf code chương trình chạy đc
        LayoutInflater LayoutInflater = this.context.getLayoutInflater();
        //đối sood this.resource chính là item.xml, te truyền vvaof khi gọi adaptersinhvien
        row = LayoutInflater.inflate(this.resource, null);
        ImageView _img = row.findViewById(R.id.imageView2);
        TextView _Profile = row.findViewById(R.id.profile);
        return row;
    }
}
