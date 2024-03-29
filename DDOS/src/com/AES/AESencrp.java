package com.AES;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;



/**
 * This class is use for Encryption and Decryption of user information.  
 * @author Renuka Gore
 *
 */

public class AESencrp {
    
     private static final String ALGO = "AES";
    private static final byte[] keyValue = 
        new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't',
'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

public static String encrypt(String Data)   {
	String encryptedValue=null;
	try {
			Key key = generateKey();				//Generating the key for Encryption
			Cipher c = Cipher.getInstance(ALGO);
			c.init(Cipher.ENCRYPT_MODE, key);
			byte[] encVal = c.doFinal(Data.getBytes());
			encryptedValue= new BASE64Encoder().encode(encVal);
			System.out.println("encryptedValue :: "+encryptedValue);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return encryptedValue;
    }

    public static String decrypt(String encryptedData)  {
    	String decryptedValue=null;
    	try {
			Key key = generateKey();				//Generating the key for Encryption
			Cipher c = Cipher.getInstance(ALGO);
			c.init(Cipher.DECRYPT_MODE, key);
			byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
			byte[] decValue = c.doFinal(decordedValue);
			  decryptedValue = new String(decValue);
			System.out.println("decryptedValue :: "+decryptedValue);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return decryptedValue;
    }
    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        System.out.println("key :: "+key.toString());
        return key;
}

    public static void main(String[] args) throws Exception {
    	String str="8R+VABEaEMtxR6vUU3cch0BQp8DYprps923DT0e+caY=";
    	String pwd="GCv6utgKf8jMth7HRzb5nEhw/lFbiofDyxnO0LO/zsw=";
    	if(str.equals("8R+VABEaEMtxR6vUU3cch0BQp8DYprps923DT0e+caY=")){
    		System.out.println("matcn");
    	}
    	if(pwd.equals("POMWr3pOVNXgSTkCs3LJsUhw/lFbiofDyxnO0LO/zsw=")){
    		System.out.println("match1");
    	}
    	
    	System.out.println(decrypt("ClDpSLUv2p0Kh97pEdAaAQ=="));
    	
    	
	}
}