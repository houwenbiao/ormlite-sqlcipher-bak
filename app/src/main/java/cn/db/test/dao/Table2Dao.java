package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table2;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table2Dao extends BaseDAO<Table2> {
    private static Table2Dao instance;

    private Table2Dao() {
    }

    public synchronized static Table2Dao getInstance() {
        if (instance == null) {
            instance = new Table2Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table2, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table2.class);
    }
}
