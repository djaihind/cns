import java.util.*;
import javax.crypto.*;
class BF{
        public static void main(String args[])
        {
                try{
                        KeyGenerator kg=KeyGenerator.getInstance("BlowFish");
                        SecretKey skey = kg.generateKey();
                        Cipher c=Cipher.getInstance("BlowFish");
                        c.init(Cipher.ENCRYPT_MODE,skey);
                        byte[] txt = "hi".getBytes();
                        byte[] ntxt = c.doFinal(txt);
                        System.out.println(new String(ntxt));
                        c.init(Cipher.DECRYPT_MODE, skey);
                }
                catch(Exception e)
                {
                  System.out.println("Error "+e+" occured");
                }
        }
}
