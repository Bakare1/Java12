package StringsBufferIOStream;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path1 = "demo1" + File.separator;
        String path2 = "demo2" + File.separator;
        String path = path1 + path2;
        File f1 = new File(path + "file1.txt");
        File f2 = new File(path + "file2.txt");
        File dir1 = new File(path1);
        File dir = new File(path);
        dir.mkdirs();
        f1.createNewFile();
        f2.createNewFile();
        System.out.print("\ndir1.list(): ");
        for(String d: dir1.list())
        {
            System.out.print(d + " ");
        }
        System.out.print("\ndir1.listFiles(): ");
        for(File f: dir1.listFiles())
        {
            System.out.print(f + " ");
        }
        System.out.print("\ndir.list(): ");
        for(String d: dir.list())
        {
            System.out.print(d + " ");
        }
        System.out.print("\ndir.listFiles(): ");
        for(File f: dir.listFiles())
        {
            System.out.print(f + " ");
        }
        System.out.print("\nFile.listRoots(): ");
        for(File f: File.listRoots())
        {
            System.out.print(f + " ");
        }

    }
}
