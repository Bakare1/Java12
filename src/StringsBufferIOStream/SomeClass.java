package StringsBufferIOStream;

import java.io.*;

public class SomeClass implements Serializable {
    private int field1 = 42;
    private String field2 = "abc";

    public static void main(String[] args) {
        String fileName = "someClass.bin";
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            SomeClass obj = new SomeClass();
            objectOutputStream.writeObject(obj);
            SomeClass objRead = (SomeClass) objectInputStream.readObject();
            System.out.println(objRead.field1); //prints: 42
            System.out.println(objRead.field2); //prints: abc
        } catch (Exception ex){
            ex.printStackTrace();
        }

        }
}
