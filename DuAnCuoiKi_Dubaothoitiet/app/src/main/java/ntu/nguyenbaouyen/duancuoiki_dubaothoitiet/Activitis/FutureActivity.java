package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Adapters.FutureAdapters;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.FutureDomains;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class FutureActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHomNay;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        initRecyclerView();
    setVisible();
    }

    private void setVisible() {
        ImageView backBtn = findViewById(R.id.backbtn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(FutureActivity.this, MainActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<FutureDomains> items = new ArrayList<>();
        items.add(new FutureDomains("Thứ Hai","nang","Nắng",21,16));
        items.add(new FutureDomains("Thứ Ba","mua","Mưa",22,15));
        items.add(new FutureDomains("Thứ Tư","gio","Gió Nhẹ",20,13));
        items.add(new FutureDomains("Thứ Năm","gio","Gió Nhẹ",19,14));
        items.add(new FutureDomains("Thứ Sáu","muaa","Mưa Râm Râm",17,15));
        items.add(new FutureDomains("Thứ Bảy","co_may","Nhiều Mây",28,27));
        items.add(new FutureDomains("Chủ Nhật","gioo","Gió Mạnh",20,10));
        recyclerView= findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapterHomNay=new FutureAdapters(items);
        recyclerView.setAdapter(adapterHomNay);
    }
}