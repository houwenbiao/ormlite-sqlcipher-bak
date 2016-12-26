package cn.db.test.enity;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by godmeir on 2016/9/9.
 * 内容：
 * 制热修正系数
 */
@DatabaseTable(tableName = "table3")
public class Table3
{
    @DatabaseField(generatedId = true)
    private int id;

    //机型
    @DatabaseField(canBeNull = false)
    private String airconType;
    //制热默认供水温度
    @DatabaseField(canBeNull = false)
    private int heatDefaultSupplyWater;
    //24
    @DatabaseField(canBeNull = false)
    private double twentyFour;
    //15
    @DatabaseField(canBeNull = false)
    private double fifteen;
    //7
    @DatabaseField(canBeNull = false)
    private double seven;
    //0
    @DatabaseField(canBeNull = false)
    private double zero;
    //-7
    @DatabaseField(canBeNull = false)
    private double negativeSeven;
    //-9
    @DatabaseField(canBeNull = false)
    private double negativeNine;
    //-15
    @DatabaseField(canBeNull = false)
    private double negativeFifteen;
    //-20
    @DatabaseField(canBeNull = false)
    private double negativeTwenty;
    //-25
    @DatabaseField(canBeNull = false)
    private double negativeTwentyFive;
    //-30
    @DatabaseField(canBeNull = false)
    private double negativeThirty;

    public Table3()
    {
    }

    public Table3(String airconType, int heatDefaultSupplyWater, double twentyFour, double fifteen, double seven, double zero, double negativeSeven, double negativeNine, double negativeFifteen, double negativeTwenty, double negativeTwentyFive, double negativeThirty)
    {
        this.airconType = airconType;
        this.heatDefaultSupplyWater = heatDefaultSupplyWater;
        this.twentyFour = twentyFour;
        this.fifteen = fifteen;
        this.seven = seven;
        this.zero = zero;
        this.negativeSeven = negativeSeven;
        this.negativeNine = negativeNine;
        this.negativeFifteen = negativeFifteen;
        this.negativeTwenty = negativeTwenty;
        this.negativeTwentyFive = negativeTwentyFive;
        this.negativeThirty = negativeThirty;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAirconType()
    {
        return airconType;
    }

    public void setAirconType(String airconType)
    {
        this.airconType = airconType;
    }

    public int getHeatDefaultSupplyWater()
    {
        return heatDefaultSupplyWater;
    }

    public void setHeatDefaultSupplyWater(int heatDefaultSupplyWater)
    {
        this.heatDefaultSupplyWater = heatDefaultSupplyWater;
    }

    public double getTwentyFour()
    {
        return twentyFour;
    }

    public void setTwentyFour(double twentyFour)
    {
        this.twentyFour = twentyFour;
    }

    public double getFifteen()
    {
        return fifteen;
    }

    public void setFifteen(double fifteen)
    {
        this.fifteen = fifteen;
    }

    public double getSeven()
    {
        return seven;
    }

    public void setSeven(double seven)
    {
        this.seven = seven;
    }

    public double getZero()
    {
        return zero;
    }

    public void setZero(double zero)
    {
        this.zero = zero;
    }

    public double getNegativeSeven()
    {
        return negativeSeven;
    }

    public void setNegativeSeven(double negativeSeven)
    {
        this.negativeSeven = negativeSeven;
    }

    public double getNegativeNine()
    {
        return negativeNine;
    }

    public void setNegativeNine(double negativeNine)
    {
        this.negativeNine = negativeNine;
    }

    public double getNegativeFifteen()
    {
        return negativeFifteen;
    }

    public void setNegativeFifteen(double negativeFifteen)
    {
        this.negativeFifteen = negativeFifteen;
    }

    public double getNegativeTwenty()
    {
        return negativeTwenty;
    }

    public void setNegativeTwenty(double negativeTwenty)
    {
        this.negativeTwenty = negativeTwenty;
    }

    public double getNegativeTwentyFive()
    {
        return negativeTwentyFive;
    }

    public void setNegativeTwentyFive(double negativeTwentyFive)
    {
        this.negativeTwentyFive = negativeTwentyFive;
    }

    public double getNegativeThirty()
    {
        return negativeThirty;
    }

    public void setNegativeThirty(double negativeThirty)
    {
        this.negativeThirty = negativeThirty;
    }

    @Override
    public String toString()
    {
        return "Table3{" +
                "id=" + id +
                ", airconType='" + airconType + '\'' +
                ", heatDefaultSupplyWater=" + heatDefaultSupplyWater +
                ", twentyFour=" + twentyFour +
                ", fifteen=" + fifteen +
                ", seven=" + seven +
                ", zero=" + zero +
                ", negativeSeven=" + negativeSeven +
                ", negativeNine=" + negativeNine +
                ", negativeFifteen=" + negativeFifteen +
                ", negativeTwenty=" + negativeTwenty +
                ", negativeTwentyFive=" + negativeTwentyFive +
                ", negativeThirty=" + negativeThirty +
                '}';
    }
}
