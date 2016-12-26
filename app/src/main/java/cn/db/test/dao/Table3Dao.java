package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table3;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table3Dao extends BaseDAO<Table3> {
    private static Table3Dao instance;

    private Table3Dao() {
    }

    public synchronized static Table3Dao getInstance() {
        if (instance == null) {
            instance = new Table3Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table3, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table3.class);
    }
}
