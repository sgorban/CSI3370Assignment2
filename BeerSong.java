public class Main {
    Ninety_Nine_bottles_of_Beer
        }



public class Ninety_Nine_Bottles_of_Beer{

    static String bottles(int n) {
        return MessageFormat.format("{0,choice,0#No more bottles|1#One bottle|2#{0} bottles} of beer", n);
    }

    public static void main(String[] args) {
        String bottles = bottles(99);
        for (int n = 99; n > 0; ) {
            System.out.println(bottles + " on the wall");
            System.out.println(bottles);
            System.out.println("Take one down, pass it around");
            bottles = bottles(--n);
            System.out.println(bottles + " on the wall");
            System.out.println();
        }
    }
}