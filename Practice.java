import java.util.*;


public class Practice {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String in = sc.next();
        String s = "12.323.36.54";
        IpAddress ip = new IpAddress(s);
        System.out.println(ip.validIp());
        //sc.close();
    }
}
