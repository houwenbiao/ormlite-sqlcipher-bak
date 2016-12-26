package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableChengde;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableChengdeDao extends BaseDAO<TableChengde> {
    private static TableChengdeDao instance;

    private TableChengdeDao() {
    }

    public synchronized static TableChengdeDao getInstance() {
        if (instance == null) {
            instance = new TableChengdeDao();
        }
        return instance;
    }

    @Override
    public Dao<TableChengde, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableChengde.class);
    }
}
