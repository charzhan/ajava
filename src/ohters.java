import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.DataInput;
import java.io.File;
import java.util.Date;

public class ohters{
    @Test
    public void test1(){
        new fiel1().pow();

    }
}
class fiel1{

    public void fw(){
        File file = new File("c://newfile");
        System.out.println(file.getAbsoluteFile());
        System.out.println("------------------------");
        File file1 = new File("2.exe");
        System.out.println(file1.getAbsolutePath());
        System.out.println("------------------------");
        File file2 = new File(file, "32.exps");
        System.out.println(file2.getAbsolutePath());
    }
    public void fq(){
        File file = new File("g:/1.zip");
        //判断文件是否存在
        System.out.println("判断文件是否存在--"+file.exists());
        System.out.println("------------------------");
        //是否是文件夹

        System.out.println("是否是文件夹---"+file.isDirectory());

        System.out.println("------------------------");
        System.out.println("是否是文件"+file.isFile());
        System.out.println("------------------------");
        System.out.println(file.length());
        long s=file.lastModified();
        Date date = new Date(s);
        System.out.println(date);
        file.setLastModified(0);
        File file1 = new File("23.zip");

        System.out.println(file.renameTo(file1));

    }
    public void pow(){
        File file = new File("g:/ftp/Config/1.pol");
        System.out.println(file.isDirectory());
        java.lang.String[] strings ;
       // strings=file.list();
       // for (java.lang.String s:strings
       //      ) {
       //     System.out.println(s);

      //  }
        System.out.println(file.getParent());
        File file1 = new File("");
        file1=file.getParentFile();
        System.out.println("----------");
        System.out.println(file1);
        file.mkdir();
        file.mkdirs();
    }

}
