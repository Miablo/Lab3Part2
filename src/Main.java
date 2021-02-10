import java.util.ArrayList;
import java.util.Random;

public class Main {

    static Random rand = new Random();
    static ArrayList<Double> x = new ArrayList();
    static ArrayList<Double> y = new ArrayList();
    static int min = -6; //lets there be a min double for random
    static int max = 6; //lets there be a max double for random
    static int end = -1;
    static Findextremes find = new Findextremes();

    public static void main(String[] args) {
        double a1,b1, a2, b2;
        int i = 0; //for x variable
        int j = 0; //for y variable
        x.add(min + (rand.nextDouble() * (max - min ))); //gets random double between -6 and 6 and adds it as x0
        y.add((min + 1) + (rand.nextDouble() * ((max - 1) - (min + 1)))); //gets random double between -5 and 5 and adds it as y0
        do{
            x.add(find.nextXMath(x.get(i), y.get(j))); // keeps add next x in to x array
            i++;                                        // increase to next x
            y.add(find.nextYMath(x.get(i))); // keeps add next y in to x array
            j++;                                        // increase to next y
            a1 = (double) x.get(i);                     // to check different of x
            b1 = (double) x.get(i - 1);                 // to check different of x
            a2 = (double) y.get(j);                     // to check different of y
            b2 = (double) y.get(j - 1);                 // to check different of y
            if (a1 - b1 <= 0.00001 && a1 - b1 >= - 0.00001) { //checks if sloop is 0 is found
                if(a2 - b2 <= 0.00001 && a2 - b2 >= - 0.00001) { //checks if sloop is 0 is found
                    end = 1;  // finish loop once found
                }
            }else if(i == 1000){  // finish if no min or max is found after 1000 tries
                end = 0;
            }
        }while(end == -1);
        if(end == 1) {  // prints if found
            System.out.println("\t\t\t\t\t\tLocal minimum or maximum at:");
            System.out.print("For X = " + x.get(i) + ", For Y =  " + y.get(j) + ", For Z = " +  find.getZ(x.get(i), y.get(j)) + "\n");
        }else {  // prints if not found
            System.out.print("The equation goes to infinity\n");
        }
    }

}
