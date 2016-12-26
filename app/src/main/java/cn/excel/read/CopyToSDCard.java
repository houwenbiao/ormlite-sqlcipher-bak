package cn.excel.read;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by zyj on 2016/12/19.
 */

public class CopyToSDCard {
    private String SDPATH=null;
    public String getSDPATH(){
        return SDPATH;
    }
    public CopyToSDCard(){
        //得到当前外部存储设备的目录
        // SDCARD
        SDPATH= Environment.getExternalStorageDirectory()+"";
        System.out.println("SDPATH="+SDPATH);
    }
    /*
    *在SD卡上创建文件
    */
    public File CreatSDFile(String fileNmae){
        File file =new File(SDPATH+fileNmae);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
    /*
    * 在SD卡上创建目录
    */
    public File creatSDDir(String dirName){
        File dir=new File(SDPATH+dirName);
        if(!dir.exists())
        {
            dir.mkdirs();
        }
        return dir;
    }
    /*
    *判断SD卡上的文件夹是否存在
    */
    public boolean isFileExist(String fileName){
        File file =new File(SDPATH+fileName);
        return file.exists();
    }
    /*
    *将一个InputSteam里面的数据写入到SD卡中
    */
    public File write2SDFromInput(String path,String fileName,InputStream input){
        System.out.println("path="+path+";fileName="+fileName+";");
        File file =null;
        File folder=null;
        OutputStream output=null;
        try {
            folder=creatSDDir(path);
            System.out.println("folder="+folder);
            file=CreatSDFile(path+fileName);
            System.out.println("file="+file);
            output=new FileOutputStream(file);
            byte buffer[]=new byte[4*1024];
            while((input.read())!=-1){
                output.write(buffer);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                output.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return file;
    }
}
