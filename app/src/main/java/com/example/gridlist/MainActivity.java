package com.example.gridlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;
    ArrayList<monHoc> arrayMonHOc;
    adapterMonHoc adapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new adapterMonHoc(this,R.layout.row,arrayMonHOc);
        lvMonHoc.setAdapter(adapter);
        textView=findViewById(R.id.textview);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_listandgrid,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.list:showListActivity();
                break;
            case R.id.grid:showGridActivity();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private  void showGridActivity(){
        Intent intent = new Intent(MainActivity.this,gridActivity.class);
        startActivity(intent);
    }

    private  void showListActivity(){
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }



    private void AnhXa(){
        lvMonHoc = (ListView) findViewById(R.id.listView);
        arrayMonHOc = new ArrayList<>();

        arrayMonHOc.add(new monHoc("Java","Java android",R.drawable.java));
        arrayMonHOc.add(new monHoc("CSS3","CSS co ban ",R.drawable.css3));
        arrayMonHOc.add(new monHoc("Python","Python web",R.drawable.python));
        arrayMonHOc.add(new monHoc("HTML5","Html co ban ",R.drawable.html5));
        arrayMonHOc.add(new monHoc("Javascript","Javascript android",R.drawable.javascript));
        arrayMonHOc.add(new monHoc("Swift","Swift co ban ",R.drawable.swift));
    }
}