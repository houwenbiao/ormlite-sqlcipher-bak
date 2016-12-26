package cn.db.test.enity;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by godmeir on 2016/9/9.
 * 内容：
 * 制热供水温度
 */
@DatabaseTable(tableName = "table5")
public class Table5
{
    @DatabaseField(generatedId = true)
    private int id;

    //末端
    @DatabaseField(canBeNull = false)
    private String endType;
    //采暖默认供水温度
    @DatabaseField
    private int heatDefaultSupplyWater;
    //采暖最高供水温度
    @DatabaseField
    private int heatMaxSupplyWater;
    //制冷默认供水温度
    @DatabaseField
    private int coolDefaultSupplyWater;
    //制冷最低供水温度
    @DatabaseField
    private int coolMinSupplyWater;

    public Table5()
    {
    }

    public Table5(String endType, int heatDefaultSupplyWater, int heatMaxSupplyWater, int coolDefaultSupplyWater, int coolMinSupplyWater)
    {
        this.endType = endType;
        this.heatDefaultSupplyWater = heatDefaultSupplyWater;
        this.heatMaxSupplyWater = heatMaxSupplyWater;
        this.coolDefaultSupplyWater = coolDefaultSupplyWater;
        this.coolMinSupplyWater = coolMinSupplyWater;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getEndType()
    {
        return endType;
    }

    public void setEndType(String endType)
    {
        this.endType = endType;
    }

    public int getHeatDefaultSupplyWater()
    {
        return heatDefaultSupplyWater;
    }

    public void setHeatDefaultSupplyWater(int heatDefaultSupplyWater)
    {
        this.heatDefaultSupplyWater = heatDefaultSupplyWater;
    }

    public int getHeatMaxSupplyWater()
    {
        return heatMaxSupplyWater;
    }

    public void setHeatMaxSupplyWater(int heatMaxSupplyWater)
    {
        this.heatMaxSupplyWater = heatMaxSupplyWater;
    }

    public int getCoolDefaultSupplyWater()
    {
        return coolDefaultSupplyWater;
    }

    public void setCoolDefaultSupplyWater(int coolDefaultSupplyWater)
    {
        this.coolDefaultSupplyWater = coolDefaultSupplyWater;
    }

    public int getCoolMinSupplyWater()
    {
        return coolMinSupplyWater;
    }

    public void setCoolMinSupplyWater(int coolMinSupplyWater)
    {
        this.coolMinSupplyWater = coolMinSupplyWater;
    }

    @Override
    public String toString()
    {
        return "Table5{" +
                "id=" + id +
                ", endType='" + endType + '\'' +
                ", heatDefaultSupplyWater=" + heatDefaultSupplyWater +
                ", heatMaxSupplyWater=" + heatMaxSupplyWater +
                ", coolDefaultSupplyWater=" + coolDefaultSupplyWater +
                ", coolMinSupplyWater=" + coolMinSupplyWater +
                '}';
    }
}
