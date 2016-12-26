package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table1;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table1Dao extends BaseDAO<Table1> {
    private static Table1Dao instance;

    private Table1Dao() {
    }

    public synchronized static Table1Dao getInstance() {
        if (instance == null) {
            instance = new Table1Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table1, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table1.class);
    }
}
