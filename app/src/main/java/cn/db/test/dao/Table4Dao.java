package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table4;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table4Dao extends BaseDAO<Table4> {
    private static Table4Dao instance;

    private Table4Dao() {
    }

    public synchronized static Table4Dao getInstance() {
        if (instance == null) {
            instance = new Table4Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table4, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table4.class);
    }
}
