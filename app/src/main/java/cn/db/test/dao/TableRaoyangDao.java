package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableNanyang;
import cn.db.test.enity.TableRaoyang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableRaoyangDao extends BaseDAO<TableRaoyang> {
    private static TableRaoyangDao instance;

    private TableRaoyangDao() {
    }

    public synchronized static TableRaoyangDao getInstance() {
        if (instance == null) {
            instance = new TableRaoyangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableRaoyang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableRaoyang.class);
    }
}
