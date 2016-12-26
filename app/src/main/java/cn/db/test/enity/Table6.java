package cn.db.test.enity;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/8/18.
 * 城市包括的信息
 */
@DatabaseTable(tableName = "table6")
public class Table6
{
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String province;//省/直辖市
    @DatabaseField(canBeNull = false)
    private String cityName;//城市
    @DatabaseField(canBeNull = false)
    private String meteorological;//气象区属
    @DatabaseField(canBeNull = false)
    private double factor;//修正系数
    @DatabaseField(canBeNull = false)
    private double atmoPressure;//大气压力
    @DatabaseField(canBeNull = false)
    private double outDryBulbTem;//室外设计干球
    @DatabaseField(canBeNull = false)
    private double outDryBulbTem_Summer;//室外设计干球-夏季空调
    @DatabaseField(canBeNull = false)
    private double highEnvirTem;//最高环温
    @DatabaseField(canBeNull = false)
    private double lowEnvirTem;//最低环温
    @DatabaseField(canBeNull = false)
    private double winAveWindSpeed;//冬季室外平均风速
    @DatabaseField(canBeNull = false)
    private String startDate;//采暖开始时间
    @DatabaseField(canBeNull = false)
    private String endDate;//采暖结束时间

    public Table6()
    {
    }

    public Table6(String province, String cityName, String meteorological, double factor, double atmoPressure, double outDryBulbTem, double outDryBulbTem_Summer, double highEnvirTem, double lowEnvirTem, double winAveWindSpeed, String startDate, String endDate)
    {
        this.province = province;
        this.cityName = cityName;
        this.meteorological = meteorological;
        this.factor = factor;
        this.atmoPressure = atmoPressure;
        this.outDryBulbTem = outDryBulbTem;
        this.outDryBulbTem_Summer = outDryBulbTem_Summer;
        this.highEnvirTem = highEnvirTem;
        this.lowEnvirTem = lowEnvirTem;
        this.winAveWindSpeed = winAveWindSpeed;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getMeteorological()
    {
        return meteorological;
    }

    public void setMeteorological(String meteorological)
    {
        this.meteorological = meteorological;
    }

    public double getFactor()
    {
        return factor;
    }

    public void setFactor(double factor)
    {
        this.factor = factor;
    }

    public double getAtmoPressure()
    {
        return atmoPressure;
    }

    public void setAtmoPressure(double atmoPressure)
    {
        this.atmoPressure = atmoPressure;
    }

    public double getOutDryBulbTem()
    {
        return outDryBulbTem;
    }

    public void setOutDryBulbTem(double outDryBulbTem)
    {
        this.outDryBulbTem = outDryBulbTem;
    }

    public double getOutDryBulbTem_Summer()
    {
        return outDryBulbTem_Summer;
    }

    public void setOutDryBulbTem_Summer(double outDryBulbTem_Summer)
    {
        this.outDryBulbTem_Summer = outDryBulbTem_Summer;
    }

    public double getHighEnvirTem()
    {
        return highEnvirTem;
    }

    public void setHighEnvirTem(double highEnvirTem)
    {
        this.highEnvirTem = highEnvirTem;
    }

    public double getLowEnvirTem()
    {
        return lowEnvirTem;
    }

    public void setLowEnvirTem(double lowEnvirTem)
    {
        this.lowEnvirTem = lowEnvirTem;
    }

    public double getWinAveWindSpeed()
    {
        return winAveWindSpeed;
    }

    public void setWinAveWindSpeed(double winAveWindSpeed)
    {
        this.winAveWindSpeed = winAveWindSpeed;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    @Override
    public java.lang.String toString()
    {
        return "Table6{" +
                "id=" + id +
                ", province=" + province +
                ", cityName=" + cityName +
                ", meteorological=" + meteorological +
                ", factor=" + factor +
                ", atmoPressure=" + atmoPressure +
                ", outDryBulbTem=" + outDryBulbTem +
                ", outDryBulbTem_Summer=" + outDryBulbTem_Summer +
                ", highEnvirTem=" + highEnvirTem +
                ", lowEnvirTem=" + lowEnvirTem +
                ", winAveWindSpeed=" + winAveWindSpeed +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
