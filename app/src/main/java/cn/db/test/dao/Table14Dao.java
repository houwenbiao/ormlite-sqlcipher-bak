package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table14;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table14Dao extends BaseDAO<Table14> {
    private static Table14Dao instance;

    private Table14Dao() {
    }

    public synchronized static Table14Dao getInstance() {
        if (instance == null) {
            instance = new Table14Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table14, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table14.class);
    }
}
