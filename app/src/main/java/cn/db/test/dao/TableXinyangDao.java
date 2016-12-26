package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableXingtai;
import cn.db.test.enity.TableXinyang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableXinyangDao extends BaseDAO< TableXinyang> {
    private static TableXinyangDao instance;

    private TableXinyangDao() {
    }

    public synchronized static TableXinyangDao getInstance() {
        if (instance == null) {
            instance = new TableXinyangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableXinyang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableXinyang.class);
    }
}
