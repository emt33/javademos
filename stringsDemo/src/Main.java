import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "    Bugün hava çok güzel.     ";
        System.out.println(mesaj);


      /*  System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa True döndürür başlamıyorsa False döndürür.
        System.out.println(mesaj.endsWith(".")); //. ile btiyorsa true bitmiyorsa false döner
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); // mesajda a ayı arar ilk a ı bulunca bitirir.
        System.out.println(mesaj.lastIndexOf("e"));*/
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5)); // 2 dahil 5 dahil değil

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}