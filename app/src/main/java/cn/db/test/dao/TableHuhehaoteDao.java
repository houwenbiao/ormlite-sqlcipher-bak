package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableHuhehaote;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableHuhehaoteDao extends BaseDAO<TableHuhehaote> {
    private static TableHuhehaoteDao instance;

    private TableHuhehaoteDao() {
    }

    public synchronized static TableHuhehaoteDao getInstance() {
        if (instance == null) {
            instance = new TableHuhehaoteDao();
        }
        return instance;
    }

    @Override
    public Dao<TableHuhehaote, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableHuhehaote.class);
    }
}
