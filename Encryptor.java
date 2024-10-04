import java.util.Scanner;

public class Encryptor {



    // Şifreleme fonksiyonu: Mesajı belirtilen anahtar ile şifreler

    public static String encrypt(String message, int[] key)
    {


        StringBuilder encrypted = new StringBuilder();  // Şifreli mesajı oluşturmak için StringBuilder kullanıyoruz.


        // Mesajdaki her bir karakter üzerinde işlem yapmak için döngü

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);  // Mesajdaki sıradaki karakteri al
            int shift = key[i % key.length];  // Anahtar dizisinden doğru kaydırma miktarını seç


            // Karakterin ASCII değerini kaydırarak yeni şifreli karakteri bul

            char encryptedChar = (char) (c + shift);

            // Şifrelenmiş karakteri oluşturulan şifreli mesaja ekle
            encrypted.append(encryptedChar);

        }

        // Şifrelenmiş mesajı geri döndür
        return encrypted.toString();

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Kullanıcıdan şifrelenecek mesajı alıyoruz
        System.out.println("Şifrelenecek mesajı girin:");
        String message = scanner.nextLine();  // Kullanıcının girdiği metni al


        // Kaydırma işlemi için kullanılacak anahtar dizisi
        int[] key = {3, 5, 7};  // Şifreleme için her karakteri bu miktarda kaydıracağız


        // Şifreleme işlemini gerçekleştiriyoruz
        String encryptedMessage = encrypt(message, key);
        System.out.println("Şifrelenmiş mesaj: " + encryptedMessage);  // Şifrelenmiş mesajı ekrana yazdır

        
        scanner.close();  // Scanner'i kapatıyoruz
    }
}