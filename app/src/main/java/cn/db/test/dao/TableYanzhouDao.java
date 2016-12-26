package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableXinyang;
import cn.db.test.enity.TableYanzhou;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableYanzhouDao extends BaseDAO< TableYanzhou> {
    private static TableYanzhouDao instance;

    private TableYanzhouDao() {
    }

    public synchronized static TableYanzhouDao getInstance() {
        if (instance == null) {
            instance = new TableYanzhouDao();
        }
        return instance;
    }

    @Override
    public Dao<TableYanzhou, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableYanzhou.class);
    }
}
