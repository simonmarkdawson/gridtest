package com.example.simon.gridtest;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {
    String selectedItems;
    GridView gview;
    TextView tv1;
    Integer tempint;
    int position=0;
    public int count;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final GridView gview = (GridView) findViewById(R.id.gridview);
        tempint=position;

tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText(tempint.toString());
        gview.setAdapter(new ImageAdapter(this));

        gview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
//                Log.d("keith", "ident - "+this);
                tempint=position;
                tv1.setText(tempint.toString());
                for(int i=0;i< parent.getCount();i++){
                    //gview.setVisibility(View.INVISIBLE);
                    if(i == position) {

                        parent.getChildAt(i).setVisibility(View.INVISIBLE);

                    }else{
//parent.getAdapter().getView(i,parent.getChildAt(i),parent).setVisibility(View.VISIBLE);
                  //      parent.getChildAt(i).setVisibility(View.VISIBLE);



//                        v.setVisibility(View.VISIBLE);
//                        Log.d("keith", "hidden "+v);

                    }
                    //parent.getItem(i);
                }

            }


        });





    }
}

//                Log.d("keith", "position - "+v);
//                Log.d("keith", "position - "+v);



