package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setVisible();

    }

    private void setVisible() {
        Button thoitietbtn=findViewById(R.id.thoitietbtn);
        thoitietbtn.setOnClickListener(v -> startActivity(new Intent(
                WelcomeActivity.this,LoginActivity.class)));
        Button thongtinbtn=findViewById(R.id.profilebtn);
        thongtinbtn.setOnClickListener(v -> startActivity(new Intent(
                WelcomeActivity.this,ProfileActivity.class)));
    }
}