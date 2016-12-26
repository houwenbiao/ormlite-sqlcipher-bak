package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableTianjin;
import cn.db.test.enity.TableWeifang;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableWeifangDao extends BaseDAO< TableWeifang> {
    private static TableWeifangDao instance;

    private TableWeifangDao() {
    }

    public synchronized static TableWeifangDao getInstance() {
        if (instance == null) {
            instance = new TableWeifangDao();
        }
        return instance;
    }

    @Override
    public Dao<TableWeifang, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableWeifang.class);
    }
}
