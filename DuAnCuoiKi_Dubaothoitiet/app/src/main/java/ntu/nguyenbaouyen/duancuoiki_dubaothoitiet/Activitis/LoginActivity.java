package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setVisible();

    }


    private void setVisible() {
        Button loginBtn = findViewById(R.id.loginbtn);
        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);

        loginBtn.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            String validationResult = validateLogin(username, password);

            if ("success".equals(validationResult)) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            } else {
                Toast.makeText(LoginActivity.this, validationResult,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String validateLogin(String username, String password) {
        if (!"uyennguyen".equals(username)) {
            return "Tài khoản của bạn không đúng";
        } else if (!"uyen123".equals(password)) {
            return "Mật khẩu của bạn không đúng";
        }
        return "success";
    }
}
