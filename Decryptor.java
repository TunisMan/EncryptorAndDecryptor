import java.util.Scanner;

public class Decryptor {



    // Çözme fonksiyonu: Şi
    // freli mesajı çözerek orijinal haline getirir
    public static String decrypt(String encryptedMessage, int[] key)
    {

        StringBuilder decrypted = new StringBuilder();  // Çözülen mesajı tutmak için StringBuilder


        // Şifrelenmiş mesajdaki her bir karakter üzerinde işlem yapmak için döngü

        for (int i = 0; i < encryptedMessage.length(); i++)
        {

            char c = encryptedMessage.charAt(i);  // Şifreli mesajdaki sıradaki karakteri al
            int shift = key[i % key.length];  // Anahtar dizisinden doğru kaydırma miktarını al


            // Karakterin ASCII değerini kaydırmayı tersine çevirerek geri al
            char decryptedChar = (char) (c - shift);


            // Çözülmüş karakteri oluşturulan çözülen mesaja ekle
            decrypted.append(decryptedChar);

        }

        // Çözülmüş mesajı geri döndür
        return decrypted.toString();

     }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        // Kullanıcıdan şifreli mesajı alıyoruz
        System.out.println("Çözülecek şifreli mesajı girin:");
        String encryptedMessage = scanner.nextLine();  // Kullanıcının girdiği şifreli metni al


        // Çözme işlemi için kullanılacak aynı anahtar dizisi
        int[] key = {3, 5, 7};  // Şifreleme sırasında kullanılan anahtar

        // Çözme işlemini gerçekleştiriyoruz

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Çözülmüş mesaj: " + decryptedMessage);  // Çözülmüş mesajı ekrana yazdır

        scanner.close();  // Scanner'i kapatıyoruz
    }
}