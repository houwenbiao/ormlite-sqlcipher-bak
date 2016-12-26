package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableZhengzhou;
import cn.db.test.enity.TableZhumadian;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableZhumadianDao extends BaseDAO< TableZhumadian> {
    private static TableZhumadianDao instance;

    private TableZhumadianDao() {
    }

    public synchronized static TableZhumadianDao getInstance() {
        if (instance == null) {
            instance = new TableZhumadianDao();
        }
        return instance;
    }

    @Override
    public Dao<TableZhumadian, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableZhumadian.class);
    }
}
