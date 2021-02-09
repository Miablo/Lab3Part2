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
            x.add(find.nextXMath(x.get(i), y.get(j)));
            i++;
            y.add(find.nextYMath(x.get(i)));
            j++;
            a1 = (double) x.get(i);
            b1 = (double) x.get(i - 1);
            a2 = (double) y.get(j);
            b2 = (double) y.get(j - 1);
            if (a1 <= b1 + 0.00001 && a1 >= b1 - 0.00001) { //checks if root is found
                if(a2 <= b2 + 0.00001 && a2 >= b2 - 0.00001) {
                    end = 0;
                }
            }else if(i == 1001){
                end = 0;
            }
        }while(end != 0);
        System.out.print(x.get(i) + y.get(j));
        System.out.print("end");
    }

}
