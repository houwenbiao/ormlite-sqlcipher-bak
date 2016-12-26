package cn.db.test.enity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/09/27.
 * 用户类型对应的每时的制热供水温度
 */
@DatabaseTable(tableName = "table12")
public class Table12
{
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String userType;//用户类型
    @DatabaseField(canBeNull = false)
    private String timeBucket;//时间段
    @DatabaseField(canBeNull = false)
    private String endType;//末端

    @DatabaseField(canBeNull = false)
    private double hour0;
    @DatabaseField(canBeNull = false)
    private double hour1;
    @DatabaseField(canBeNull = false)
    private double hour2;
    @DatabaseField(canBeNull = false)
    private double hour3;
    @DatabaseField(canBeNull = false)
    private double hour4;
    @DatabaseField(canBeNull = false)
    private double hour5;
    @DatabaseField(canBeNull = false)
    private double hour6;
    @DatabaseField(canBeNull = false)
    private double hour7;
    @DatabaseField(canBeNull = false)
    private double hour8;
    @DatabaseField(canBeNull = false)
    private double hour9;
    @DatabaseField(canBeNull = false)
    private double hour10;
    @DatabaseField(canBeNull = false)
    private double hour11;
    @DatabaseField(canBeNull = false)
    private double hour12;
    @DatabaseField(canBeNull = false)
    private double hour13;
    @DatabaseField(canBeNull = false)
    private double hour14;
    @DatabaseField(canBeNull = false)
    private double hour15;
    @DatabaseField(canBeNull = false)
    private double hour16;
    @DatabaseField(canBeNull = false)
    private double hour17;
    @DatabaseField(canBeNull = false)
    private double hour18;
    @DatabaseField(canBeNull = false)
    private double hour19;
    @DatabaseField(canBeNull = false)
    private double hour20;
    @DatabaseField(canBeNull = false)
    private double hour21;
    @DatabaseField(canBeNull = false)
    private double hour22;
    @DatabaseField(canBeNull = false)
    private double hour23;

    public Table12()
    {
    }

    public Table12(String userType, String timeBucket, String endType, double hour0, double hour1, double hour2, double hour3, double hour4, double hour5, double hour6, double hour7, double hour8, double hour9, double hour10, double hour11, double hour12, double hour13, double hour14, double hour15, double hour16, double hour17, double hour18, double hour19, double hour20, double hour21, double hour22, double hour23)
    {
        this.userType = userType;
        this.timeBucket = timeBucket;
        this.endType = endType;
        this.hour0 = hour0;
        this.hour1 = hour1;
        this.hour2 = hour2;
        this.hour3 = hour3;
        this.hour4 = hour4;
        this.hour5 = hour5;
        this.hour6 = hour6;
        this.hour7 = hour7;
        this.hour8 = hour8;
        this.hour9 = hour9;
        this.hour10 = hour10;
        this.hour11 = hour11;
        this.hour12 = hour12;
        this.hour13 = hour13;
        this.hour14 = hour14;
        this.hour15 = hour15;
        this.hour16 = hour16;
        this.hour17 = hour17;
        this.hour18 = hour18;
        this.hour19 = hour19;
        this.hour20 = hour20;
        this.hour21 = hour21;
        this.hour22 = hour22;
        this.hour23 = hour23;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUserType()
    {
        return userType;
    }

    public void setUserType(String userType)
    {
        this.userType = userType;
    }

    public String getTimeBucket()
    {
        return timeBucket;
    }

    public void setTimeBucket(String timeBucket)
    {
        this.timeBucket = timeBucket;
    }

    public String getEndType()
    {
        return endType;
    }

    public void setEndType(String endType)
    {
        this.endType = endType;
    }

    public double getHour0()
    {
        return hour0;
    }

    public void setHour0(double hour0)
    {
        this.hour0 = hour0;
    }

    public double getHour1()
    {
        return hour1;
    }

    public void setHour1(double hour1)
    {
        this.hour1 = hour1;
    }

    public double getHour2()
    {
        return hour2;
    }

    public void setHour2(double hour2)
    {
        this.hour2 = hour2;
    }

    public double getHour3()
    {
        return hour3;
    }

    public void setHour3(double hour3)
    {
        this.hour3 = hour3;
    }

    public double getHour4()
    {
        return hour4;
    }

    public void setHour4(double hour4)
    {
        this.hour4 = hour4;
    }

    public double getHour5()
    {
        return hour5;
    }

    public void setHour5(double hour5)
    {
        this.hour5 = hour5;
    }

    public double getHour6()
    {
        return hour6;
    }

    public void setHour6(double hour6)
    {
        this.hour6 = hour6;
    }

    public double getHour7()
    {
        return hour7;
    }

    public void setHour7(double hour7)
    {
        this.hour7 = hour7;
    }

    public double getHour8()
    {
        return hour8;
    }

    public void setHour8(double hour8)
    {
        this.hour8 = hour8;
    }

    public double getHour9()
    {
        return hour9;
    }

    public void setHour9(double hour9)
    {
        this.hour9 = hour9;
    }

    public double getHour10()
    {
        return hour10;
    }

    public void setHour10(double hour10)
    {
        this.hour10 = hour10;
    }

    public double getHour11()
    {
        return hour11;
    }

    public void setHour11(double hour11)
    {
        this.hour11 = hour11;
    }

    public double getHour12()
    {
        return hour12;
    }

    public void setHour12(double hour12)
    {
        this.hour12 = hour12;
    }

    public double getHour13()
    {
        return hour13;
    }

    public void setHour13(double hour13)
    {
        this.hour13 = hour13;
    }

    public double getHour14()
    {
        return hour14;
    }

    public void setHour14(double hour14)
    {
        this.hour14 = hour14;
    }

    public double getHour15()
    {
        return hour15;
    }

    public void setHour15(double hour15)
    {
        this.hour15 = hour15;
    }

    public double getHour16()
    {
        return hour16;
    }

    public void setHour16(double hour16)
    {
        this.hour16 = hour16;
    }

    public double getHour17()
    {
        return hour17;
    }

    public void setHour17(double hour17)
    {
        this.hour17 = hour17;
    }

    public double getHour18()
    {
        return hour18;
    }

    public void setHour18(double hour18)
    {
        this.hour18 = hour18;
    }

    public double getHour19()
    {
        return hour19;
    }

    public void setHour19(double hour19)
    {
        this.hour19 = hour19;
    }

    public double getHour20()
    {
        return hour20;
    }

    public void setHour20(double hour20)
    {
        this.hour20 = hour20;
    }

    public double getHour21()
    {
        return hour21;
    }

    public void setHour21(double hour21)
    {
        this.hour21 = hour21;
    }

    public double getHour22()
    {
        return hour22;
    }

    public void setHour22(double hour22)
    {
        this.hour22 = hour22;
    }

    public double getHour23()
    {
        return hour23;
    }

    public void setHour23(double hour23)
    {
        this.hour23 = hour23;
    }

    @Override
    public String toString()
    {
        return "Table12{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                ", timeBucket='" + timeBucket + '\'' +
                ", endType='" + endType + '\'' +
                ", hour0=" + hour0 +
                ", hour1=" + hour1 +
                ", hour2=" + hour2 +
                ", hour3=" + hour3 +
                ", hour4=" + hour4 +
                ", hour5=" + hour5 +
                ", hour6=" + hour6 +
                ", hour7=" + hour7 +
                ", hour8=" + hour8 +
                ", hour9=" + hour9 +
                ", hour10=" + hour10 +
                ", hour11=" + hour11 +
                ", hour12=" + hour12 +
                ", hour13=" + hour13 +
                ", hour14=" + hour14 +
                ", hour15=" + hour15 +
                ", hour16=" + hour16 +
                ", hour17=" + hour17 +
                ", hour18=" + hour18 +
                ", hour19=" + hour19 +
                ", hour20=" + hour20 +
                ", hour21=" + hour21 +
                ", hour22=" + hour22 +
                ", hour23=" + hour23 +
                '}';
    }
}
