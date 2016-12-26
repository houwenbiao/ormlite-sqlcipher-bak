package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableFengning;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableFengningDao extends BaseDAO<TableFengning> {
    private static TableFengningDao instance;

    private TableFengningDao() {
    }

    public synchronized static TableFengningDao getInstance() {
        if (instance == null) {
            instance = new TableFengningDao();
        }
        return instance;
    }

    @Override
    public Dao<TableFengning, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableFengning.class);
    }
}
