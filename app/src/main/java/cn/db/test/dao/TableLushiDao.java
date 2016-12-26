package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableLongkou;
import cn.db.test.enity.TableLushi;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableLushiDao extends BaseDAO<TableLushi> {
    private static TableLushiDao instance;

    private TableLushiDao() {
    }

    public synchronized static TableLushiDao getInstance() {
        if (instance == null) {
            instance = new TableLushiDao();
        }
        return instance;
    }

    @Override
    public Dao<TableLushi, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableLushi.class);
    }
}
