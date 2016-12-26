package cn.db.test.dao;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import cn.db.test.DBManager;
import cn.db.test.enity.TableXilinhaote;
import cn.db.test.enity.TableXingtai;

/**
 * Created by Stay on 29/10/15.
 * Powered by www.stay4it.com
 */
public class TableXingtaiDao extends BaseDAO< TableXingtai> {
    private static TableXingtaiDao instance;

    private TableXingtaiDao() {
    }

    public synchronized static TableXingtaiDao getInstance() {
        if (instance == null) {
            instance = new TableXingtaiDao();
        }
        return instance;
    }

    @Override
    public Dao<TableXingtai, String> getDAO() throws SQLException {
        return DBManager.getInstance().getDAO( TableXingtai.class);
    }
}
