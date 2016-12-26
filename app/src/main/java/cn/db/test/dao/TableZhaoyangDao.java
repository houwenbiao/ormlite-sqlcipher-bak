package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableZhangbei;
import cn.db.test.enity.TableZhaoyang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableZhaoyangDao extends BaseDAO< TableZhaoyang> {
    private static TableZhaoyangDao instance;

    private TableZhaoyangDao() {
    }

    public synchronized static TableZhaoyangDao getInstance() {
        if (instance == null) {
            instance = new TableZhaoyangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableZhaoyang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableZhaoyang.class);
    }
}
