package Core;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Java_AES_Cipher {
    private static String CIPHER_NAME = "AES/CBC/PKCS5PADDING";
    private static int CIPHER_KEY_LEN = 16; //128 bits

    /**
     * Encrypt data using AES Cipher (CBC) with 128 bit key
     * 
     * 
     * @param key  - key to use should be 16 bytes long (128 bits)
     * @param iv - initialization vector
     * @param data - data to encrypt
     * @return encryptedData data in base64 encoding with iv attached at end after a :
     */
    public static String encrypt(String key, String iv, String data) {
        try {
            if (key.length() < Java_AES_Cipher.CIPHER_KEY_LEN) {
                int numPad = Java_AES_Cipher.CIPHER_KEY_LEN - key.length();

                for(int i = 0; i < numPad; i++){
                    key += "0"; //0 pad to len 16 bytes
                }

            } else if (key.length() > Java_AES_Cipher.CIPHER_KEY_LEN) {
                key = key.substring(0, CIPHER_KEY_LEN); //truncate to 16 bytes
            }


            IvParameterSpec initVector = new IvParameterSpec(iv.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance(Java_AES_Cipher.CIPHER_NAME);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, initVector);

            byte[] encryptedData = cipher.doFinal((data.getBytes()));

            String base64_EncryptedData = Base64.getEncoder().encodeToString(encryptedData);
            String base64_IV = Base64.getEncoder().encodeToString(iv.getBytes("UTF-8"));

            return base64_EncryptedData + ":" + base64_IV;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * Decrypt data using AES Cipher (CBC) with 128 bit key
     * 
     * @param key - key to use should be 16 bytes long (128 bits)
     * @param data - encrypted data with iv at the end separate by :
     * @return decrypted data string
     */

    public static String decrypt(String key, String data) {
        try {

            String[] parts = data.split(":");
            //System.out.println("decryptedData = "+parts[0]);
           // System.out.println("decryptedData = "+parts[1]);
            //System.out.println("decryptedData = "+Base64.getDecoder().decode(parts[0]));

            IvParameterSpec iv = new IvParameterSpec(Base64.getDecoder().decode(parts[1]));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance(Java_AES_Cipher.CIPHER_NAME);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] decodedEncryptedData = Base64.getDecoder().decode(parts[0]);

            byte[] original = cipher.doFinal(decodedEncryptedData);

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
   
    public static void main(String args[])
    {
    	String key="l2y3Y7qy4Hyq4Q7y";
    	String data1="p8rlCnTqjE0ivQpp8trYhw/ehZgngnvhDACLi2L4DO5owe1xUWP1j1/zrNpky2j3Xgq2yiQZIRuLhOyQroWHzT5SUYBQKS59NSSzVlSeup/bXOOWbUlROi4dOLdALepi4i053lusOuUhvliMtzhz4Q==:bW1tbW1tbW1tbW1tbW1tbQ==";
   	String decryptedData=decrypt(key,data1);
    	System.out.println("decryptedData = "+decryptedData);
		/*
		 * String data=
		 * "{\"fromdate\":\"03\\/06\\/2019\",\"todate\":\"03\\/06\\/2019\",\"rrn\":\"123456789023\",\"remittoraccountno\":\"987654321098765\"}";
		 * String ecryptedData= encrypt(key, "mmmmmmmmmmmmmmmm", data);
		 * System.out.println("ecryptedData = "+ecryptedData);
		 * 
		 * String decryptedData1=decrypt(key,ecryptedData);
		 * System.out.println("decryptedData1 = "+decryptedData1);
		 */
    }
}