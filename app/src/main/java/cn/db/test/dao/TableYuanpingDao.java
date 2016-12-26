package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableYanzhou;
import cn.db.test.enity.TableYuanping;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableYuanpingDao extends BaseDAO< TableYuanping> {
    private static TableYuanpingDao instance;

    private TableYuanpingDao() {
    }

    public synchronized static TableYuanpingDao getInstance() {
        if (instance == null) {
            instance = new TableYuanpingDao();
        }
        return instance;
    }

    @Override
    public Dao<TableYuanping, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableYuanping.class);
    }
}
