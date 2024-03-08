package nt22.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Bo lang nghe va xu ly su kien click len nut tinh tong
    public void XuLyCong(View view){
        //Tìm tham chiếu đến điều khiển trên XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số a
        String strB = editTextSoB.getText().toString();

        //Chuyển dữ liệu sang dạng số
        Integer SoA = Integer.parseInt(strA);
        Integer SoB = Integer.parseInt(strB);

        //Tính toán theo yêu cầu
        Integer tong = SoA + SoB;
        String strtong = String.valueOf(tong);

        //Hiện ra màn hình
        editTextKQ.setText(strtong);

    }
}