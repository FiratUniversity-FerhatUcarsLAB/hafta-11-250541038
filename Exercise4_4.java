public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
        //1. Soru:
        //Java'da bu hata vermez. Metot çalışır,
        //işini yapar, dönen değer hafızada bir yere atanmadığı için kaybolur.

        //2. Soru:
        //Java derleme hatası (compile-time error) verir.
        //Çünkü void metotlar bir değer üretmez,
        //dolayısıyla matematiksel veya mantıksal bir işleme sokulamazlar.
    
    }
}
