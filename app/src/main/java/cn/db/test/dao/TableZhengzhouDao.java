package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableZhaoyang;
import cn.db.test.enity.TableZhengzhou;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableZhengzhouDao extends BaseDAO< TableZhengzhou> {
    private static TableZhengzhouDao instance;

    private TableZhengzhouDao() {
    }

    public synchronized static TableZhengzhouDao getInstance() {
        if (instance == null) {
            instance = new TableZhengzhouDao();
        }
        return instance;
    }

    @Override
    public Dao<TableZhengzhou, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableZhengzhou.class);
    }
}
