package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
        Button loginBtn=findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this,MainActivity.class)));
    }
}