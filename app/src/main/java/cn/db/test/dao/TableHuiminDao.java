package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableHuimin;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableHuiminDao extends BaseDAO<TableHuimin> {
    private static TableHuiminDao instance;

    private TableHuiminDao() {
    }

    public synchronized static TableHuiminDao getInstance() {
        if (instance == null) {
            instance = new TableHuiminDao();
        }
        return instance;
    }

    @Override
    public Dao<TableHuimin, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableHuimin.class);
    }
}
