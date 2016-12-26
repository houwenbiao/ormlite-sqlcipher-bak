package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table12;
import cn.db.test.enity.Table6;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class Table12Dao extends BaseDAO<Table12> {
    private static Table12Dao instance;

    private Table12Dao() {
    }

    public synchronized static Table12Dao getInstance() {
        if (instance == null) {
            instance = new Table12Dao();
        }
        return instance;
    }

    @Override
    public Dao<Table12, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(Table12.class);
    }
}
