package informationSecurityProgramms;

import javax.crypto.Cipher;
import java.util.Base64;
import java.security.*;

public class RSAEncryption {

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024); // Simplified key size
        return keyGen.generateKeyPair();
    }

    public static String encrypt(String message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
            KeyPair keyPair = generateKeyPair();
            String originalMessage = "Hello, RSA!";

            String encryptedMessage = encrypt(originalMessage, keyPair.getPublic());
            System.out.println("Encrypted Message: " + encryptedMessage);

            String decryptedMessage = decrypt(encryptedMessage, keyPair.getPrivate());
            System.out.println("Decrypted Message: " + decryptedMessage);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
