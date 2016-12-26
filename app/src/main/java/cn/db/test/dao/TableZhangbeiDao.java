package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableYushe;
import cn.db.test.enity.TableZhangbei;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableZhangbeiDao extends BaseDAO< TableZhangbei> {
    private static TableZhangbeiDao instance;

    private TableZhangbeiDao() {
    }

    public synchronized static TableZhangbeiDao getInstance() {
        if (instance == null) {
            instance = new TableZhangbeiDao();
        }
        return instance;
    }

    @Override
    public Dao<TableZhangbei, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableZhangbei.class);
    }
}
