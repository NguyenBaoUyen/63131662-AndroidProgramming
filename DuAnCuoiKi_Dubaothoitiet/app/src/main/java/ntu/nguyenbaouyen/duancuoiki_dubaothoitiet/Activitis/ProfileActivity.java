package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setVisible();
    }

    private void setVisible() {
        ImageView outbtn = findViewById(R.id.outbtn);
        outbtn.setOnClickListener(v -> startActivity(new Intent(
                ProfileActivity.this, WelcomeActivity.class)));
    }


}