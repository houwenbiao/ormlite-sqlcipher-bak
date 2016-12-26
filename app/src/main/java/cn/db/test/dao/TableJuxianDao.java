package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableHuailai;
import cn.db.test.enity.TableJuxian;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableJuxianDao extends BaseDAO<TableJuxian> {
    private static TableJuxianDao instance;

    private TableJuxianDao() {
    }

    public synchronized static TableJuxianDao getInstance() {
        if (instance == null) {
            instance = new TableJuxianDao();
        }
        return instance;
    }

    @Override
    public Dao<TableJuxian, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableJuxian.class);
    }
}
