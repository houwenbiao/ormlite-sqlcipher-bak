package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableBeijing;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableBeijingDao extends BaseDAO<TableBeijing> {
    private static TableBeijingDao instance;

    private TableBeijingDao() {
    }

    public synchronized static TableBeijingDao getInstance() {
        if (instance == null) {
            instance = new TableBeijingDao();
        }
        return instance;
    }

    @Override
    public Dao<TableBeijing, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableBeijing.class);
    }
}
