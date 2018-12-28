package com.example.shantacse.singlelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //--------------vairiable initialization-------------//
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.myList);

        final String[] countyname= getResources().getStringArray(R.array.countryname);

        //------------Array adapter for for retriving arrat item and sohowing expected view----------------//

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(MainActivity.this,R.layout.veiw_item,R.id.mytextveiw,countyname);
        listView.setAdapter(arrayAdapter);


        //----------click for list veiw item click with position--------//
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=countyname[position];
                Toast.makeText(MainActivity.this, "This is "+value +""+ " index " +position,Toast.LENGTH_LONG).show();
            }
        });
    }
}
