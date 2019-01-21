package mamdouh.ahmed.listview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    adapter adapteer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.main_listview);

        ArrayList<data_class>ar= new ArrayList<>();




        ar.add(new data_class("Ahmed","0128655896",R.drawable.image2));
        ar.add(new data_class("Mohamed","0126986259",R.drawable.image2));
        ar.add(new data_class("Khaled","120589555",R.drawable.image2));
        ar.add(new data_class("Ali","0125896258",R.drawable.image2));
        ar.add(new data_class("Yousef","011136568",R.drawable.image2));
        ar.add(new data_class("Omar","0368148894",R.drawable.image2));

        adapteer =new adapter(getApplicationContext(),R.layout.list_item,ar);
        listView.setAdapter(adapteer);


    }
}
