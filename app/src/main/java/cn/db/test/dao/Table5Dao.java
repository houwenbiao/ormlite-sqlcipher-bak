package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table5;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table5Dao extends BaseDAO<Table5> {
    private static Table5Dao instance;

    private Table5Dao() {
    }

    public synchronized static Table5Dao getInstance() {
        if (instance == null) {
            instance = new Table5Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table5, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table5.class);
    }
}
