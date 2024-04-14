package ntu.nguyenbaouyen.usingrecyclerview;

import static ntu.nguyenbaouyen.usingrecyclerview.R.id.recyclerLand;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandScape = findViewById(recyclerLand);
        //5
       //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
       //recyclerViewLandScape.setLayoutManager(layoutLinear);
        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);
        // RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,2);
        // recyclerViewLandScape.setLayoutManager(layoutGrid);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        LandScape landScape1 = new LandScape("h1","Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("h2","Tháp effel"));
        dsDuLieu.add(new LandScape("h3","Cung điện Buckingham"));
        return dsDuLieu;
    }
}