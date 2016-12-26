package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableLushi;
import cn.db.test.enity.TableMiyun;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableMiyunDao extends BaseDAO<TableMiyun> {
    private static TableMiyunDao instance;

    private TableMiyunDao() {
    }

    public synchronized static TableMiyunDao getInstance() {
        if (instance == null) {
            instance = new TableMiyunDao();
        }
        return instance;
    }

    @Override
    public Dao<TableMiyun, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableMiyun.class);
    }
}
