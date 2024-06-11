package StringsBufferIOStream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    byte[] bytesSource() {
        return new byte[]{42, 43, 44};
    }
    public static void main(String[] args) {
        ByteArrayInputStreamDemo b = new ByteArrayInputStreamDemo();
        byte[] buffer = b.bytesSource();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data = bais.read();
            while(data != -1) {
                System.out.print(data + " ");//prints: 42 43 44
                data = bais.read();
            }
        } catch (Exception ex)
        { ex.printStackTrace(); }

    }
}
