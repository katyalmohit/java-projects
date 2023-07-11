import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
// AES - Advanced Encryption Standard
public class aes_encryption{
    private static SecretKeySpec secretkey;
    private static byte[] key;
    public static void setKey(String mykey){
        try{
            key = mykey.getBytes("UTF-8");
            // checksum : Error detection method
            // hash function : It is a function to produce checksum
            // hash value : It is a numeric value of fixed length that uniquely identifies a data
            // messageDigest : It is a fixed size numeric representation of the contents of the message computed by the hash function
            // in java, messageDigest class provides functionality of a message using algorithms such as SHA-1 OR SHA-256 
            // SHA stands for Secure Hashing Algorithm

            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);//original, new length
            secretkey = new SecretKeySpec(key, "AES");

        }catch(NoSuchAlgorithmException e){}
        catch(UnsupportedEncodingException e){}
    }
    public static String encrypt(String strToEnc, String sec){
        try{
            setKey(sec);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretkey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEnc.getBytes("UTF-8")));
        }catch(Exception e){

        }
        return null;
    }
    public static String decrypt(String strToDec, String sec){
        try{
            setKey(sec);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretkey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDec)));
        }catch(Exception e){

        }
        return null;
    }
}