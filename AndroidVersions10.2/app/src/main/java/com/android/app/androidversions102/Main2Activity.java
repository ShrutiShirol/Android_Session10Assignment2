package com.android.app.androidversions102;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final int SETTINGS_MENU_ITEM = Menu.FIRST;
    private static final int SEARCH_ITEM = SETTINGS_MENU_ITEM + 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this,VersionsActivity.class);
                startActivity(intent);
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0, SETTINGS_MENU_ITEM, 0, "Settings");
        menu.add(0, SEARCH_ITEM, 0, "Search");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case SETTINGS_MENU_ITEM:
                Toast.makeText(Main2Activity.this, "You Clicked on Settings", Toast.LENGTH_LONG).show();

                break;

            case SEARCH_ITEM:
                Toast.makeText(Main2Activity.this, "You Clicked on Search", Toast.LENGTH_LONG).show();
                break;

            case R.id.add:
                Toast.makeText(Main2Activity.this, "You Clicked on Add", Toast.LENGTH_LONG).show();

                break;

            case R.id.delete:
                Toast.makeText(Main2Activity.this, "You Clicked on Delete", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);

    }

}
