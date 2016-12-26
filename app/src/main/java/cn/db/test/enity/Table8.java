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
@DatabaseTable(tableName = "table8")
public class Table8
{
    @DatabaseField(generatedId = true)
    private int id;

    //省/直辖市
    @DatabaseField(canBeNull = false,columnName = "province")
    private String province;
    //能源类型
    @DatabaseField(canBeNull = false)
    private String energyTypes;

    //用电类型
    @DatabaseField(canBeNull = false)
    private String electricityTypes;
    //费用计算方法
    @DatabaseField(canBeNull = false)
    private String calculateMethods;
    //峰时段1开始
    @DatabaseField
    private String peakTime1Start;
    //峰时段1结束
    @DatabaseField
    private String peakTime1End;
    //峰时段2开始
    @DatabaseField
    private String peakTime2Start;
    //峰时段2结束
    @DatabaseField
    private String peakTime2End;
    //谷时段开始
    @DatabaseField
    private String valleyTimeStart;
    //谷时段结束
    @DatabaseField
    private String valleyTimeEnd;
    //平时时段开始
    @DatabaseField
    private String usualTimeStart;
    //平时时段结束
    @DatabaseField
    private String usualTimeEnd;
    //第一档
    @DatabaseField
    private double firstGear;
    //峰时价格1
    @DatabaseField
    private double peakTimePrice1;
    //谷时价格1
    @DatabaseField
    private double valleyTimePrice1;
    //平时价格1
    @DatabaseField
    private double usualTimePrice1;
    //第2档
    @DatabaseField
    private double secondGear;
    //峰时价格2
    @DatabaseField
    private double peakTimePrice2;
    //谷时价格2
    @DatabaseField
    private double valleyTimePrice2;
    //平时价格2
    @DatabaseField
    private double usualTimePrice2;
    //第3档
    @DatabaseField
    private double thirdGear;
    //峰时价格3
    @DatabaseField
    private double peakTimePrice3;
    //谷时价格3
    @DatabaseField
    private double valleyTimePrice3;
    //平时价格3
    @DatabaseField
    private double usualTimePrice3;

    public Table8()
    {
    }

    public Table8(String province, String energyTypes, String electricityTypes, String calculateMethods, String peakTime1Start, String peakTime1End, String peakTime2Start, String peakTime2End, String valleyTimeStart, String valleyTimeEnd, String usualTimeStart, String usualTimeEnd, double firstGear, double peakTimePrice1, double valleyTimePrice1, double usualTimePrice1, double secondGear, double peakTimePrice2, double valleyTimePrice2, double usualTimePrice2, double thirdGear, double peakTimePrice3, double valleyTimePrice3, double usualTimePrice3)
    {
        this.province = province;
        this.energyTypes = energyTypes;
        this.electricityTypes = electricityTypes;
        this.calculateMethods = calculateMethods;
        this.peakTime1Start = peakTime1Start;
        this.peakTime1End = peakTime1End;
        this.peakTime2Start = peakTime2Start;
        this.peakTime2End = peakTime2End;
        this.valleyTimeStart = valleyTimeStart;
        this.valleyTimeEnd = valleyTimeEnd;
        this.usualTimeStart = usualTimeStart;
        this.usualTimeEnd = usualTimeEnd;
        this.firstGear = firstGear;
        this.peakTimePrice1 = peakTimePrice1;
        this.valleyTimePrice1 = valleyTimePrice1;
        this.usualTimePrice1 = usualTimePrice1;
        this.secondGear = secondGear;
        this.peakTimePrice2 = peakTimePrice2;
        this.valleyTimePrice2 = valleyTimePrice2;
        this.usualTimePrice2 = usualTimePrice2;
        this.thirdGear = thirdGear;
        this.peakTimePrice3 = peakTimePrice3;
        this.valleyTimePrice3 = valleyTimePrice3;
        this.usualTimePrice3 = usualTimePrice3;
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

    public String getEnergyTypes()
    {
        return energyTypes;
    }

    public void setEnergyTypes(String energyTypes)
    {
        this.energyTypes = energyTypes;
    }

    public String getElectricityTypes()
    {
        return electricityTypes;
    }

    public void setElectricityTypes(String electricityTypes)
    {
        this.electricityTypes = electricityTypes;
    }

    public String getPeakTime1Start()
    {
        return peakTime1Start;
    }

    public void setPeakTime1Start(String peakTime1Start)
    {
        this.peakTime1Start = peakTime1Start;
    }

    public String getPeakTime1End()
    {
        return peakTime1End;
    }

    public void setPeakTime1End(String peakTime1End)
    {
        this.peakTime1End = peakTime1End;
    }

    public String getPeakTime2Start()
    {
        return peakTime2Start;
    }

    public void setPeakTime2Start(String peakTime2Start)
    {
        this.peakTime2Start = peakTime2Start;
    }

    public String getPeakTime2End()
    {
        return peakTime2End;
    }

    public void setPeakTime2End(String peakTime2End)
    {
        this.peakTime2End = peakTime2End;
    }

    public String getValleyTimeEnd()
    {
        return valleyTimeEnd;
    }

    public void setValleyTimeEnd(String valleyTimeEnd)
    {
        this.valleyTimeEnd = valleyTimeEnd;
    }

    public String getUsualTimeStart()
    {
        return usualTimeStart;
    }

    public void setUsualTimeStart(String usualTimeStart)
    {
        this.usualTimeStart = usualTimeStart;
    }

    public String getUsualTimeEnd()
    {
        return usualTimeEnd;
    }

    public void setUsualTimeEnd(String usualTimeEnd)
    {
        this.usualTimeEnd = usualTimeEnd;
    }

    public double getFirstGear()
    {
        return firstGear;
    }

    public void setFirstGear(double firstGear)
    {
        this.firstGear = firstGear;
    }

    public double getPeakTimePrice1()
    {
        return peakTimePrice1;
    }

    public void setPeakTimePrice1(double peakTimePrice1)
    {
        this.peakTimePrice1 = peakTimePrice1;
    }

    public double getValleyTimePrice1()
    {
        return valleyTimePrice1;
    }

    public void setValleyTimePrice1(double valleyTimePrice1)
    {
        this.valleyTimePrice1 = valleyTimePrice1;
    }

    public double getUsualTimePrice1()
    {
        return usualTimePrice1;
    }

    public void setUsualTimePrice1(double usualTimePrice1)
    {
        this.usualTimePrice1 = usualTimePrice1;
    }

    public double getSecondGear()
    {
        return secondGear;
    }

    public void setSecondGear(double secondGear)
    {
        this.secondGear = secondGear;
    }

    public double getPeakTimePrice2()
    {
        return peakTimePrice2;
    }

    public void setPeakTimePrice2(double peakTimePrice2)
    {
        this.peakTimePrice2 = peakTimePrice2;
    }

    public double getValleyTimePrice2()
    {
        return valleyTimePrice2;
    }

    public void setValleyTimePrice2(double valleyTimePrice2)
    {
        this.valleyTimePrice2 = valleyTimePrice2;
    }

    public double getUsualTimePrice2()
    {
        return usualTimePrice2;
    }

    public void setUsualTimePrice2(double usualTimePrice2)
    {
        this.usualTimePrice2 = usualTimePrice2;
    }

    public double getThirdGear()
    {
        return thirdGear;
    }

    public void setThirdGear(double thirdGear)
    {
        this.thirdGear = thirdGear;
    }

    public double getPeakTimePrice3()
    {
        return peakTimePrice3;
    }

    public void setPeakTimePrice3(double peakTimePrice3)
    {
        this.peakTimePrice3 = peakTimePrice3;
    }

    public double getValleyTimePrice3()
    {
        return valleyTimePrice3;
    }

    public void setValleyTimePrice3(double valleyTimePrice3)
    {
        this.valleyTimePrice3 = valleyTimePrice3;
    }

    public double getUsualTimePrice3()
    {
        return usualTimePrice3;
    }

    public void setUsualTimePrice3(double usualTimePrice3)
    {
        this.usualTimePrice3 = usualTimePrice3;
    }

    public String getValleyTimeStart()
    {
        return valleyTimeStart;
    }

    public void setValleyTimeStart(String valleyTimeStart)
    {
        this.valleyTimeStart = valleyTimeStart;
    }

    public String getCalculateMethods()
    {
        return calculateMethods;
    }

    public void setCalculateMethods(String calculateMethods)
    {
        this.calculateMethods = calculateMethods;
    }

    @Override
    public String toString()
    {
        return "Table8{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", energyTypes='" + energyTypes + '\'' +
                ", electricityTypes='" + electricityTypes + '\'' +
                ", calculateMethods='" + calculateMethods + '\'' +
                ", peakTime1Start='" + peakTime1Start + '\'' +
                ", peakTime1End='" + peakTime1End + '\'' +
                ", peakTime2Start='" + peakTime2Start + '\'' +
                ", peakTime2End='" + peakTime2End + '\'' +
                ", valleyTimeStart='" + valleyTimeStart + '\'' +
                ", valleyTimeEnd='" + valleyTimeEnd + '\'' +
                ", usualTimeStart='" + usualTimeStart + '\'' +
                ", usualTimeEnd='" + usualTimeEnd + '\'' +
                ", firstGear=" + firstGear +
                ", peakTimePrice1=" + peakTimePrice1 +
                ", valleyTimePrice1=" + valleyTimePrice1 +
                ", usualTimePrice1=" + usualTimePrice1 +
                ", secondGear=" + secondGear +
                ", peakTimePrice2=" + peakTimePrice2 +
                ", valleyTimePrice2=" + valleyTimePrice2 +
                ", usualTimePrice2=" + usualTimePrice2 +
                ", thirdGear=" + thirdGear +
                ", peakTimePrice3=" + peakTimePrice3 +
                ", valleyTimePrice3=" + valleyTimePrice3 +
                ", usualTimePrice3=" + usualTimePrice3 +
                '}';
    }
}
