public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }


    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

//main zoop "just for", 5 çağırır çağırı biter .
//main: clink(2*2) yani clink(4) çağırır.
//clink: "It's " yazar ve zoop("breakfast", 4) çağırır (2. çağrı).
//main:
//args: (boş dizi)

//bizz: 5
//buzz: 2
//clink:
//fork: 4
//zoop:
//fred: "breakfast"
//bob: 4

     //Çıktı:
    //just for
    //any not more 
    //It's breakfast
    //!
