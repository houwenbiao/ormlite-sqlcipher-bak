package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableYuanping;
import cn.db.test.enity.TableYuncheng;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableYunchengDao extends BaseDAO< TableYuncheng> {
    private static TableYunchengDao instance;

    private TableYunchengDao() {
    }

    public synchronized static TableYunchengDao getInstance() {
        if (instance == null) {
            instance = new TableYunchengDao();
        }
        return instance;
    }

    @Override
    public Dao<TableYuncheng, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableYuncheng.class);
    }
}
