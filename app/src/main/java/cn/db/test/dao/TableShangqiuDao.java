package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableRaoyang;
import cn.db.test.enity.TableShangqiu;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableShangqiuDao extends BaseDAO< TableShangqiu> {
    private static TableShangqiuDao instance;

    private TableShangqiuDao() {
    }

    public synchronized static TableShangqiuDao getInstance() {
        if (instance == null) {
            instance = new TableShangqiuDao();
        }
        return instance;
    }

    @Override
    public Dao<TableShangqiu, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableShangqiu.class);
    }
}
