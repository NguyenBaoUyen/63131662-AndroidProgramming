package ntu.nguyenbaouyen63131662;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

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
    //Tạo một listể lưu vị trí click Checkbox để xóa sinh viên
    //Phải public Và do hàm main phải dùng static
    public  static  ArrayList<Integer> vitri = new ArrayList<>();

    Button btn_Xoa,btn_Them;
    EditText txt_ID,txt_Name;
    RadioButton rdo_btnNam;
    boolean gioitinh=true;

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
        //Sự kiện xóa
        btn_Xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!vitri.isEmpty()){
                    for(int k:vitri){
                        dsSinhVien.remove(k);
                    }
                    vitri.clear();//sau khi xoa xong cac sinhvien
                    adapterSinhVien.notifyDataSetChanged();

                }else {
                    Toast.makeText(MainActivity.this,"Chưa chọn sinh viên để xóa.",Toast.LENGTH_SHORT).show();
                }

            }
        });

        if (rdo_btnNam.isChecked()){
            gioitinh=true;
        }else {
            gioitinh=false;
        }
        //Sự kiện thêm
        btn_Them.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                dsSinhVien.add(new SinhVien(txt_ID.getText().toString(),txt_Name.getText().toString(),gioitinh));
            }
        });
    }

    private void addcontrols(){
        //
        btn_Xoa = findViewById(R.id.btnXoa);
        btn_Them = findViewById(R.id.btnThem);
        txt_ID = findViewById(R.id.txt_ID);
        txt_Name = findViewById(R.id.txt_Ten);
        rdo_btnNam = findViewById(R.id.radioBtnNam);
        lv_HienThiDS = findViewById(R.id.dsHienThi);
        dsSinhVien.add(new SinhVien("SV1","Nguyễn Bảo Uyên", true));
        dsSinhVien.add(new SinhVien("SV2","Phạm Anh Nhật", false));
        dsSinhVien.add(new SinhVien("SV3","Trần Thị Hương Thủy", true));
        dsSinhVien.add(new SinhVien("SV4","Lê Phan Bảo Ngọc", true));
        dsSinhVien.add(new SinhVien("SV5","Lê Tường Vy", true));
        dsSinhVien.add(new SinhVien("SV6","Nguyễn Bảo Hân", true));
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