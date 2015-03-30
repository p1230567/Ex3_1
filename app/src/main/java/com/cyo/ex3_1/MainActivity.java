package com.cyo.ex3_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    private RectBar rectBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rectBar = (RectBar) findViewById(R.id.RectBar);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//選擇使用者點取的是哪一個項目
            case R.id.sub_menu_Round_Red:
                rectBar.setShape("Round");
//                設定rectBar.setShape("Round")
                rectBar.getPaint().setColor(Color.RED);
//                呼叫getPaint()設定paint顏色
                rectBar.invalidate();
//                清除畫布，再畫一次
                break;
            case R.id.sub_menu_Round_Blue:
                rectBar.setShape("Round");
                rectBar.getPaint().setColor(Color.BLUE);
                rectBar.invalidate();
                break;
            case R.id.sub_menu_Square_Red:
                rectBar.setShape("Square");
                rectBar.getPaint().setColor(Color.RED);
                rectBar.invalidate();
                break;
            case R.id.sub_menu_Square_Blue:
                rectBar.setShape("Square");
                rectBar.getPaint().setColor(Color.BLUE);
                rectBar.invalidate();
                break;
            case R.id.exit:
                System.exit(0);
//                離開程式
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
