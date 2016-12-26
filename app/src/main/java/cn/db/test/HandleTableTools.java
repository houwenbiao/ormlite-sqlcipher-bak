package cn.db.test;

import android.content.Context;
import android.util.Log;

import java.util.List;

import cn.db.test.dao.Table12Dao;
import cn.db.test.dao.Table14Dao;
import cn.db.test.dao.Table1Dao;
import cn.db.test.dao.Table2Dao;
import cn.db.test.dao.Table3Dao;
import cn.db.test.dao.Table4Dao;
import cn.db.test.dao.Table5Dao;
import cn.db.test.dao.Table6Dao;
import cn.db.test.dao.Table8Dao;
import cn.db.test.dao.TableAnyangDao;
import cn.db.test.dao.TableBalinzuoqiDao;
import cn.db.test.dao.TableBeijingDao;
import cn.db.test.dao.TableChengdeDao;
import cn.db.test.dao.TableChifengDao;
import cn.db.test.dao.TableDatongDao;
import cn.db.test.dao.TableFengningDao;
import cn.db.test.dao.TableHuailaiDao;
import cn.db.test.dao.TableHuhehaoteDao;
import cn.db.test.dao.TableHuiminDao;
import cn.db.test.dao.TableJiexiuDao;
import cn.db.test.dao.TableJinanDao;
import cn.db.test.dao.TableJuxianDao;
import cn.db.test.dao.TableLaotingDao;
import cn.db.test.dao.TableLongkouDao;
import cn.db.test.dao.TableLushiDao;
import cn.db.test.dao.TableMiyunDao;
import cn.db.test.dao.TableNanyangDao;
import cn.db.test.dao.TableRaoyangDao;
import cn.db.test.dao.TableShangqiuDao;
import cn.db.test.dao.TableShijiazhuangDao;
import cn.db.test.dao.TableTaiyuanDao;
import cn.db.test.dao.TableTianjinDao;
import cn.db.test.dao.TableWeifangDao;
import cn.db.test.dao.TableXiAnDao;
import cn.db.test.dao.TableXilinhaoteDao;
import cn.db.test.dao.TableXingtaiDao;
import cn.db.test.dao.TableXinyangDao;
import cn.db.test.dao.TableYanzhouDao;
import cn.db.test.dao.TableYuanpingDao;
import cn.db.test.dao.TableYunchengDao;
import cn.db.test.dao.TableYusheDao;
import cn.db.test.dao.TableZhangbeiDao;
import cn.db.test.dao.TableZhaoyangDao;
import cn.db.test.dao.TableZhengzhouDao;
import cn.db.test.dao.TableZhumadianDao;
import cn.db.test.enity.Table1;
import cn.db.test.enity.Table12;
import cn.db.test.enity.Table14;
import cn.db.test.enity.Table2;
import cn.db.test.enity.Table3;
import cn.db.test.enity.Table4;
import cn.db.test.enity.Table5;
import cn.db.test.enity.Table6;
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
import cn.excel.read.ExcelRead;

/**
 * Created by Administrator on 2016/12/16.
 * <p>
 * 为加密的数据库添加数据的工具类
 */
public class HandleTableTools
{

    public static void addData(Context context)
    {

        addTable1(context);
        addTable2(context);
        addTable3(context);
        addTable4(context);
        addTable5(context);
        addTable6(context);
        addTable8(context);
        addTable12(context);
        addTable14(context);
       addTableAnyang(context);

        addTableBalinzuoqi(context);
        addTableBeijing(context);
        addTableChengde(context);
        addTableChifeng(context);
        addTableDatong(context);
        addTableFengning(context);
        addTableHuailai(context);
        addTableHuhehaote(context);
        addTableHuimin(context);
        addTableJiexiu(context);

        addTableJinan(context);
        addTableJuxian(context);
        addTableLaoting(context);
        addTableLongkou(context);
        addTableLushi(context);
        addTableMiyun(context);
        addTableNanyang(context);
        addTableRaoyang(context);
        addTableShangqiu(context);
        addTableShijiazhuang(context);

        addTableTaiyuan(context);
        addTableTianjin(context);
        addTableWeifang(context);
        addTableXiAn(context);
        addTableXilinhaote(context);
        addTableXingtai(context);
        addTableXinyang(context);
        addTableYanzhou(context);
        addTableYuanping(context);
        addTableYuncheng(context);

        addTableYushe(context);
        addTableZhangbei(context);
        addTableZhaoyang(context);
        addTableZhengzhou(context);
        addTableZhumadian(context);

    }

    /**
     * 添加表1
     *
     * @param in
     */
    public static void addTable1(Context in)
    {
        Log.e("a=======d=======d", "开始添加T1！");
        List<Table1> table1List;
        table1List = ExcelRead.handleTable1(in);
        for(Table1 t1 : table1List)
        {
            Table1Dao.getInstance().addOrUpdate(t1);
        }
        Log.e("a=======d=======d", "完成添加T1！");
    }

    /**
     * 添加表2
     *
     * @param in
     */
    public static void addTable2(Context in)
    {
        Log.e("a=======d=======d", "开始添加T2！");
        List<Table2> table2List;
        table2List = ExcelRead.handleTable2(in);
        for(Table2 t2 : table2List)
        {
            Table2Dao.getInstance().addOrUpdate(t2);
        }
        Log.e("a=======d=======d", "完成添加T2！");
    }

    /**
     * 添加表3
     *
     * @param in
     */
    public static void addTable3(Context in)
    {
        Log.e("a=======d=======d", "开始添加T3！");
        List<Table3> table3List;
        table3List = ExcelRead.handleTable3(in);
        for(Table3 t3 : table3List)
        {
            Table3Dao.getInstance().addOrUpdate(t3);
        }
        Log.e("a=======d=======d", "完成添加T3！");
    }

    /**
     * 添加表4
     *
     * @param in
     */
    public static void addTable4(Context in)
    {
        Log.e("a=======d=======d", "开始添加T4！");
        List<Table4> table4List;
        table4List = ExcelRead.handleTable4(in);
        for(Table4 t4 : table4List)
        {
            Table4Dao.getInstance().addOrUpdate(t4);
        }
        Log.e("a=======d=======d", "完成添加T4！");
    }

    /**
     * 添加表5
     *
     * @param in
     */
    public static void addTable5(Context in)
    {
        Log.e("a=======d=======d", "开始添加T5！");
        List<Table5> table5List;
        table5List = ExcelRead.handleTable5(in);
        for(Table5 t5 : table5List)
        {
            Table5Dao.getInstance().addOrUpdate(t5);
        }
        Log.e("a=======d=======d", "完成添加T5！");
    }

    /**
     * 添加表6
     *
     * @param in
     */
    public static void addTable6(Context in)
    {
        Log.e("a=======d=======d", "开始添加T6！");
        List<Table6> table6List;
        table6List = ExcelRead.handleTable6(in);
        for(Table6 t6 : table6List)
        {
            Table6Dao.getInstance().addOrUpdate(t6);
        }
        Log.e("a=======d=======d", "完成添加T6！");
    }

    /**
     * 添加表8
     *
     * @param in
     */
    public static void addTable8(Context in)
    {
        Log.e("a=======d=======d", "开始添加T8！");
        List<Table8> table8List;
        table8List = ExcelRead.handleTable8(in);
        for(Table8 t8 : table8List)
        {
            Table8Dao.getInstance().addOrUpdate(t8);
        }
        Log.e("a=======d=======d", "完成添加T8！");
    }

    /**
     * 添加表12
     *
     * @param in
     */
    public static void addTable12(Context in)
    {
        Log.e("a=======d=======d", "开始添加T12！");
        List<Table12> table12List;
        table12List = ExcelRead.handleTable12(in);
        for(Table12 t12 : table12List)
        {
            Table12Dao.getInstance().addOrUpdate(t12);
        }
        Log.e("a=======d=======d", "完成添加T12！");
    }

    /**
     * 添加表14
     *
     * @param in
     */
    public static void addTable14(Context in)
    {
        Log.e("a=======d=======d", "开始添加T14！");
        List<Table14> table14List;
        table14List = ExcelRead.handleTable14(in);
        for(Table14 t14 : table14List)
        {
            Table14Dao.getInstance().addOrUpdate(t14);
        }
        Log.e("a=======d=======d", "完成添加T14！");
    }

    /**
     * 添加表Anyang
     *
     * @param in
     */
    public static void addTableAnyang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TAnyang！");
        List<TableAnyang> tableAnyangList;
        tableAnyangList = ExcelRead.handleTableAnyang(in);
        for(TableAnyang tAnyang : tableAnyangList)
        {
            TableAnyangDao.getInstance().addOrUpdate(tAnyang);
        }
        Log.e("a=======d=======d", "完成添加TAnyang！");
    }

    /**
     * 添加表Balinzuoqi
     *
     * @param in
     */
    public static void addTableBalinzuoqi(Context in)
    {
        Log.e("a=======d=======d", "开始添加TBalinzuoqi！");
        List<TableBalinzuoqi> tableBalinzuoqiList;
        tableBalinzuoqiList = ExcelRead.handleTableBalinzuoqi(in);
        for(TableBalinzuoqi tBalinzuoqi : tableBalinzuoqiList)
        {
            TableBalinzuoqiDao.getInstance().addOrUpdate(tBalinzuoqi);
        }
        Log.e("a=======d=======d", "完成添加TBalinzuoqi！");
    }

    /**
     * 添加表Beijing
     *
     * @param in
     */
    public static void addTableBeijing(Context in)
    {
        Log.e("a=======d=======d", "开始添加TBeijing！");
        List<TableBeijing> tableBeijingList;
        tableBeijingList = ExcelRead.handleTableBeijing(in);
        for(TableBeijing tBeijing : tableBeijingList)
        {
            TableBeijingDao.getInstance().addOrUpdate(tBeijing);
        }
        Log.e("a=======d=======d", "完成添加TBeijing！");
    }

    /**
     * 添加表Chengde
     *
     * @param in
     */
    public static void addTableChengde(Context in)
    {
        Log.e("a=======d=======d", "开始添加TChengde！");
        List<TableChengde> tableChengdeList;
        tableChengdeList = ExcelRead.handleTableChengde(in);
        for(TableChengde tChengde : tableChengdeList)
        {
            TableChengdeDao.getInstance().addOrUpdate(tChengde);
        }
        Log.e("a=======d=======d", "完成添加TChengde！");
    }

    /**
     * 添加表Chifeng
     *
     * @param in
     */
    public static void addTableChifeng(Context in)
    {
        Log.e("a=======d=======d", "开始添加TChifeng！");
        List<TableChifeng> tableChifengList;
        tableChifengList = ExcelRead.handleTableChifeng(in);
        for(TableChifeng tChifeng : tableChifengList)
        {
            TableChifengDao.getInstance().addOrUpdate(tChifeng);
        }
        Log.e("a=======d=======d", "完成添加TChifeng！");
    }

    /**
     * 添加表Datong
     *
     * @param in
     */
    public static void addTableDatong(Context in)
    {
        Log.e("a=======d=======d", "开始添加TDatong！");
        List<TableDatong> tableDatongList;
        tableDatongList = ExcelRead.handleTableDatong(in);
        for(TableDatong tDatong : tableDatongList)
        {
            TableDatongDao.getInstance().addOrUpdate(tDatong);
        }
        Log.e("a=======d=======d", "完成添加TDatong！");
    }

    /**
     * 添加表Fengning
     *
     * @param in
     */
    public static void addTableFengning(Context in)
    {
        Log.e("a=======d=======d", "开始添加TFengning！");
        List<TableFengning> tableFengningList;
        tableFengningList = ExcelRead.handleTableFengning(in);
        for(TableFengning tFengning : tableFengningList)
        {
            TableFengningDao.getInstance().addOrUpdate(tFengning);
        }
        Log.e("a=======d=======d", "完成添加TFengning！");
    }

    /**
     * 添加表Huailai
     *
     * @param in
     */
    public static void addTableHuailai(Context in)
    {
        Log.e("a=======d=======d", "开始添加THuailai！");
        List<TableHuailai> tableHuailaiList;
        tableHuailaiList = ExcelRead.handleTableHuailai(in);
        for(TableHuailai tHuailai : tableHuailaiList)
        {
            TableHuailaiDao.getInstance().addOrUpdate(tHuailai);
        }
        Log.e("a=======d=======d", "完成添加THuailai！");
    }

    /**
     * 添加表Huhehaote
     *
     * @param in
     */
    public static void addTableHuhehaote(Context in)
    {
        Log.e("a=======d=======d", "开始添加THuhehaote！");
        List<TableHuhehaote> tableHuhehaoteList;
        tableHuhehaoteList = ExcelRead.handleTableHuhehaote(in);
        for(TableHuhehaote tHuhehaote : tableHuhehaoteList)
        {
            TableHuhehaoteDao.getInstance().addOrUpdate(tHuhehaote);
        }
        Log.e("a=======d=======d", "完成添加THuhehaote！");
    }

    /**
     * 添加表Huimin
     *
     * @param in
     */
    public static void addTableHuimin(Context in)
    {
        Log.e("a=======d=======d", "开始添加THuimin！");
        List<TableHuimin> tableHuiminList;
        tableHuiminList = ExcelRead.handleTableHuimin(in);
        for(TableHuimin tHuimin : tableHuiminList)
        {
            TableHuiminDao.getInstance().addOrUpdate(tHuimin);
        }
        Log.e("a=======d=======d", "完成添加THuimin！");
    }

    /**
     * 添加表Jiexiu
     *
     * @param in
     */
    public static void addTableJiexiu(Context in)
    {
        Log.e("a=======d=======d", "开始添加TJiexiu！");
        List<TableJiexiu> tableJiexiuList;
        tableJiexiuList = ExcelRead.handleTableJiexiu(in);
        for(TableJiexiu tJiexiu : tableJiexiuList)
        {
            TableJiexiuDao.getInstance().addOrUpdate(tJiexiu);
        }
        Log.e("a=======d=======d", "完成添加TJiexiu！");
    }

    /**
     * 添加表Jinan
     *
     * @param in
     */
    public static void addTableJinan(Context in)
    {
        Log.e("a=======d=======d", "开始添加TJinan！");
        List<TableJinan> tableJinanList;
        tableJinanList = ExcelRead.handleTableJinan(in);
        for(TableJinan tJinan : tableJinanList)
        {
            TableJinanDao.getInstance().addOrUpdate(tJinan);
        }
        Log.e("a=======d=======d", "完成添加TJinan！");
    }

    /**
     * 添加表Juxian
     *
     * @param in
     */
    public static void addTableJuxian(Context in)
    {
        Log.e("a=======d=======d", "开始添加TJuxian！");
        List<TableJuxian> tableJuxianList;
        tableJuxianList = ExcelRead.handleTableJuxian(in);
        for(TableJuxian tJuxian : tableJuxianList)
        {
            TableJuxianDao.getInstance().addOrUpdate(tJuxian);
        }
        Log.e("a=======d=======d", "完成添加TJuxian！");
    }

    /**
     * 添加表Laoting
     *
     * @param in
     */
    public static void addTableLaoting(Context in)
    {
        Log.e("a=======d=======d", "开始添加TLaoting！");
        List<TableLaoting> tableLaotingList;
        tableLaotingList = ExcelRead.handleTableLaoting(in);
        for(TableLaoting tLaoting : tableLaotingList)
        {
            TableLaotingDao.getInstance().addOrUpdate(tLaoting);
        }
        Log.e("a=======d=======d", "完成添加TLaoting！");
    }

    /**
     * 添加表Longkou
     *
     * @param in
     */
    public static void addTableLongkou(Context in)
    {
        Log.e("a=======d=======d", "开始添加TLongkou！");
        List<TableLongkou> tableLongkouList;
        tableLongkouList = ExcelRead.handleTableLongkou(in);
        for(TableLongkou tLongkou : tableLongkouList)
        {
            TableLongkouDao.getInstance().addOrUpdate(tLongkou);
        }
        Log.e("a=======d=======d", "完成添加TLongkou！");
    }

    /**
     * 添加表Lushi
     *
     * @param in
     */
    public static void addTableLushi(Context in)
    {
        Log.e("a=======d=======d", "开始添加TLushi！");
        List<TableLushi> tableLushiList;
        tableLushiList = ExcelRead.handleTableLushi(in);
        for(TableLushi tLushi : tableLushiList)
        {
            TableLushiDao.getInstance().addOrUpdate(tLushi);
        }
        Log.e("a=======d=======d", "完成添加TLushi！");
    }

    /**
     * 添加表Miyun
     *
     * @param in
     */
    public static void addTableMiyun(Context in)
    {
        Log.e("a=======d=======d", "开始添加TMiyun！");
        List<TableMiyun> tableMiyunList;
        tableMiyunList = ExcelRead.handleTableMiyun(in);
        for(TableMiyun tMiyun : tableMiyunList)
        {
            TableMiyunDao.getInstance().addOrUpdate(tMiyun);
        }
        Log.e("a=======d=======d", "完成添加TMiyun！");
    }

    /**
     * 添加表Nanyang
     *
     * @param in
     */
    public static void addTableNanyang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TNanyang！");
        List<TableNanyang> tableNanyangList;
        tableNanyangList = ExcelRead.handleTableNanyang(in);
        for(TableNanyang tNanyang : tableNanyangList)
        {
            TableNanyangDao.getInstance().addOrUpdate(tNanyang);
        }
        Log.e("a=======d=======d", "完成添加TNanyang！");
    }

    /**
     * 添加表Raoyang
     *
     * @param in
     */
    public static void addTableRaoyang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TRaoyang！");
        List<TableRaoyang> tableRaoyangList;
        tableRaoyangList = ExcelRead.handleTableRaoyang(in);
        for(TableRaoyang tRaoyang : tableRaoyangList)
        {
            TableRaoyangDao.getInstance().addOrUpdate(tRaoyang);
        }
        Log.e("a=======d=======d", "完成添加TRaoyang！");
    }

    /**
     * 添加表Shangqiu
     *
     * @param in
     */
    public static void addTableShangqiu(Context in)
    {
        Log.e("a=======d=======d", "开始添加TShangqiu！");
        List<TableShangqiu> tableShangqiuList;
        tableShangqiuList = ExcelRead.handleTableShangqiu(in);
        for(TableShangqiu tShangqiu : tableShangqiuList)
        {
            TableShangqiuDao.getInstance().addOrUpdate(tShangqiu);
        }
        Log.e("a=======d=======d", "完成添加TShangqiu！");
    }

    /**
     * 添加表Shijiazhuang
     *
     * @param in
     */
    public static void addTableShijiazhuang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TShijiazhuang！");
        List<TableShijiazhuang> tableShijiazhuangList;
        tableShijiazhuangList = ExcelRead.handleTableShijiazhuang(in);
        for(TableShijiazhuang tShijiazhuang : tableShijiazhuangList)
        {
            TableShijiazhuangDao.getInstance().addOrUpdate(tShijiazhuang);
        }
        Log.e("a=======d=======d", "完成添加TShijiazhuang！");
    }

    /**
     * 添加表Taiyuan
     *
     * @param in
     */
    public static void addTableTaiyuan(Context in)
    {
        Log.e("a=======d=======d", "开始添加TTaiyuan！");
        List<TableTaiyuan> tableTaiyuanList;
        tableTaiyuanList = ExcelRead.handleTableTaiyuan(in);
        for(TableTaiyuan tTaiyuan : tableTaiyuanList)
        {
            TableTaiyuanDao.getInstance().addOrUpdate(tTaiyuan);
        }
        Log.e("a=======d=======d", "完成添加TTaiyuan！");
    }

    /**
     * 添加表Tianjin
     *
     * @param in
     */
    public static void addTableTianjin(Context in)
    {
        Log.e("a=======d=======d", "开始添加TTianjin！");
        List<TableTianjin> tableTianjinList;
        tableTianjinList = ExcelRead.handleTableTianjin(in);
        for(TableTianjin tTianjin : tableTianjinList)
        {
            TableTianjinDao.getInstance().addOrUpdate(tTianjin);
        }
        Log.e("a=======d=======d", "完成添加TTianjin！");
    }

    /**
     * 添加表Weifang
     *
     * @param in
     */
    public static void addTableWeifang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TWeifang！");
        List<TableWeifang> tableWeifangList;
        tableWeifangList = ExcelRead.handleTableWeifang(in);
        for(TableWeifang tWeifang : tableWeifangList)
        {
            TableWeifangDao.getInstance().addOrUpdate(tWeifang);
        }
        Log.e("a=======d=======d", "完成添加TWeifang！");
    }

    /**
     * 添加表XiAn
     *
     * @param in
     */
    public static void addTableXiAn(Context in)
    {
        Log.e("a=======d=======d", "开始添加TXiAn！");
        List<TableXiAn> tableXiAnList;
        tableXiAnList = ExcelRead.handleTableXiAn(in);
        for(TableXiAn tXiAn : tableXiAnList)
        {
            TableXiAnDao.getInstance().addOrUpdate(tXiAn);
        }
        Log.e("a=======d=======d", "完成添加TXiAn！");
    }

    /**
     * 添加表Xilinhaote
     *
     * @param in
     */
    public static void addTableXilinhaote(Context in)
    {
        Log.e("a=======d=======d", "开始添加TXilinhaote！");
        List<TableXilinhaote> tableXilinhaoteList;
        tableXilinhaoteList = ExcelRead.handleTableXilinhaote(in);
        for(TableXilinhaote tXilinhaote : tableXilinhaoteList)
        {
            TableXilinhaoteDao.getInstance().addOrUpdate(tXilinhaote);
        }
        Log.e("a=======d=======d", "完成添加TXilinhaote！");
    }

    /**
     * 添加表Xingtai
     *
     * @param in
     */
    public static void addTableXingtai(Context in)
    {
        Log.e("a=======d=======d", "开始添加TXingtai！");
        List<TableXingtai> tableXingtaiList;
        tableXingtaiList = ExcelRead.handleTableXingtai(in);
        for(TableXingtai tXingtai : tableXingtaiList)
        {
            TableXingtaiDao.getInstance().addOrUpdate(tXingtai);
        }
        Log.e("a=======d=======d", "完成添加TXingtai！");
    }

    /**
     * 添加表Xinyang
     *
     * @param in
     */
    public static void addTableXinyang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TXinyang！");
        List<TableXinyang> tableXinyangList;
        tableXinyangList = ExcelRead.handleTableXinyang(in);
        for(TableXinyang tXinyang : tableXinyangList)
        {
            TableXinyangDao.getInstance().addOrUpdate(tXinyang);
        }
        Log.e("a=======d=======d", "完成添加TXinyang！");
    }

    /**
     * 添加表Yanzhou
     *
     * @param in
     */
    public static void addTableYanzhou(Context in)
    {
        Log.e("a=======d=======d", "开始添加TYanzhou！");
        List<TableYanzhou> tableYanzhouList;
        tableYanzhouList = ExcelRead.handleTableYanzhou(in);
        for(TableYanzhou tYanzhou : tableYanzhouList)
        {
            TableYanzhouDao.getInstance().addOrUpdate(tYanzhou);
        }
        Log.e("a=======d=======d", "完成添加TYanzhou！");
    }

    /**
     * 添加表Yuanping
     *
     * @param in
     */
    public static void addTableYuanping(Context in)
    {
        Log.e("a=======d=======d", "开始添加TYuanping！");
        List<TableYuanping> tableYuanpingList;
        tableYuanpingList = ExcelRead.handleTableYuanping(in);
        for(TableYuanping tYuanping : tableYuanpingList)
        {
            TableYuanpingDao.getInstance().addOrUpdate(tYuanping);
        }
        Log.e("a=======d=======d", "完成添加TYuanping！");
    }

    /**
     * 添加表Yuncheng
     *
     * @param in
     */
    public static void addTableYuncheng(Context in)
    {
        Log.e("a=======d=======d", "开始添加TYuncheng！");
        List<TableYuncheng> tableYunchengList;
        tableYunchengList = ExcelRead.handleTableYuncheng(in);
        for(TableYuncheng tYuncheng : tableYunchengList)
        {
            TableYunchengDao.getInstance().addOrUpdate(tYuncheng);
        }
        Log.e("a=======d=======d", "完成添加TYuncheng！");
    }

    /**
     * 添加表Yushe
     *
     * @param in
     */
    public static void addTableYushe(Context in)
    {
        Log.e("a=======d=======d", "开始添加TYushe！");
        List<TableYushe> tableYusheList;
        tableYusheList = ExcelRead.handleTableYushe(in);
        for(TableYushe tYushe : tableYusheList)
        {
            TableYusheDao.getInstance().addOrUpdate(tYushe);
        }
        Log.e("a=======d=======d", "完成添加TYushe！");
    }

    /**
     * 添加表Zhangbei
     *
     * @param in
     */
    public static void addTableZhangbei(Context in)
    {
        Log.e("a=======d=======d", "开始添加TZhangbei！");
        List<TableZhangbei> tableZhangbeiList;
        tableZhangbeiList = ExcelRead.handleTableZhangbei(in);
        for(TableZhangbei tZhangbei : tableZhangbeiList)
        {
            TableZhangbeiDao.getInstance().addOrUpdate(tZhangbei);
        }
        Log.e("a=======d=======d", "完成添加TZhangbei！");
    }

    /**
     * 添加表Zhaoyang
     *
     * @param in
     */
    public static void addTableZhaoyang(Context in)
    {
        Log.e("a=======d=======d", "开始添加TZhaoyang！");
        List<TableZhaoyang> tableZhaoyangList;
        tableZhaoyangList = ExcelRead.handleTableZhaoyang(in);
        for(TableZhaoyang tZhaoyang : tableZhaoyangList)
        {
            TableZhaoyangDao.getInstance().addOrUpdate(tZhaoyang);
        }
        Log.e("a=======d=======d", "完成添加TZhaoyang！");
    }

    /**
     * 添加表Zhengzhou
     *
     * @param in
     */
    public static void addTableZhengzhou(Context in)
    {
        Log.e("a=======d=======d", "开始添加TZhengzhou！");
        List<TableZhengzhou> tableZhengzhouList;
        tableZhengzhouList = ExcelRead.handleTableZhengzhou(in);
        for(TableZhengzhou tZhengzhou : tableZhengzhouList)
        {
            TableZhengzhouDao.getInstance().addOrUpdate(tZhengzhou);
        }
        Log.e("a=======d=======d", "完成添加TZhengzhou！");
    }

    /**
     * 添加表Zhumadian
     *
     * @param in
     */
    public static void addTableZhumadian(Context in)
    {
        Log.e("a=======d=======d", "开始添加TZhumadian！");
        List<TableZhumadian> tableZhumadianList;
        tableZhumadianList = ExcelRead.handleTableZhumadian(in);
        for(TableZhumadian tZhumadian : tableZhumadianList)
        {
            TableZhumadianDao.getInstance().addOrUpdate(tZhumadian);
        }
        Log.e("a=======d=======d", "完成添加TZhumadian！");
    }
}
