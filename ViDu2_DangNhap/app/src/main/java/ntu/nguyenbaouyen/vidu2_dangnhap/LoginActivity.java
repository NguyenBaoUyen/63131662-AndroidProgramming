package ntu.nguyenbaouyen.vidu2_dangnhap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUserName;
    private EditText edtPassword;
    private EditText edtMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPass);
        edtMail = findViewById(R.id.edtMail);
        Button btnLogin = findViewById(R.id.btnOK);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUserName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                String email = edtMail.getText().toString().trim();
                // Kiểm tra xem tất cả các trường thông tin đã được điền đầy đủ hay không
                if (userName.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                // Kiểm tra tên đăng nhập và mật khẩu
                if (userName.equalsIgnoreCase("NguyenBaoUyen") && password.equals("123")) {
                    // Nếu thông tin đăng nhập chính xác, chuyển sang màn hình chính và truyền tên đăng nhập
                    Intent intent = new Intent(LoginActivity.this, ActivityHome.class);
                    intent.putExtra("USERNAME", userName);
                    startActivity(intent);
                } else {
                    // Nếu tên đăng nhập hoặc mật khẩu không chính xác, hiển thị thông báo lỗi
                    Toast.makeText(LoginActivity.this, "Tên đăng nhập hoặc mật khẩu không chính xác", Toast.LENGTH_SHORT).show();
                }
            }
            }
        });
    }
}