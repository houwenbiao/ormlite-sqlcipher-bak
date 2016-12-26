package cn.db.test;

import android.content.Context;
import android.util.Log;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.sqlcipher.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import cn.db.test.enity.Table1;
import cn.db.test.enity.Table12;
import cn.db.test.enity.Table14;
import cn.db.test.enity.Table2;
import cn.db.test.enity.Table3;
import cn.db.test.enity.Table4;
import cn.db.test.enity.Table5;
import cn.db.test.enity.Table6;
import cn.db.test.enity.Table7;
import cn.db.test.enity.Table8;
import cn.db.test.enity.TableAnyang;
import cn.db.test.enity.TableBalinzuoqi;
import cn.db.test.enity.TableBeijing;
import cn.db.test.enity.TableChengde;
import cn.db.test.enity.TableChifeng;
import cn.db.test.enity.TableDatong;
import cn.db.test.enity.TableFengning;
import cn.db.test.enity.TableHuailai;
import cn.db.test.enity.TableHuhehaote;
import cn.db.test.enity.TableHuimin;
import cn.db.test.enity.TableJiexiu;
import cn.db.test.enity.TableJinan;
import cn.db.test.enity.TableJuxian;
import cn.db.test.enity.TableLaoting;
import cn.db.test.enity.TableLongkou;
import cn.db.test.enity.TableLushi;
import cn.db.test.enity.TableMiyun;
import cn.db.test.enity.TableNanyang;
import cn.db.test.enity.TableRaoyang;
import cn.db.test.enity.TableShangqiu;
import cn.db.test.enity.TableShijiazhuang;
import cn.db.test.enity.TableTaiyuan;
import cn.db.test.enity.TableTianjin;
import cn.db.test.enity.TableWeifang;
import cn.db.test.enity.TableXiAn;
import cn.db.test.enity.TableXilinhaote;
import cn.db.test.enity.TableXingtai;
import cn.db.test.enity.TableXinyang;
import cn.db.test.enity.TableYanzhou;
import cn.db.test.enity.TableYuanping;
import cn.db.test.enity.TableYuncheng;
import cn.db.test.enity.TableYushe;
import cn.db.test.enity.TableZhangbei;
import cn.db.test.enity.TableZhaoyang;
import cn.db.test.enity.TableZhengzhou;
import cn.db.test.enity.TableZhumadian;

import com.stay4it.sample.model.User;

import net.sqlcipher.database.SQLiteDatabase;

import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class CipherDbHelper extends OrmLiteSqliteOpenHelper {
    public static final int databaseVersion = 1;
    private Map<String, Dao> daos = new HashMap<String, Dao>();
    private static CipherDbHelper instance;

    public CipherDbHelper(Context context, String databaseName, String password) {
        super(context, databaseName, password, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
//            TableUtils.createTable(connectionSource, User.class);

            TableUtils.createTable(connectionSource, Table1.class);
            TableUtils.createTable(connectionSource, Table2.class);
            TableUtils.createTable(connectionSource, Table3.class);
            TableUtils.createTable(connectionSource, Table4.class);
            TableUtils.createTable(connectionSource, Table5.class);
            TableUtils.createTable(connectionSource, Table6.class);
            TableUtils.createTable(connectionSource, Table7.class);
            TableUtils.createTable(connectionSource, Table8.class);
            TableUtils.createTable(connectionSource, Table12.class);
            TableUtils.createTable(connectionSource, Table14.class);
            TableUtils.createTable(connectionSource, TableAnyang.class);
            TableUtils.createTable(connectionSource, TableBalinzuoqi.class);
            TableUtils.createTable(connectionSource, TableBeijing.class);
            TableUtils.createTable(connectionSource, TableChengde.class);
            TableUtils.createTable(connectionSource, TableChifeng.class);
            TableUtils.createTable(connectionSource, TableDatong.class);
            TableUtils.createTable(connectionSource, TableFengning.class);
            TableUtils.createTable(connectionSource, TableHuailai.class);
            TableUtils.createTable(connectionSource, TableHuhehaote.class);
            TableUtils.createTable(connectionSource, TableHuimin.class);
            TableUtils.createTable(connectionSource, TableJiexiu.class);
            TableUtils.createTable(connectionSource, TableJinan.class);
            TableUtils.createTable(connectionSource, TableJuxian.class);
            TableUtils.createTable(connectionSource, TableLaoting.class);
            TableUtils.createTable(connectionSource, TableLongkou.class);
            TableUtils.createTable(connectionSource, TableLushi.class);
            TableUtils.createTable(connectionSource, TableMiyun.class);
            TableUtils.createTable(connectionSource, TableNanyang.class);
            TableUtils.createTable(connectionSource, TableRaoyang.class);
            TableUtils.createTable(connectionSource, TableShangqiu.class);
            TableUtils.createTable(connectionSource, TableShijiazhuang.class);
            TableUtils.createTable(connectionSource, TableTaiyuan.class);
            TableUtils.createTable(connectionSource, TableTianjin.class);
            TableUtils.createTable(connectionSource, TableWeifang.class);
            TableUtils.createTable(connectionSource, TableXiAn.class);
            TableUtils.createTable(connectionSource, TableXilinhaote.class);
            TableUtils.createTable(connectionSource, TableXingtai.class);
            TableUtils.createTable(connectionSource, TableXinyang.class);
            TableUtils.createTable(connectionSource, TableYanzhou.class);
            TableUtils.createTable(connectionSource, TableYuanping.class);
            TableUtils.createTable(connectionSource, TableYuncheng.class);
            TableUtils.createTable(connectionSource, TableYushe.class);
            TableUtils.createTable(connectionSource, TableZhangbei.class);
            TableUtils.createTable(connectionSource, TableZhaoyang.class);
            TableUtils.createTable(connectionSource, TableZhengzhou.class);
            TableUtils.createTable(connectionSource, TableZhumadian.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    /**
     * 单例获取DataBaseHelper
     *
     * @param context
     * @return databaseHelper
     */
    public static synchronized CipherDbHelper getHelper(Context context)
    {
        context = context.getApplicationContext();
        if(instance == null)
        {
            synchronized (CipherDbHelper.class)
            {
                if(instance == null)
                {
                    instance = new CipherDbHelper(context,null,null);
                }
            }

        }
        return instance;
    }

    /**
     * 根据类名 获取相应Dao
     */
    public synchronized Dao getDao(Class clazz)
    {
        Dao dao = null;
        String className = clazz.getSimpleName();// 获取类名

        try
        {
            if(daos.containsKey(className))
            {
                dao = daos.get(className);
            }
            if(dao == null)
            {
                dao = super.getDao(clazz);
                daos.put(className, dao);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return dao;
    }
}
