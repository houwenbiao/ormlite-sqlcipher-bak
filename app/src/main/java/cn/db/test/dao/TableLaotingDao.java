package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableJuxian;
import cn.db.test.enity.TableLaoting;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableLaotingDao extends BaseDAO<TableLaoting> {
    private static TableLaotingDao instance;

    private TableLaotingDao() {
    }

    public synchronized static TableLaotingDao getInstance() {
        if (instance == null) {
            instance = new TableLaotingDao();
        }
        return instance;
    }

    @Override
    public Dao<TableLaoting, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableLaoting.class);
    }
}
