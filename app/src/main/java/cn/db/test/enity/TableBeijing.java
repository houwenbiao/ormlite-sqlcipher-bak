package cn.db.test.enity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/09/26.
 * 北京干球温度
 */
@DatabaseTable(tableName = "tableBeijing")
public class TableBeijing
{
    @DatabaseField(generatedId = true)
    private int id;

    //日期
    @DatabaseField(canBeNull = false)
    private String date;

    //时刻
    @DatabaseField(canBeNull = false)
    private double hour;

    //干球温度
    @DatabaseField(canBeNull = false)
    private double drybulbTem;

    public TableBeijing()
    {
    }

    public TableBeijing(String date, double hour, double drybulbTem)
    {
        this.date = date;
        this.hour = hour;
        this.drybulbTem = drybulbTem;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public double getHour()
    {
        return hour;
    }

    public void setHour(double hour)
    {
        this.hour = hour;
    }

    public double getDrybulbTem()
    {
        return drybulbTem;
    }

    public void setDrybulbTem(double drybulbTem)
    {
        this.drybulbTem = drybulbTem;
    }

    @Override
    public String toString()
    {
        return "TableBeijing{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", drybulbTem=" + drybulbTem +
                '}';
    }
}