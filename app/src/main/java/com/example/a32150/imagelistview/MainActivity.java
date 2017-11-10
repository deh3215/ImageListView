package com.example.a32150.imagelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] text1={"item1","item2","item3","item4"};
    String[] text2={"1hr ago","2hr ago","3hr ago","4hr ago"};
    int[] imgId={R.drawable.map,R.drawable.phonebook,R.drawable.browser,R.drawable.photos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        Map<String, Object> map;
        List<Map<String, Object>> list = new ArrayList<>();
        for(int i=0; i<text1.length; i++)   {
            map = new HashMap<>();
            map.put("imgId", imgId[i]);
            map.put("text1", text1[i]);
            map.put("text2", text2[i]);
            list.add(map);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                list,
                R.layout.item_layout,
                new String[]{"imgId", "text1", "text2"},
                new int[]{R.id.imageView, R.id.tv1, R.id.tv2}
        );


        listView.setAdapter(simpleAdapter);
    }


}
