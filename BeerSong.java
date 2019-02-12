
// Calling Ninety_Nine_Bottles_of_Beer
public class Main {
     private class Ninety_Nine_bottles_of_Beer beer = new Ninety_Nine_Bottles_of_Beer
        }



public class Ninety_Nine_Bottles_of_Beer{
    public static void main (String[] args){
        // Starting at 99
        int beerNum = 99;
        String word = "bottles";
        while(beerNum > 0){
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

            //Takes away 1 everytime it does the loop
            beerNum = beerNum - 1;
            if (beerNum == 1){
                word = "bottle";
            }
            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("***************************");
            }else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}