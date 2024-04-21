package ntu.nguyenbaouyen.vidu2_dangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Hàm đáp ứng sự kiện nhấn lên nút "Sang màn hình khác"
    //Xử lý chuyển màn hình
    public void DangNhap( View v){
        //Tạo một đối tượng Intent
        Intent iLogin = new Intent(this, LoginActivity.class);
        startActivity(iLogin);
    }
}