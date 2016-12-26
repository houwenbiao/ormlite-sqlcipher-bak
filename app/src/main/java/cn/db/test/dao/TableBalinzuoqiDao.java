package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableBalinzuoqi;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableBalinzuoqiDao extends BaseDAO<TableBalinzuoqi> {
    private static TableBalinzuoqiDao instance;

    private TableBalinzuoqiDao() {
    }

    public synchronized static TableBalinzuoqiDao getInstance() {
        if (instance == null) {
            instance = new TableBalinzuoqiDao();
        }
        return instance;
    }

    @Override
    public Dao<TableBalinzuoqi, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableBalinzuoqi.class);
    }
}
