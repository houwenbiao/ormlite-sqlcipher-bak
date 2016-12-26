package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableDatong;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableDatongDao extends BaseDAO<TableDatong> {
    private static TableDatongDao instance;

    private TableDatongDao() {
    }

    public synchronized static TableDatongDao getInstance() {
        if (instance == null) {
            instance = new TableDatongDao();
        }
        return instance;
    }

    @Override
    public Dao<TableDatong, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableDatong.class);
    }
}
