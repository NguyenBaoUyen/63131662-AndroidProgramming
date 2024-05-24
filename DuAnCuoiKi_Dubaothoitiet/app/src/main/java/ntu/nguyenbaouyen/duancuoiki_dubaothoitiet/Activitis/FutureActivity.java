package ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Activitis;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.Domains.FutureDomains;
import ntu.nguyenbaouyen.duancuoiki_dubaothoitiet.R;

public class FutureActivity extends AppCompatActivity {
    private RecyclerView adapterHomNay;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<FutureDomains> items = new ArrayList<>();
        items.add(new)
    }
}