package sg.edu.rp.c346.id22024848.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<ToDoItem> al;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        al=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        calendar.set(2020, 8, 1);
        ToDoItem td1=new ToDoItem("Go for movie", calendar);

        Calendar calendar2=Calendar.getInstance();
        calendar2.set(2020, 8, 2);
        ToDoItem td2=new ToDoItem("Go for haircut", calendar2);
        al.add(td1);
        al.add(td2);

        adapter= new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(adapter);
    }
}