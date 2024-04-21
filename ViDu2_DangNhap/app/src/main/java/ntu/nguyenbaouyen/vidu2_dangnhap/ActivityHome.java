package ntu.nguyenbaouyen.vidu2_dangnhap;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Nhận tên đăng nhập từ Intent
        String userName = getIntent().getStringExtra("USERNAME");

        // Hiển thị chào mừng tên đăng nhập
        TextView tvUserName = findViewById(R.id.tvUserName);
        tvUserName.setText(userName);
    }
}