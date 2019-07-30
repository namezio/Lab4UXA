package com.namezio.lab4_uxa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class B4Activity extends AppCompatActivity {
    private ListView lvb4;
    private TextView tvB4;
    private String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b4);
        lvb4 = findViewById(R.id.lvb4);
        tvB4 = findViewById(R.id.tvB4);

        listItem = getResources().getStringArray(R.array.list_b4);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.layout_lvb4,R.id.tvB4,listItem);
        lvb4.setAdapter(adapter);
        registerForContextMenu(lvb4);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
        menu.setHeaderTitle("Thao tac");
    }

}
