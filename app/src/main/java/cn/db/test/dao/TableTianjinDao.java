package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableTaiyuan;
import cn.db.test.enity.TableTianjin;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableTianjinDao extends BaseDAO< TableTianjin> {
    private static TableTianjinDao instance;

    private TableTianjinDao() {
    }

    public synchronized static TableTianjinDao getInstance() {
        if (instance == null) {
            instance = new TableTianjinDao();
        }
        return instance;
    }

    @Override
    public Dao<TableTianjin, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableTianjin.class);
    }
}
