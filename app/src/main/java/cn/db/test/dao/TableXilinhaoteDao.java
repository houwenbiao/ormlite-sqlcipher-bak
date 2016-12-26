package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableXiAn;
import cn.db.test.enity.TableXilinhaote;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableXilinhaoteDao extends BaseDAO< TableXilinhaote> {
    private static TableXilinhaoteDao instance;

    private TableXilinhaoteDao() {
    }

    public synchronized static TableXilinhaoteDao getInstance() {
        if (instance == null) {
            instance = new TableXilinhaoteDao();
        }
        return instance;
    }

    @Override
    public Dao<TableXilinhaote, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableXilinhaote.class);
    }
}
