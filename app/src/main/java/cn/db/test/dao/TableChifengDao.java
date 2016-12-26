package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableChifeng;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableChifengDao extends BaseDAO<TableChifeng> {
    private static TableChifengDao instance;

    private TableChifengDao() {
    }

    public synchronized static TableChifengDao getInstance() {
        if (instance == null) {
            instance = new TableChifengDao();
        }
        return instance;
    }

    @Override
    public Dao<TableChifeng, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableChifeng.class);
    }
}
