package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.Table6;
import cn.db.test.enity.TableJiexiu;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableJiexiuDao extends BaseDAO<TableJiexiu> {
    private static TableJiexiuDao instance;

    private TableJiexiuDao() {
    }

    public synchronized static TableJiexiuDao getInstance() {
        if (instance == null) {
            instance = new TableJiexiuDao();
        }
        return instance;
    }

    @Override
    public Dao<TableJiexiu, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO(TableJiexiu.class);
    }
}
