package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableShijiazhuang;
import cn.db.test.enity.TableTaiyuan;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableTaiyuanDao extends BaseDAO< TableTaiyuan> {
    private static TableTaiyuanDao instance;

    private TableTaiyuanDao() {
    }

    public synchronized static TableTaiyuanDao getInstance() {
        if (instance == null) {
            instance = new TableTaiyuanDao();
        }
        return instance;
    }

    @Override
    public Dao<TableTaiyuan, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableTaiyuan.class);
    }
}
