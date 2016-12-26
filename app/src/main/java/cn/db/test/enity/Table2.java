package cn.db.test.enity;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Administrator on 2016/8/17.
 * @author godmeir
 * table2的实体
 *
 * 内容：
 *      各种系列的内机的最低最高可使用环境温度和最低最高水温
 *
 */
@DatabaseTable(tableName = "table2")
public class Table2 {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(canBeNull = false,columnName = "airconSeries")
    private String airconSeries;
    @DatabaseField(canBeNull = false)
    private int coolLowEnvirTem;
    @DatabaseField(canBeNull = false)
    private int coolHignEnvirTem;
    @DatabaseField(canBeNull = false)
    private int coolLowWaterTem;
    @DatabaseField(canBeNull = false)
    private int coolHighWaterTem;

    @DatabaseField(canBeNull = false)
    private int heatLowEnvirTem;
    @DatabaseField(canBeNull = false)
    private int heatHignEnvirTem;
    @DatabaseField(canBeNull = false)
    private int heatLowWaterTem;
    @DatabaseField(canBeNull = false)
    private int heatHighWaterTem;

    public Table2(){

    }

    public Table2(String airconSeries,
                  int coolLowEnvirTem, int coolHignEnvirTem,
                  int coolLowWaterTem, int coolHighWaterTem,
                  int heatLowEnvirTem, int heatHignEnvirTem,
                  int heatLowWaterTem, int heatHighWaterTem) {
        this.airconSeries = airconSeries;
        this.coolLowEnvirTem = coolLowEnvirTem;
        this.coolHignEnvirTem = coolHignEnvirTem;
        this.coolLowWaterTem = coolLowWaterTem;
        this.coolHighWaterTem = coolHighWaterTem;
        this.heatLowEnvirTem = heatLowEnvirTem;
        this.heatHignEnvirTem = heatHignEnvirTem;
        this.heatLowWaterTem = heatLowWaterTem;
        this.heatHighWaterTem = heatHighWaterTem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirconSeries() {
        return airconSeries;
    }

    public void setAirconSeries(String airconSeries) {
        this.airconSeries = airconSeries;
    }

    public int getCoolLowEnvirTem() {
        return coolLowEnvirTem;
    }

    public void setCoolLowEnvirTem(int coolLowEnvirTem) {
        this.coolLowEnvirTem = coolLowEnvirTem;
    }

    public int getCoolHignEnvirTem() {
        return coolHignEnvirTem;
    }

    public void setCoolHignEnvirTem(int coolHignEnvirTem) {
        this.coolHignEnvirTem = coolHignEnvirTem;
    }

    public int getCoolLowWaterTem() {
        return coolLowWaterTem;
    }

    public void setCoolLowWaterTem(int coolLowWaterTem) {
        this.coolLowWaterTem = coolLowWaterTem;
    }

    public int getCoolHighWaterTem() {
        return coolHighWaterTem;
    }

    public void setCoolHighWaterTem(int coolHighWaterTem) {
        this.coolHighWaterTem = coolHighWaterTem;
    }

    public int getHeatLowEnvirTem() {
        return heatLowEnvirTem;
    }

    public void setHeatLowEnvirTem(int heatLowEnvirTem) {
        this.heatLowEnvirTem = heatLowEnvirTem;
    }

    public int getHeatHignEnvirTem() {
        return heatHignEnvirTem;
    }

    public void setHeatHignEnvirTem(int heatHignEnvirTem) {
        this.heatHignEnvirTem = heatHignEnvirTem;
    }

    public int getHeatLowWaterTem() {
        return heatLowWaterTem;
    }

    public void setHeatLowWaterTem(int heatLowWaterTem) {
        this.heatLowWaterTem = heatLowWaterTem;
    }

    public int getHeatHighWaterTem() {
        return heatHighWaterTem;
    }

    public void setHeatHighWaterTem(int heatHighWaterTem) {
        this.heatHighWaterTem = heatHighWaterTem;
    }

    @Override
    public String toString() {
        return "Table2{" +
                "id=" + id +
                ", airconSeries='" + airconSeries + '\'' +
                ", coolLowEnvirTem=" + coolLowEnvirTem +
                ", coolHignEnvirTem=" + coolHignEnvirTem +
                ", coolLowWaterTem=" + coolLowWaterTem +
                ", coolHighWaterTem=" + coolHighWaterTem +
                ", heatLowEnvirTem=" + heatLowEnvirTem +
                ", heatHignEnvirTem=" + heatHignEnvirTem +
                ", heatLowWaterTem=" + heatLowWaterTem +
                ", heatHighWaterTem=" + heatHighWaterTem +
                '}';
    }
}
