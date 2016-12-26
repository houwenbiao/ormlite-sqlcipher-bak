package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableWeifang;
import cn.db.test.enity.TableXiAn;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableXiAnDao extends BaseDAO< TableXiAn> {
    private static TableXiAnDao instance;

    private TableXiAnDao() {
    }

    public synchronized static TableXiAnDao getInstance() {
        if (instance == null) {
            instance = new TableXiAnDao();
        }
        return instance;
    }

    @Override
    public Dao<TableXiAn, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableXiAn.class);
    }
}
