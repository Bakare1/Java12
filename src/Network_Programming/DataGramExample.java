package Network_Programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DataGramExample {
    public static void main(String[] args) {
        System.out.println("================ UDP Server Connection ===================");
        Scanner sc = new Scanner(System.in);
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte buf[] = null;
            while (true) {
                System.out.println("Server Side :");
                String inp = sc.nextLine();
                buf = inp.getBytes();
                DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
                ds.send(DpSend);
                if (inp.equals("bye"))
                    break;
            }

        } catch (Exception e) {
            System.out.println("Exception Arised:"+e.getMessage());
        }
    }
}
