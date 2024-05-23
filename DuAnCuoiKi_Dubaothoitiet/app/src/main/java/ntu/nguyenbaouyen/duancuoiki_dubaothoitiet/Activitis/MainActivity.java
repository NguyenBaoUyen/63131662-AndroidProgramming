package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Adapters.HourlyAdapters;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.Hourly;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<Hourly> items= new ArrayList<>();
        items.add(new Hourly("00 am","25°","mưa"));
        items.add(new Hourly("6 am","26°","âm u"));
        items.add(new Hourly("12 am","27°","mây"));
        items.add(new Hourly("6 pm","28°","gió"));
        items.add(new Hourly("12 pm","27°","nhiều mây "));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterHourly = new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
    }
}