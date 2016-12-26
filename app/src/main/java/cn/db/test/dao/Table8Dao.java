package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.Table8;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table8Dao extends BaseDAO<Table8> {
    private static Table8Dao instance;

    private Table8Dao() {
    }

    public synchronized static Table8Dao getInstance() {
        if (instance == null) {
            instance = new Table8Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table8, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table8.class);
    }
}
