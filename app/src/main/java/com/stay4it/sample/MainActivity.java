package com.stay4it.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import cn.db.test.DBManager;
import cn.db.test.HandleTableTools;
import cn.excel.read.CopyToSDCard;

public class MainActivity extends AppCompatActivity
{

    private TextView mDbTestLabel;
    private static final String DATABASE_PATH = "/data/data/com.stay4it.sample/databases/";
    private static final String DATABASE_NAME = "data.db";
    private CopyToSDCard copyToSDCard;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDbTestLabel = (TextView) findViewById(R.id.mDbTestLabel);
        testDB();
    }

    /**
     * 添加数据库
     */
    private void testDB()
    {
        //初始化数据库
        DBManager.init(this, "data.db", "data");
        //将数据添加到数据库中
        HandleTableTools.addData(this);

//        try {
//            copyToSDCard = new CopyToSDCard();
//            FileInputStream inputStream = new FileInputStream(DATABASE_PATH+DATABASE_NAME);
//            copyToSDCard.write2SDFromInput("db","data.db",inputStream);
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
