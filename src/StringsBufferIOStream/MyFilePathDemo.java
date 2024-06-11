package StringsBufferIOStream;

import org.apache.commons.lang3.StringUtils;

import java.io.File;


public class MyFilePathDemo {
    public static void main(String[] args) {
        String path = "demo1" + File.separator + "demo2" + File.separator;
        String fileName = "FileName.txt";
        File f = new File(path + fileName);
        try
        {
            new File(path).mkdirs();
            f.createNewFile();
            f.delete();
            path = StringUtils.substringBeforeLast(path, File.separator);
            while (new File(path).delete())
            {
                path = StringUtils.substringBeforeLast(path, File.separator);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
