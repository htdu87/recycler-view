package vn.edu.ctu.cit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> students=new ArrayList<>();
        students.add("M2519001 - Vu Xuan Dung");
        students.add("M2519002 - Huynh Thanh Du");
        students.add("M2519003 - Vo Phuoc Duc");
        students.add("M2519004 - Nguyen Trong Hieu");
        students.add("M2519005 - Luong Thi Thu Huong");
        students.add("M2519006-Pham Nhat Khoa");
        students.add("M2519007 - Ngo Tien Len");
        students.add("M2519009 - Vo Chi Linh");
        students.add("M2519011- Cao Minh Nhut");
        students.add("M2519012-Pham Thi My Phuong");
        students.add("M2519014 - Nguyen Dinh Thanh");
        students.add("M2519015 - Nguyen Van Thao");

        MyAdapter adapter=new MyAdapter(students);

        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}