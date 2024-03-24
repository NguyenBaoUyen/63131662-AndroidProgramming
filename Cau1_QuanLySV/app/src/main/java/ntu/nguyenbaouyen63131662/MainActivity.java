package ntu.nguyenbaouyen63131662;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import ntu.nguyenbaouyen63131662.adapter.AdapterSinhVien;
import ntu.nguyenbaouyen63131662.model.SinhVien;

public class MainActivity extends AppCompatActivity {

    ListView lv_HienThiDS;
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    AdapterSinhVien adapterSinhVien;
    //Tạo một
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontrols();
        addEvent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Quản Quản Lý Sinh Viên");
        return super.onCreateOptionsMenu(menu);


    }

    private void addEvent() {
    }

    private void addcontrols(){
        lv_HienThiDS = findViewById(R.id.dsHienThi);
        dsSinhVien.add(new SinhVien("SV1","Nguyễn Bảo Uyên", true));
        dsSinhVien.add(new SinhVien("SV2","Phạm Ânh Nhật", false));
        dsSinhVien.add(new SinhVien("SV3","Trần Thiij Hương Thủy", true));
        dsSinhVien.add(new SinhVien("SV4","Lê Phan Bảo Ngọc", true));
        dsSinhVien.add(new SinhVien("SV5","Lê Tường Vy", true));
        dsSinhVien.add(new SinhVien("SV6","Nguễn Bảo Hân", true));
        dsSinhVien.add(new SinhVien("SV7","Trần Lê Thanh Tùng", false));
        dsSinhVien.add(new SinhVien("SV8","Đàm Viết Trọng", false));
        adapterSinhVien = new AdapterSinhVien(
                MainActivity.this,
                R.layout.item_viewsinhvien,
                dsSinhVien
        );
        lv_HienThiDS.setAdapter(adapterSinhVien);
    }
}