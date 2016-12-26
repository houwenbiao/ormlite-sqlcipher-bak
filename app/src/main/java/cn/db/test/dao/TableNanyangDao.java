package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableMiyun;
import cn.db.test.enity.TableNanyang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableNanyangDao extends BaseDAO<TableNanyang> {
    private static TableNanyangDao instance;

    private TableNanyangDao() {
    }

    public synchronized static TableNanyangDao getInstance() {
        if (instance == null) {
            instance = new TableNanyangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableNanyang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableNanyang.class);
    }
}
