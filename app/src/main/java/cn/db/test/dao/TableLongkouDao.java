package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableLaoting;
import cn.db.test.enity.TableLongkou;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableLongkouDao extends BaseDAO<TableLongkou> {
    private static TableLongkouDao instance;

    private TableLongkouDao() {
    }

    public synchronized static TableLongkouDao getInstance() {
        if (instance == null) {
            instance = new TableLongkouDao();
        }
        return instance;
    }

    @Override
    public Dao<TableLongkou, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableLongkou.class);
    }
}
