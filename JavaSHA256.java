import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}