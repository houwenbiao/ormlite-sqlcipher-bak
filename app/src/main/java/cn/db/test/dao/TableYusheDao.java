package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableYuncheng;
import cn.db.test.enity.TableYushe;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableYusheDao extends BaseDAO< TableYushe> {
    private static TableYusheDao instance;

    private TableYusheDao() {
    }

    public synchronized static TableYusheDao getInstance() {
        if (instance == null) {
            instance = new TableYusheDao();
        }
        return instance;
    }

    @Override
    public Dao<TableYushe, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableYushe.class);
    }
}
