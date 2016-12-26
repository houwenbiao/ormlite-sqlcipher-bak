package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableAnyang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableAnyangDao extends BaseDAO<TableAnyang> {
    private static TableAnyangDao instance;

    private TableAnyangDao() {
    }

    public synchronized static TableAnyangDao getInstance() {
        if (instance == null) {
            instance = new TableAnyangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableAnyang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableAnyang.class);
    }
}
