package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableHuailai;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableHuailaiDao extends BaseDAO<TableHuailai> {
    private static TableHuailaiDao instance;

    private TableHuailaiDao() {
    }

    public synchronized static TableHuailaiDao getInstance() {
        if (instance == null) {
            instance = new TableHuailaiDao();
        }
        return instance;
    }

    @Override
    public Dao<TableHuailai, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableHuailai.class);
    }
}
