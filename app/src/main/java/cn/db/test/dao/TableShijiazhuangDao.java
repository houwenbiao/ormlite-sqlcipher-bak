package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableShangqiu;
import cn.db.test.enity.TableShijiazhuang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableShijiazhuangDao extends BaseDAO< TableShijiazhuang> {
    private static TableShijiazhuangDao instance;

    private TableShijiazhuangDao() {
    }

    public synchronized static TableShijiazhuangDao getInstance() {
        if (instance == null) {
            instance = new TableShijiazhuangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableShijiazhuang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableShijiazhuang.class);
    }
}
