
package Cryptography;

public class CaesarCipher2 {
    protected char[] encoder = new char[95];
    protected char[] decoder = new char[95];

    public CaesarCipher2(int rotation) {
        for (int k=0; k < 95; k++) {
            encoder[k] = (char) (' ' + (k + rotation) % 95);
            decoder[k]=(char) (' ' + (k - rotation + 95) % 95);
        }
    }
    public String encrypt(String message) {
        return transform(message, encoder);
    }
    public String decrypt(String secret) {
        return transform(secret, decoder);
    }
    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray();
        for (int k=0; k < msg.length; k++){
            int j = msg[k] - ' ';
            msg[k] = code[j];
        }                
        return new String(msg);
    }
    public static void main(String[] args) {
        CaesarCipher2 cipher2 = new CaesarCipher2(3);
        System.out.println("Encryption code = " + new String(cipher2.encoder));
        System.out.println("Decryption code = " + new String(cipher2.decoder));
        String message = "Qwerty8796";
        String coded = cipher2.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = cipher2.decrypt(coded);
        System.out.println("Message: " + answer);
        
    }
}
