package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableJinan;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableJinanDao extends BaseDAO<TableJinan> {
    private static TableJinanDao instance;

    private TableJinanDao() {
    }

    public synchronized static TableJinanDao getInstance() {
        if (instance == null) {
            instance = new TableJinanDao();
        }
        return instance;
    }

    @Override
    public Dao<TableJinan, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableJinan.class);
    }
}
