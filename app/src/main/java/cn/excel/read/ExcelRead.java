package cn.excel.read;

import android.content.Context;

import cn.db.test.enity.Table1;
import cn.db.test.enity.Table12;
import cn.db.test.enity.Table14;
import cn.db.test.enity.Table2;
import cn.db.test.enity.Table4;
import cn.db.test.enity.Table5;
import cn.db.test.enity.Table6;

import cn.db.test.enity.Table3;
import cn.db.test.enity.Table8;
import cn.db.test.enity.TableAnyang;
import cn.db.test.enity.TableBalinzuoqi;
import cn.db.test.enity.TableBeijing;
import cn.db.test.enity.TableChengde;
import cn.db.test.enity.TableChifeng;
import cn.db.test.enity.TableDatong;
import cn.db.test.enity.TableFengning;
import cn.db.test.enity.TableHuailai;
import cn.db.test.enity.TableHuhehaote;
import cn.db.test.enity.TableHuimin;
import cn.db.test.enity.TableJiexiu;
import cn.db.test.enity.TableJinan;
import cn.db.test.enity.TableJuxian;
import cn.db.test.enity.TableLaoting;
import cn.db.test.enity.TableLongkou;
import cn.db.test.enity.TableLushi;
import cn.db.test.enity.TableMiyun;
import cn.db.test.enity.TableNanyang;
import cn.db.test.enity.TableRaoyang;
import cn.db.test.enity.TableShangqiu;
import cn.db.test.enity.TableShijiazhuang;
import cn.db.test.enity.TableTaiyuan;
import cn.db.test.enity.TableTianjin;
import cn.db.test.enity.TableWeifang;
import cn.db.test.enity.TableXiAn;
import cn.db.test.enity.TableXilinhaote;
import cn.db.test.enity.TableXingtai;
import cn.db.test.enity.TableXinyang;
import cn.db.test.enity.TableYanzhou;
import cn.db.test.enity.TableYuanping;
import cn.db.test.enity.TableYuncheng;
import cn.db.test.enity.TableYushe;
import cn.db.test.enity.TableZhangbei;
import cn.db.test.enity.TableZhaoyang;
import cn.db.test.enity.TableZhengzhou;
import cn.db.test.enity.TableZhumadian;
import jxl.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
public class ExcelRead {

    /**
     * 处理table1
     *
     * @param context
     * @return
     */
    public static List<Table1> handleTable1(Context context)
    {
        List<Table1> table1List = new ArrayList<Table1>();
        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表1-型号");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table1:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 2; i < rsRows; i++)
            {
                Table1 t1 = new Table1();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                        str = number + "";
                    }


                    switch (j)
                    {
                        case 0:
                            //系列
                            t1.setAirconSeries(str);
                            break;
                        case 1:
                            //型号
                            t1.setAirconType(str);
                            break;
                        case 2:
                            //制冷量/KW
                            t1.setCoolCapacityGB1(number);
                            break;
                        case 3:
                            //制热量/KW
                            t1.setHeatCapacityGB1(number);
                            break;
                        case 4:
                            //制冷消耗功率/KW
                            t1.setCoolPowerGB1(number);
                            break;
                        case 5:
                            //制热消耗功率
                            t1.setHeatPowerGB1(number);
                            break;
                        case 6:
                            //制冷COP
                            t1.setCoolCOPGB1(number);
                            break;
                        case 7:
                            //制热COP
                            t1.setHeatCOPGB1(number);
                            break;
                        case 8:
                            //GB2 制热量
                            t1.setHeatCapacityGB2(str);
                            break;
                        case 9:
                            //制热消耗功率
                            t1.setHeatPowerGB2(str);
                            break;
                        case 10:
                            //制热COP
                            t1.setHeatCOPGB2(str);
                            break;
                        case 11:
                            //IPLVC
                            t1.setIPLVCGB2(str);
                            break;
                        case 12:
                            //IPLVH
                            t1.setIPLVHGB2(str);
                            break;

                        //共有属性
                        case 13:

                            //最大输入功率/KW
                            t1.setHighInputPower(number);
                            break;
                        case 14:
                            //能效等级
                            t1.setEERLevel(str);
                            break;
                        case 15:
                            //电源
                            t1.setPowerSupple(str);
                            break;
                        case 16:
                            //外机尺寸/mm
                            t1.setOutdoorSize(str);
                            break;
                        case 17:
                            //内机尺寸/mm
                            t1.setIndoorSize(str);
                            break;
                        case 18:
                            //外机噪音/dB(A)
                            t1.setOutdoorNoise(str);
                            break;
                        case 19:
                            //内机噪音/dB(A)
                            t1.setIndoorNoise(str);
                            break;
                    }
                }
                table1List.add(t1);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table1List;
    }

    /**
     * 处理table2
     *
     * @param context
     * @return
     */
    public static List<Table2> handleTable2(Context context)
    {
        List<Table2> table2List = new ArrayList<Table2>();
        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表2-范围");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table2:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table2 t2 = new Table2();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    int number = 0;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = (int) nc.getValue();
                    }
                    switch (j)
                    {
                        case 0:
                            //系列
                            t2.setAirconSeries(str);
                            break;
                        case 1:
                            //制冷最低环温
                            t2.setCoolLowEnvirTem(number);
                            break;
                        case 2:
                            //制冷最高环温
                            t2.setCoolHignEnvirTem(number);
                            break;
                        case 3:
                            //制冷最低水温
                            t2.setCoolLowWaterTem(number);
                            break;
                        case 4:
                            //制冷最高水温
                            t2.setCoolHighWaterTem(number);
                            break;
                        case 5:
                            //制热最低环温
                            t2.setHeatLowEnvirTem(number);
                            break;
                        case 6:
                            //制热最高环温
                            t2.setHeatHignEnvirTem(number);
                            break;
                        case 7:
                            //制热最低水温
                            t2.setHeatLowWaterTem(number);
                            break;
                        case 8:
                            //制热最高水温
                            t2.setHeatHighWaterTem(number);
                            break;
                    }
                }
                table2List.add(t2);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table2List;
    }

    /**
     * 处理table3
     *
     * @param context
     * @return
     */
    public static List<Table3> handleTable3(Context context)
    {
        List<Table3> table3List = new ArrayList<Table3>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表3-制热修正系数");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table3:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table3 t3 = new Table3();
                //记录位置是每一行的第二个开始，其余的都是确定的值
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);
                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 0:
                            //机型
                            t3.setAirconType(str);
                            break;
                        case 1:
                            //室外设计干球
                            t3.setHeatDefaultSupplyWater((int)number);
                            break;
                        case 2:
                            //24
                            t3.setTwentyFour(number);
                            break;
                        case 3:
                            //15
                            t3.setFifteen(number);
                            break;
                        case 4:
                            //7
                            t3.setSeven(number);
                            break;
                        case 5:
                            //0
                            t3.setZero(number);
                            break;
                        case 6:
                            //-7
                            t3.setNegativeSeven(number);
                            break;
                        case 7:
                            //-9
                            t3.setNegativeNine(number);
                            break;
                        case 8:
                            //-15
                            t3.setNegativeFifteen(number);
                            break;
                        case 9:
                            //-20
                            t3.setNegativeTwenty(number);
                            break;
                        case 10:
                            //-25
                            t3.setNegativeTwentyFive(number);
                            break;
                        case 11:
                            //-30
                            t3.setNegativeThirty(number);
                            break;
                    }
                }
                table3List.add(t3);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table3List;
    }

    /**
     * 处理table4
     *
     * @param context
     * @return
     */
    public static List<Table4> handleTable4(Context context)
    {
        List<Table4> table4List = new ArrayList<Table4>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表4-COP");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table4:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table4 t4 = new Table4();
                //记录位置是每一行的第二个开始，其余的都是确定的值
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);
                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 0:
                            //机型
                            t4.setAirconType(str);
                            break;
                        case 1:
                            //室外设计干球
                            t4.setHeatDefaultSupplyWater((int)number);
                            break;
                        case 2:
                            //24
                            t4.setTwentyFour(number);
                            break;
                        case 3:
                            //15
                            t4.setFifteen(number);
                            break;
                        case 4:
                            //7
                            t4.setSeven(number);
                            break;
                        case 5:
                            //0
                            t4.setZero(number);
                            break;
                        case 6:
                            //-7
                            t4.setNegativeSeven(number);
                            break;
                        case 7:
                            //-9
                            t4.setNegativeNine(number);
                            break;
                        case 8:
                            //-15
                            t4.setNegativeFifteen(number);
                            break;
                        case 9:
                            //-20
                            t4.setNegativeTwenty(number);
                            break;
                        case 10:
                            //-25
                            t4.setNegativeTwentyFive(number);
                            break;
                        case 11:
                            //-30
                            t4.setNegativeThirty(number);
                            break;
                    }
                }
                table4List.add(t4);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table4List;
    }

    /**
     * 处理table5
     *
     * @param context
     * @return
     */
    public static List<Table5> handleTable5(Context context)
    {
        List<Table5> table5List = new ArrayList<Table5>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表5-末端");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总行数
            int rsRows = readSheet.getRows();

            System.out.println("Table5:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table5 t5 = new Table5();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 0:
                            //末端
                            t5.setEndType(str);
                            break;
                        case 1:
                            //制热默认供水温度
                            t5.setHeatDefaultSupplyWater((int) number);
                            break;
                        case 2:
                            //制热最高供水温度
                            t5.setHeatMaxSupplyWater((int) number);
                        case 3:
                            //制冷默认供水温度
                            t5.setCoolDefaultSupplyWater((int) number);
                        case 4:
                            //制冷最低供水温度
                            t5.setCoolMinSupplyWater((int) number);
                            break;

                    }
                }
                table5List.add(t5);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table5List;
    }

    /**
     * 处理table6
     * <p>
     * 注意此时有一个问题是获取到的开始结束时间不对，有需要用到的地方注意
     *
     * @param context
     * @return
     */
    public static List<Table6> handleTable6(Context context)
    {
        List<Table6> table6List = new ArrayList<Table6>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表6-城市气象 ");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table6:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table6 t6 = new Table6();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }

                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }

                    switch (j)
                    {
                        case 0:
                            //省
                            t6.setProvince(str);
                            break;
                        case 1:
                            //城市
                            t6.setCityName(str);
                            break;
                        case 2:
                            //气象区属
                            t6.setMeteorological(str);
                            break;
                        case 3:
                            //修正系数
                            t6.setFactor(number);
                            break;
                        case 4:
                            //大气压力
                            t6.setAtmoPressure(number);
                            break;
                        case 5:
                            //室外设计干球
                            t6.setOutDryBulbTem(number);
                            break;
                        case 6:
                            //室外设计干球-夏季空调
                            t6.setOutDryBulbTem_Summer(number);
                            break;
                        case 7:
                            //最高环温
                            t6.setHighEnvirTem(number);
                            break;
                        case 8:
                            //最低环温
                            t6.setLowEnvirTem(number);
                            break;
                        case 9:
                            //冬季室外平均风速
                            t6.setWinAveWindSpeed(number);
                            break;
                        case 10:
                            //采暖开始时间
                            t6.setStartDate(str);
                            break;
                        case 11:
                            //采暖结束时间
                            t6.setEndDate(str);
                            break;
                    }
                }
                table6List.add(t6);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table6List;
    }


    /**
     * 处理table8
     * <p>
     *
     * @param context
     * @return
     */
    public static List<Table8> handleTable8(Context context)
    {
        List<Table8> table8List = new ArrayList<Table8>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表8-电价");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table8:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table8 t8 = new Table8();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.00d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }

                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }

                    switch (j)
                    {
                        case 0:
                            //省
                            t8.setProvince(str);
                            break;
                        case 1:
                            //能源类型
                            t8.setEnergyTypes(str);
                            break;
                        case 2:
                            //用电类型
                            t8.setElectricityTypes(str);
                            break;
                        case 3:
                            //费用计算方法
                            t8.setCalculateMethods(str);
                            break;
                        case 4:
                            //峰时段1开始
                            t8.setPeakTime1Start(str);
                            break;
                        case 5:
                            //峰时段1结束
                            t8.setPeakTime1End(str);
                            break;
                        case 6:
                            //峰时段2开始
                            t8.setPeakTime2Start(str);
                            break;
                        case 7:
                            //峰时段2结束
                            t8.setPeakTime2End(str);
                            break;
                        case 8:
                            //谷时段开始
                            t8.setValleyTimeStart(str);
                            break;
                        case 9:
                            //谷时段结束
                            t8.setValleyTimeEnd(str);
                            break;
                        case 10:
                            //平时时段开始
                            t8.setUsualTimeStart(str);
                            break;
                        case 11:
                            //平时时段结束
                            t8.setUsualTimeEnd(str);
                            break;
                        case 12:
                            //第一档
                            t8.setFirstGear(number);
                            break;
                        case 13:
                            //峰时价格1
                            t8.setPeakTimePrice1(number);
                            break;
                        case 14:
                            //谷时价格1
                            t8.setValleyTimePrice1(number);
                            break;
                        case 15:
                            //平时价格1
                            t8.setUsualTimePrice1(number);
                            break;
                        case 16:
                            //第2档
                            t8.setSecondGear(number);
                            break;
                        case 17:
                            //峰时价格2
                            t8.setPeakTimePrice2(number);
                            break;
                        case 18:
                            //谷时价格2
                            t8.setValleyTimePrice2(number);
                            break;
                        case 19:
                            //平时价格2
                            t8.setUsualTimePrice2(number);
                            break;
                        case 20:
                            //第3档
                            t8.setThirdGear(number);
                            break;
                        case 21:
                            //峰时价格3
                            t8.setPeakTimePrice3(number);
                            break;
                        case 22:
                            //谷时价格3
                            t8.setValleyTimePrice3(number);
                            break;
                        case 23:
                            //平时价格3
                            t8.setUsualTimePrice3(number);
                            break;

                    }
                }
                table8List.add(t8);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table8List;
    }

    /**
     * 处理table12
     * <p>
     * 注意此时有一个问题是获取到的开始结束时间不对，有需要用到的地方注意
     *
     * @param context
     * @return
     */
    public static List<Table12> handleTable12(Context context)
    {
        List<Table12> table12List = new ArrayList<Table12>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表12-用户类型");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table12:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table12 t12 = new Table12();
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 0:
                            //用户类型
                            t12.setUserType(str);
                            break;
                        case 1:
                            //时间段
                            t12.setTimeBucket(str);
                            break;
                        case 2:
                            //末端
                            t12.setEndType(str);
                            break;
                        case 3:
                            //0
                            t12.setHour0(number);
                            break;
                        case 4:
                            //0
                            t12.setHour1(number);
                            break;
                        case 5:
                            //0
                            t12.setHour2(number);
                            break;
                        case 6:
                            //0
                            t12.setHour3(number);
                            break;
                        case 7:
                            //0
                            t12.setHour4(number);
                            break;
                        case 8:
                            //0
                            t12.setHour5(number);
                            break;
                        case 9:
                            //0
                            t12.setHour6(number);
                            break;
                        case 10:
                            //0
                            t12.setHour7(number);
                            break;
                        case 11:
                            //0
                            t12.setHour8(number);
                            break;
                        case 12:
                            //0
                            t12.setHour9(number);
                            break;
                        case 13:
                            //0
                            t12.setHour10(number);
                            break;
                        case 14:
                            //0
                            t12.setHour11(number);
                            break;
                        case 15:
                            //0
                            t12.setHour12(number);
                            break;
                        case 16:
                            //0
                            t12.setHour13(number);
                            break;
                        case 17:
                            //0
                            t12.setHour14(number);
                            break;
                        case 18:
                            //0
                            t12.setHour15(number);
                            break;
                        case 19:
                            //0
                            t12.setHour16(number);
                            break;
                        case 20:
                            //0
                            t12.setHour17(number);
                            break;
                        case 21:
                            //0
                            t12.setHour18(number);
                            break;
                        case 22:
                            //0
                            t12.setHour19(number);
                            break;
                        case 23:
                            //0
                            t12.setHour20(number);
                            break;
                        case 24:
                            //0
                            t12.setHour21(number);
                            break;
                        case 25:
                            //0
                            t12.setHour22(number);
                            break;
                        case 26:
                            //0
                            t12.setHour23(number);
                            break;
                    }
                }
                table12List.add(t12);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table12List;
    }

    /**
     * 处理tableAnyang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableAnyang> handleTableAnyang(Context context)
    {
        List<TableAnyang> tableAnyangList = new ArrayList<TableAnyang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("安阳");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableAnyang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableAnyang tAnyang = new TableAnyang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tAnyang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tAnyang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tAnyang.setDrybulbTem(number);
                            break;
                    }
                }
                tableAnyangList.add(tAnyang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableAnyangList;
    }



    /**
     * 处理tableBalinzuoqi
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableBalinzuoqi> handleTableBalinzuoqi(Context context)
    {
        List<TableBalinzuoqi> tableBalinzuoqiList = new ArrayList<TableBalinzuoqi>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("巴林左旗");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableBalinzuoqi:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableBalinzuoqi tBalinzuoqi = new TableBalinzuoqi();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tBalinzuoqi.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tBalinzuoqi.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tBalinzuoqi.setDrybulbTem(number);
                            break;
                    }
                }
                tableBalinzuoqiList.add(tBalinzuoqi);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableBalinzuoqiList;
    }


    /**
     * 处理tableBeijing
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableBeijing> handleTableBeijing(Context context)
    {
        List<TableBeijing> tableBeijingList = new ArrayList<TableBeijing>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("北京");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableBeijing:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableBeijing tBeijing = new TableBeijing();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tBeijing.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tBeijing.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tBeijing.setDrybulbTem(number);
                            break;
                    }
                }
                tableBeijingList.add(tBeijing);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableBeijingList;
    }



    /**
     * 处理tableChengde
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableChengde> handleTableChengde(Context context)
    {
        List<TableChengde> tableChengdeList = new ArrayList<TableChengde>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("承德");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableChengde:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableChengde tChengde = new TableChengde();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tChengde.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tChengde.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tChengde.setDrybulbTem(number);
                            break;
                    }
                }
                tableChengdeList.add(tChengde);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableChengdeList;
    }




    /**
     * 处理tableChifeng
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableChifeng> handleTableChifeng(Context context)
    {
        List<TableChifeng> tableChifengList = new ArrayList<TableChifeng>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("赤峰");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableChifeng:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableChifeng tChifeng = new TableChifeng();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tChifeng.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tChifeng.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tChifeng.setDrybulbTem(number);
                            break;
                    }
                }
                tableChifengList.add(tChifeng);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableChifengList;
    }




    /**
     * 处理tableDatong
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableDatong> handleTableDatong(Context context)
    {
        List<TableDatong> tableDatongList = new ArrayList<TableDatong>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("大同");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableDatong:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableDatong tDatong = new TableDatong();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tDatong.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tDatong.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tDatong.setDrybulbTem(number);
                            break;
                    }
                }
                tableDatongList.add(tDatong);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableDatongList;
    }



    /**
     * 处理tableFengning
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableFengning> handleTableFengning(Context context)
    {
        List<TableFengning> tableFengningList = new ArrayList<TableFengning>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("丰宁");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableFengning:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableFengning tFengning = new TableFengning();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tFengning.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tFengning.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tFengning.setDrybulbTem(number);
                            break;
                    }
                }
                tableFengningList.add(tFengning);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableFengningList;
    }



    /**
     * 处理tableHuailai
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableHuailai> handleTableHuailai(Context context)
    {
        List<TableHuailai> tableHuailaiList = new ArrayList<TableHuailai>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("怀来");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableHuailai:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableHuailai tHuailai = new TableHuailai();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tHuailai.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tHuailai.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tHuailai.setDrybulbTem(number);
                            break;
                    }
                }
                tableHuailaiList.add(tHuailai);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableHuailaiList;
    }



    /**
     * 处理tableHuhehaote
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableHuhehaote> handleTableHuhehaote(Context context)
    {
        List<TableHuhehaote> tableHuhehaoteList = new ArrayList<TableHuhehaote>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("呼和浩特");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableHuhehaote:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableHuhehaote tHuhehaote = new TableHuhehaote();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tHuhehaote.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tHuhehaote.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tHuhehaote.setDrybulbTem(number);
                            break;
                    }
                }
                tableHuhehaoteList.add(tHuhehaote);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableHuhehaoteList;
    }



    /**
     * 处理tableHuimin
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableHuimin> handleTableHuimin(Context context)
    {
        List<TableHuimin> tableHuiminList = new ArrayList<TableHuimin>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("惠民");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableHuimin:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableHuimin tHuimin = new TableHuimin();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tHuimin.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tHuimin.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tHuimin.setDrybulbTem(number);
                            break;
                    }
                }
                tableHuiminList.add(tHuimin);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableHuiminList;
    }



    /**
     * 处理tableJiexiu
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableJiexiu> handleTableJiexiu(Context context)
    {
        List<TableJiexiu> tableJiexiuList = new ArrayList<TableJiexiu>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("介休");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableJiexiu:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableJiexiu tJiexiu = new TableJiexiu();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tJiexiu.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tJiexiu.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tJiexiu.setDrybulbTem(number);
                            break;
                    }
                }
                tableJiexiuList.add(tJiexiu);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableJiexiuList;
    }



    /**
     * 处理tableJinan
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableJinan> handleTableJinan(Context context)
    {
        List<TableJinan> tableJinanList = new ArrayList<TableJinan>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("济南");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableJinan:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableJinan tJinan = new TableJinan();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tJinan.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tJinan.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tJinan.setDrybulbTem(number);
                            break;
                    }
                }
                tableJinanList.add(tJinan);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableJinanList;
    }



    /**
     * 处理tableJuxian
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableJuxian> handleTableJuxian(Context context)
    {
        List<TableJuxian> tableJuxianList = new ArrayList<TableJuxian>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("莒县");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableJuxian:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableJuxian tJuxian = new TableJuxian();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tJuxian.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tJuxian.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tJuxian.setDrybulbTem(number);
                            break;
                    }
                }
                tableJuxianList.add(tJuxian);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableJuxianList;
    }



    /**
     * 处理tableLaoting
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableLaoting> handleTableLaoting(Context context)
    {
        List<TableLaoting> tableLaotingList = new ArrayList<TableLaoting>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("乐亭");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableLaoting:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableLaoting tLaoting = new TableLaoting();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tLaoting.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tLaoting.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tLaoting.setDrybulbTem(number);
                            break;
                    }
                }
                tableLaotingList.add(tLaoting);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableLaotingList;
    }



    /**
     * 处理tableLongkou
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableLongkou> handleTableLongkou(Context context)
    {
        List<TableLongkou> tableLongkouList = new ArrayList<TableLongkou>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("龙口");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableLongkou:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableLongkou tLongkou = new TableLongkou();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tLongkou.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tLongkou.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tLongkou.setDrybulbTem(number);
                            break;
                    }
                }
                tableLongkouList.add(tLongkou);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableLongkouList;
    }



    /**
     * 处理tableLushi
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableLushi> handleTableLushi(Context context)
    {
        List<TableLushi> tableLushiList = new ArrayList<TableLushi>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("卢氏");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableLushi:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableLushi tLushi = new TableLushi();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tLushi.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tLushi.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tLushi.setDrybulbTem(number);
                            break;
                    }
                }
                tableLushiList.add(tLushi);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableLushiList;
    }



    /**
     * 处理tableNanyang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableNanyang> handleTableNanyang(Context context)
    {
        List<TableNanyang> tableNanyangList = new ArrayList<TableNanyang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("南阳");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableNanyang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableNanyang tNanyang = new TableNanyang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tNanyang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tNanyang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tNanyang.setDrybulbTem(number);
                            break;
                    }
                }
                tableNanyangList.add(tNanyang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableNanyangList;
    }



    /**
     * 处理tableRaoyang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableRaoyang> handleTableRaoyang(Context context)
    {
        List<TableRaoyang> tableRaoyangList = new ArrayList<TableRaoyang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("饶阳");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableRaoyang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableRaoyang tRaoyang = new TableRaoyang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tRaoyang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tRaoyang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tRaoyang.setDrybulbTem(number);
                            break;
                    }
                }
                tableRaoyangList.add(tRaoyang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableRaoyangList;
    }



    /**
     * 处理tableShangqiu
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableShangqiu> handleTableShangqiu(Context context)
    {
        List<TableShangqiu> tableShangqiuList = new ArrayList<TableShangqiu>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("商丘");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableShangqiu:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableShangqiu tShangqiu = new TableShangqiu();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tShangqiu.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tShangqiu.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tShangqiu.setDrybulbTem(number);
                            break;
                    }
                }
                tableShangqiuList.add(tShangqiu);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableShangqiuList;
    }



    /**
     * 处理tableTaiyuan
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableTaiyuan> handleTableTaiyuan(Context context)
    {
        List<TableTaiyuan> tableTaiyuanList = new ArrayList<TableTaiyuan>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("太原");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableTaiyuan:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableTaiyuan tTaiyuan = new TableTaiyuan();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tTaiyuan.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tTaiyuan.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tTaiyuan.setDrybulbTem(number);
                            break;
                    }
                }
                tableTaiyuanList.add(tTaiyuan);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableTaiyuanList;
    }



    /**
     * 处理tableWeifang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableWeifang> handleTableWeifang(Context context)
    {
        List<TableWeifang> tableWeifangList = new ArrayList<TableWeifang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("潍坊");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableWeifang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableWeifang tWeifang = new TableWeifang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tWeifang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tWeifang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tWeifang.setDrybulbTem(number);
                            break;
                    }
                }
                tableWeifangList.add(tWeifang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableWeifangList;
    }



    /**
     * 处理tableXiAn
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableXiAn> handleTableXiAn(Context context)
    {
        List<TableXiAn> tableXiAnList = new ArrayList<TableXiAn>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("西安");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableXiAn:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableXiAn tXiAn = new TableXiAn();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tXiAn.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tXiAn.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tXiAn.setDrybulbTem(number);
                            break;
                    }
                }
                tableXiAnList.add(tXiAn);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableXiAnList;
    }



    /**
     * 处理tableXilinhaote
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableXilinhaote> handleTableXilinhaote(Context context)
    {
        List<TableXilinhaote> tableXilinhaoteList = new ArrayList<TableXilinhaote>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("锡林浩特");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableXilinhaote:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableXilinhaote tXilinhaote = new TableXilinhaote();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tXilinhaote.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tXilinhaote.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tXilinhaote.setDrybulbTem(number);
                            break;
                    }
                }
                tableXilinhaoteList.add(tXilinhaote);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableXilinhaoteList;
    }



    /**
     * 处理tableXingtai
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableXingtai> handleTableXingtai(Context context)
    {
        List<TableXingtai> tableXingtaiList = new ArrayList<TableXingtai>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("邢台");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableXingtai:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableXingtai tXingtai = new TableXingtai();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tXingtai.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tXingtai.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tXingtai.setDrybulbTem(number);
                            break;
                    }
                }
                tableXingtaiList.add(tXingtai);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableXingtaiList;
    }



    /**
     * 处理tableXinyang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableXinyang> handleTableXinyang(Context context)
    {
        List<TableXinyang> tableXinyangList = new ArrayList<TableXinyang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("信阳");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableXinyang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableXinyang tXinyang = new TableXinyang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tXinyang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tXinyang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tXinyang.setDrybulbTem(number);
                            break;
                    }
                }
                tableXinyangList.add(tXinyang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableXinyangList;
    }



    /**
     * 处理tableYanzhou
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableYanzhou> handleTableYanzhou(Context context)
    {
        List<TableYanzhou> tableYanzhouList = new ArrayList<TableYanzhou>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("兖州");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableYanzhou:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableYanzhou tYanzhou = new TableYanzhou();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tYanzhou.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tYanzhou.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tYanzhou.setDrybulbTem(number);
                            break;
                    }
                }
                tableYanzhouList.add(tYanzhou);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableYanzhouList;
    }



    /**
     * 处理tableYuanping
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableYuanping> handleTableYuanping(Context context)
    {
        List<TableYuanping> tableYuanpingList = new ArrayList<TableYuanping>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("原平");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableYuanping:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableYuanping tYuanping = new TableYuanping();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tYuanping.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tYuanping.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tYuanping.setDrybulbTem(number);
                            break;
                    }
                }
                tableYuanpingList.add(tYuanping);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableYuanpingList;
    }



    /**
     * 处理tableYuncheng
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableYuncheng> handleTableYuncheng(Context context)
    {
        List<TableYuncheng> tableYunchengList = new ArrayList<TableYuncheng>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("运城");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableYuncheng:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableYuncheng tYuncheng = new TableYuncheng();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tYuncheng.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tYuncheng.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tYuncheng.setDrybulbTem(number);
                            break;
                    }
                }
                tableYunchengList.add(tYuncheng);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableYunchengList;
    }



    /**
     * 处理tableYushe
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableYushe> handleTableYushe(Context context)
    {
        List<TableYushe> tableYusheList = new ArrayList<TableYushe>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("榆社");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableYushe:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableYushe tYushe = new TableYushe();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tYushe.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tYushe.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tYushe.setDrybulbTem(number);
                            break;
                    }
                }
                tableYusheList.add(tYushe);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableYusheList;
    }



    /**
     * 处理tableZhangbei
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableZhangbei> handleTableZhangbei(Context context)
    {
        List<TableZhangbei> tableZhangbeiList = new ArrayList<TableZhangbei>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("张北");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableZhangbei:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableZhangbei tZhangbei = new TableZhangbei();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tZhangbei.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tZhangbei.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tZhangbei.setDrybulbTem(number);
                            break;
                    }
                }
                tableZhangbeiList.add(tZhangbei);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableZhangbeiList;
    }



    /**
     * 处理tableZhaoyang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableZhaoyang> handleTableZhaoyang(Context context)
    {
        List<TableZhaoyang> tableZhaoyangList = new ArrayList<TableZhaoyang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("朝阳");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableZhaoyang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableZhaoyang tZhaoyang = new TableZhaoyang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tZhaoyang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tZhaoyang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tZhaoyang.setDrybulbTem(number);
                            break;
                    }
                }
                tableZhaoyangList.add(tZhaoyang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableZhaoyangList;
    }


    /**
     * 处理tableZhengzhou
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableZhengzhou> handleTableZhengzhou(Context context)
    {
        List<TableZhengzhou> tableZhengzhouList = new ArrayList<TableZhengzhou>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("郑州");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableZhengzhou:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableZhengzhou tZhengzhou = new TableZhengzhou();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tZhengzhou.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tZhengzhou.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tZhengzhou.setDrybulbTem(number);
                            break;
                    }
                }
                tableZhengzhouList.add(tZhengzhou);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableZhengzhouList;
    }


    /**
     * 处理tableZhumadian
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableZhumadian> handleTableZhumadian(Context context)
    {
        List<TableZhumadian> tableZhumadianList = new ArrayList<TableZhumadian>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("驻马店");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableZhumadian:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableZhumadian tZhumadian = new TableZhumadian();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tZhumadian.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tZhumadian.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tZhumadian.setDrybulbTem(number);
                            break;
                    }
                }
                tableZhumadianList.add(tZhumadian);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableZhumadianList;
    }


    /**
     * 处理tableShijiazhuang
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableShijiazhuang> handleTableShijiazhuang(Context context)
    {
        List<TableShijiazhuang> tableShijiazhuangList = new ArrayList<TableShijiazhuang>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("石家庄");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableShijiazhuang:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableShijiazhuang tShijiazhuang = new TableShijiazhuang();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tShijiazhuang.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tShijiazhuang.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tShijiazhuang.setDrybulbTem(number);
                            break;
                    }
                }
                tableShijiazhuangList.add(tShijiazhuang);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableShijiazhuangList;
    }

    /**
     * 处理tableTianjin
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableTianjin> handleTableTianjin(Context context)
    {
        List<TableTianjin> tableTianjinList = new ArrayList<TableTianjin>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("天津");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableTianjin:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableTianjin tTianjin = new TableTianjin();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tTianjin.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tTianjin.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tTianjin.setDrybulbTem(number);
                            break;
                    }
                }
                tableTianjinList.add(tTianjin);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableTianjinList;
    }

    /**
     * 处理tableMiyun
     * <p>
     * 日期、时刻、干球温度
     *
     * @param context
     * @return
     */
    public static List<TableMiyun> handleTableMiyun(Context context)
    {
        List<TableMiyun> tableMiyunList = new ArrayList<TableMiyun>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("密云");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("TableMiyun:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                TableMiyun tMiyun = new TableMiyun();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //日期
                            tMiyun.setDate(str);
                            break;
                        case 2:
                            //时刻
                            tMiyun.setHour(number);
                            break;
                        case 3:
                            //干球温度
                            tMiyun.setDrybulbTem(number);
                            break;
                    }
                }
                tableMiyunList.add(tMiyun);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return tableMiyunList;
    }

    /**
     * 处理table14
     * <p>
     * 房间类型，冷负荷指标默认，冷负荷指标下限等
     *
     * @param context
     * @return
     */
    public static List<Table14> handleTable14(Context context)
    {
        List<Table14> table14List = new ArrayList<Table14>();


        jxl.Workbook readwb = null;

        //构建Workbook对象, 只读Workbook对象
        //直接从本地文件创建Workbook

        InputStream instream = null;
        try
        {
            instream = context.getAssets().open("data.xls");;
            readwb = Workbook.getWorkbook(instream);

            //Sheet的下标是从0开始的
            //获取第一张sheet表
            Sheet readSheet = readwb.getSheet("表14-建筑冷热指标");
            //获取Sheet表中所包含的总列数
            int rsColumns = readSheet.getColumns();
            //获取Sheet表中所包含的总列数
            int rsRows = readSheet.getRows();

            System.out.println("Table14:" + rsColumns + "____" + rsRows);
            //获取指定单元格的引用
            for (int i = 1; i < rsRows; i++)
            {
                Table14 t14 = new Table14();
                for (int j = 1; j < rsColumns; j++)
                {
                    Cell cell = readSheet.getCell(j, i);

                    String str = "";
                    Date date = new Date();
                    double number = 0.0d;
                    if (cell.getType() == CellType.LABEL)
                    {
                        LabelCell nc = (LabelCell) cell;
                        str = nc.getString();
                    }
                    if (cell.getType() == CellType.DATE)
                    {
                        DateCell nc = (DateCell) cell;
                        date = nc.getDate();
                    }

                    if (cell.getType() == CellType.NUMBER)
                    {
                        NumberCell nc = (NumberCell) cell;
                        number = nc.getValue();
                    }
                    switch (j)
                    {
                        case 1:
                            //房间类型
                            t14.setRoomType(str);
                            break;
                        case 2:
                            //冷负荷指标默认
                            t14.setCoolLoadIndex_default(number);
                            break;
                        case 3:
                            //冷负荷指标下限
                            t14.setCoolLoadIndex_min(number);
                            break;
                        case 4:
                            //冷负荷指标上限
                            t14.setCoolLoadIndex_max(number);
                            break;
                        case 5:
                            //热负荷指标默认
                            t14.setHeatLoadIndex_default(number);
                            break;
                        case 6:
                            //热负荷指标下限
                            t14.setHeatLoadIndex_min(number);
                            break;
                        case 7:
                            //热负荷指标上限
                            t14.setHeatLoadIndex_max(number);
                            break;
                    }
                }
                table14List.add(t14);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return table14List;
    }

}
