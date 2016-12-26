package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;
import cn.db.test.DBManager;
import cn.db.test.enity.Table6;

import java.sql.SQLException;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table6Dao extends BaseDAO<Table6> {
    private static Table6Dao instance;

    private Table6Dao() {
    }

    public synchronized static Table6Dao getInstance() {
        if (instance == null) {
            instance = new Table6Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table6, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table6.class);
    }
}
