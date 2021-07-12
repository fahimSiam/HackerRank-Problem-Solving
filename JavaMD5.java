import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        
            Scanner meaw = new Scanner(System.in);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(meaw.nextLine().getBytes());
            meaw.close();
            System.out.printf("%32x\n", new BigInteger(1, bytes));

        
    }
}