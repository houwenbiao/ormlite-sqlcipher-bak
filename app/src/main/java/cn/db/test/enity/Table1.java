package cn.db.test.enity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/9/8.
 * table1的实体
 *
 * 内容：
 *       各个系列型号内机的参数表，用于查询显示
 */
@DatabaseTable(tableName = "table1")
public class Table1 {
    @DatabaseField(generatedId = true)
    private int id;

    //系列
    @DatabaseField(canBeNull = false,columnName = "airconSeries")
    private String airconSeries;
    //型号
    @DatabaseField(canBeNull = false)
    private String airconType;

    //GB/T 180430下的参数
    //制冷量/KW
    @DatabaseField(canBeNull = false)
    private double coolCapacityGB1;
    //制热量/KW
    @DatabaseField(canBeNull = false)
    private double heatCapacityGB1;
    //制冷消耗功率/KW
    @DatabaseField(canBeNull = false)
    private double coolPowerGB1;
    //制热消耗功率/KW
    @DatabaseField(canBeNull = false)
    private double heatPowerGB1;
    //制冷COP
    @DatabaseField(canBeNull = false)
    private double coolCOPGB1;
    //制热COP
    @DatabaseField(canBeNull = false)
    private double heatCOPGB1;

    //GB/T 25127下的参数
    //制热量/KW
    @DatabaseField
    private String heatCapacityGB2;
    //制热消耗功率/KW
    @DatabaseField
    private String heatPowerGB2;
    //制热量COP
    @DatabaseField
    private String heatCOPGB2;
    //IPLV(C)
    @DatabaseField
    private String IPLVCGB2;
    //IPLV(H)
    @DatabaseField
    private String IPLVHGB2;

    //共有属性
    //最大输入功率/KW
    @DatabaseField
    private double highInputPower;
    //能效等级
    @DatabaseField
    private String EERLevel;
    //电源
    @DatabaseField
    private String powerSupple;
    //外机尺寸/mm
    @DatabaseField
    private String outdoorSize;
    //内机尺寸/mm
    @DatabaseField
    private String indoorSize;
    //外机噪音/dB(A)
    @DatabaseField
    private String outdoorNoise;
    //内机噪音/dB(A)
    @DatabaseField
    private String indoorNoise;

    public Table1(){

    }

    public Table1(String airconSeries, String airconType, double coolCapacityGB1, double heatCapacityGB1, double coolPowerGB1, double heatPowerGB1, double coolCOPGB1, double heatCOPGB1, String heatCapacityGB2, String heatPowerGB2, String heatCOPGB2, String IPLVCGB2, String IPLVHGB2, double highInputPower, String EERLevel, String powerSupple, String outdoorSize, String indoorSize, String outdoorNoise, String indoorNoise)
    {
        this.airconSeries = airconSeries;
        this.airconType = airconType;
        this.coolCapacityGB1 = coolCapacityGB1;
        this.heatCapacityGB1 = heatCapacityGB1;
        this.coolPowerGB1 = coolPowerGB1;
        this.heatPowerGB1 = heatPowerGB1;
        this.coolCOPGB1 = coolCOPGB1;
        this.heatCOPGB1 = heatCOPGB1;
        this.heatCapacityGB2 = heatCapacityGB2;
        this.heatPowerGB2 = heatPowerGB2;
        this.heatCOPGB2 = heatCOPGB2;
        this.IPLVCGB2 = IPLVCGB2;
        this.IPLVHGB2 = IPLVHGB2;
        this.highInputPower = highInputPower;
        this.EERLevel = EERLevel;
        this.powerSupple = powerSupple;
        this.outdoorSize = outdoorSize;
        this.indoorSize = indoorSize;
        this.outdoorNoise = outdoorNoise;
        this.indoorNoise = indoorNoise;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAirconSeries()
    {
        return airconSeries;
    }

    public void setAirconSeries(String airconSeries)
    {
        this.airconSeries = airconSeries;
    }

    public String getAirconType()
    {
        return airconType;
    }

    public void setAirconType(String airconType)
    {
        this.airconType = airconType;
    }

    public double getCoolCapacityGB1()
    {
        return coolCapacityGB1;
    }

    public void setCoolCapacityGB1(double coolCapacityGB1)
    {
        this.coolCapacityGB1 = coolCapacityGB1;
    }

    public double getHeatCapacityGB1()
    {
        return heatCapacityGB1;
    }

    public void setHeatCapacityGB1(double heatCapacityGB1)
    {
        this.heatCapacityGB1 = heatCapacityGB1;
    }

    public double getCoolPowerGB1()
    {
        return coolPowerGB1;
    }

    public void setCoolPowerGB1(double coolPowerGB1)
    {
        this.coolPowerGB1 = coolPowerGB1;
    }

    public double getHeatPowerGB1()
    {
        return heatPowerGB1;
    }

    public void setHeatPowerGB1(double heatPowerGB1)
    {
        this.heatPowerGB1 = heatPowerGB1;
    }

    public double getCoolCOPGB1()
    {
        return coolCOPGB1;
    }

    public void setCoolCOPGB1(double coolCOPGB1)
    {
        this.coolCOPGB1 = coolCOPGB1;
    }

    public double getHeatCOPGB1()
    {
        return heatCOPGB1;
    }

    public void setHeatCOPGB1(double heatCOPGB1)
    {
        this.heatCOPGB1 = heatCOPGB1;
    }

    public String getHeatCapacityGB2()
    {
        return heatCapacityGB2;
    }

    public void setHeatCapacityGB2(String heatCapacityGB2)
    {
        this.heatCapacityGB2 = heatCapacityGB2;
    }

    public String getHeatPowerGB2()
    {
        return heatPowerGB2;
    }

    public void setHeatPowerGB2(String heatPowerGB2)
    {
        this.heatPowerGB2 = heatPowerGB2;
    }

    public String getHeatCOPGB2()
    {
        return heatCOPGB2;
    }

    public void setHeatCOPGB2(String heatCOPGB2)
    {
        this.heatCOPGB2 = heatCOPGB2;
    }

    public String getIPLVCGB2()
    {
        return IPLVCGB2;
    }

    public void setIPLVCGB2(String IPLVCGB2)
    {
        this.IPLVCGB2 = IPLVCGB2;
    }

    public String getIPLVHGB2()
    {
        return IPLVHGB2;
    }

    public void setIPLVHGB2(String IPLVHGB2)
    {
        this.IPLVHGB2 = IPLVHGB2;
    }

    public double getHighInputPower()
    {
        return highInputPower;
    }

    public void setHighInputPower(double highInputPower)
    {
        this.highInputPower = highInputPower;
    }

    public String getEERLevel()
    {
        return EERLevel;
    }

    public void setEERLevel(String EERLevel)
    {
        this.EERLevel = EERLevel;
    }

    public String getPowerSupple()
    {
        return powerSupple;
    }

    public void setPowerSupple(String powerSupple)
    {
        this.powerSupple = powerSupple;
    }

    public String getOutdoorSize()
    {
        return outdoorSize;
    }

    public void setOutdoorSize(String outdoorSize)
    {
        this.outdoorSize = outdoorSize;
    }

    public String getIndoorSize()
    {
        return indoorSize;
    }

    public void setIndoorSize(String indoorSize)
    {
        this.indoorSize = indoorSize;
    }

    public String getOutdoorNoise()
    {
        return outdoorNoise;
    }

    public void setOutdoorNoise(String outdoorNoise)
    {
        this.outdoorNoise = outdoorNoise;
    }

    public String getIndoorNoise()
    {
        return indoorNoise;
    }

    public void setIndoorNoise(String indoorNoise)
    {
        this.indoorNoise = indoorNoise;
    }

    @Override
    public String toString()
    {
        return "Table1{" +
                "id=" + id +
                ", airconSeries='" + airconSeries + '\'' +
                ", airconType='" + airconType + '\'' +
                ", coolCapacityGB1=" + coolCapacityGB1 +
                ", heatCapacityGB1=" + heatCapacityGB1 +
                ", coolPowerGB1=" + coolPowerGB1 +
                ", heatPowerGB1=" + heatPowerGB1 +
                ", coolCOPGB1=" + coolCOPGB1 +
                ", heatCOPGB1=" + heatCOPGB1 +
                ", heatCapacityGB2=" + heatCapacityGB2 +
                ", heatPowerGB2=" + heatPowerGB2 +
                ", heatCOPGB2=" + heatCOPGB2 +
                ", IPLVCGB2=" + IPLVCGB2 +
                ", IPLVHGB2=" + IPLVHGB2 +
                ", highInputPower=" + highInputPower +
                ", EERLevel='" + EERLevel + '\'' +
                ", powerSupple='" + powerSupple + '\'' +
                ", outdoorSize='" + outdoorSize + '\'' +
                ", indoorSize='" + indoorSize + '\'' +
                ", outdoorNoise='" + outdoorNoise + '\'' +
                ", indoorNoise='" + indoorNoise + '\'' +
                '}';
    }
}
