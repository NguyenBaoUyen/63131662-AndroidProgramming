package ntu.nguyenbaouyen.examlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ExamListAdapter examAdapter;
    ArrayList<ExamList> recyclerViewData;
    RecyclerView recyclerViewExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewData = getDataForRecyclerView();
        recyclerViewExam = findViewById(R.id.recyclerViewExams);

        RecyclerView.LayoutManager layoutLiner = new LinearLayoutManager(this);
        recyclerViewExam.setLayoutManager(layoutLiner);

        examAdapter = new ExamListAdapter(this, recyclerViewData);
        recyclerViewExam.setAdapter(examAdapter);

    }
    ArrayList<ExamList> getDataForRecyclerView(){
        ArrayList<ExamList> dsDuLieu = new ArrayList<>();
        dsDuLieu.add(new ExamList("Bài Kiểm Tra Đầu giờ", "02/4/2023","Làm bài kiểm tra trong khoảng 20p"));
        dsDuLieu.add(new ExamList("Bài Kiểm Tra Giữa kì", "10/5/2023","Làm bài kiểm tra trong thời gian 60p"));
        dsDuLieu.add(new ExamList("Bài Kiểm Tra Thường Xuyên", "03/06/2023","Làm bài kiểm tra trong thời gian 60p"));
        dsDuLieu.add(new ExamList("Bài Kiểm Tra Cuối kì", "22/8/2023","Làm bài kiểm tra trong thời gian 75p"));
        return dsDuLieu;
    }
}