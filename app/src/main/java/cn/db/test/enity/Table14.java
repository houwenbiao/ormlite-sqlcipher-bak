package cn.db.test.enity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/09/27.
 * 用户类型对应的每时的制热供水温度
 */
@DatabaseTable(tableName = "table14")
public class Table14
{
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String roomType;//房间类型
    @DatabaseField(canBeNull = false)
    private double coolLoadIndex_default;//冷负荷指标默认
    @DatabaseField(canBeNull = false)
    private double coolLoadIndex_min;//冷负荷指标下限
    @DatabaseField(canBeNull = false)
    private double coolLoadIndex_max;//冷负荷指标下限

    @DatabaseField(canBeNull = false)
    private double heatLoadIndex_default;//冷负荷指标默认
    @DatabaseField(canBeNull = false)
    private double heatLoadIndex_min;//冷负荷指标下限
    @DatabaseField(canBeNull = false)
    private double heatLoadIndex_max;//冷负荷指标下限

    public Table14() {
    }

    public Table14(String roomType, double coolLoadIndex_default, double coolLoadIndex_min, double coolLoadIndex_max, double heatLoadIndex_default, double heatLoadIndex_min, double heatLoadIndex_max) {
        this.roomType = roomType;
        this.coolLoadIndex_default = coolLoadIndex_default;
        this.coolLoadIndex_min = coolLoadIndex_min;
        this.coolLoadIndex_max = coolLoadIndex_max;
        this.heatLoadIndex_default = heatLoadIndex_default;
        this.heatLoadIndex_min = heatLoadIndex_min;
        this.heatLoadIndex_max = heatLoadIndex_max;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getCoolLoadIndex_default() {
        return coolLoadIndex_default;
    }

    public void setCoolLoadIndex_default(double coolLoadIndex_default) {
        this.coolLoadIndex_default = coolLoadIndex_default;
    }

    public double getCoolLoadIndex_min() {
        return coolLoadIndex_min;
    }

    public void setCoolLoadIndex_min(double coolLoadIndex_min) {
        this.coolLoadIndex_min = coolLoadIndex_min;
    }

    public double getCoolLoadIndex_max() {
        return coolLoadIndex_max;
    }

    public void setCoolLoadIndex_max(double coolLoadIndex_max) {
        this.coolLoadIndex_max = coolLoadIndex_max;
    }

    public double getHeatLoadIndex_default() {
        return heatLoadIndex_default;
    }

    public void setHeatLoadIndex_default(double heatLoadIndex_default) {
        this.heatLoadIndex_default = heatLoadIndex_default;
    }

    public double getHeatLoadIndex_min() {
        return heatLoadIndex_min;
    }

    public void setHeatLoadIndex_min(double heatLoadIndex_min) {
        this.heatLoadIndex_min = heatLoadIndex_min;
    }

    public double getHeatLoadIndex_max() {
        return heatLoadIndex_max;
    }

    public void setHeatLoadIndex_max(double heatLoadIndex_max) {
        this.heatLoadIndex_max = heatLoadIndex_max;
    }

    @Override
    public String toString() {
        return "Table14{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", coolLoadIndex_default=" + coolLoadIndex_default +
                ", coolLoadIndex_min=" + coolLoadIndex_min +
                ", coolLoadIndex_max=" + coolLoadIndex_max +
                ", heatLoadIndex_default=" + heatLoadIndex_default +
                ", heatLoadIndex_min=" + heatLoadIndex_min +
                ", heatLoadIndex_max=" + heatLoadIndex_max +
                '}';
    }
}
