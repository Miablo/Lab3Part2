/**
 * formula to find min and max
 * @author Cody Walker, Mio Diaz
 * @version 1.0
 */

public class Findextremes {
    double x;
    double y;

    /**
     *
     * @return math for first derivative of x with current x and y
     */
    private double firstDerivativeX(){
        return (4*(Math.pow(this.x, 3)) - this.y -1.0);
    }

    /**
     *
     * @return math for second derivative of x with current x and y
     */
    private double secondDerivativeX(){
        return (12 * (Math.pow(this.x, 2)));
    }

    /**
     *
     * @return math for first derivative of Y with current x and y
     */
    private double firstDerivativeY(){
        return ((12 * (Math.pow(this.y, 5))) - this.x);
    }

    /**
     *
     * @return math for second derivative of Y with current x and y
     */
    private double secondDerivativeY(){
        return (60 * (Math.pow(this.y, 4)));
    }

    /**
     *
     * @param x = Xn
     * @param y = Yn
     * @return next X or Xn+1
     */
    public double nextXMath(double x, double y){
        this.x = x;
        this.y = y;
        return(this.x - (firstDerivativeX() / secondDerivativeX()));
    }

    /**
     *
     * @param x = next Xn+1 for Yn
     * @return next Y or Yn+1
     */
    public double nextYMath(double x){
        this.x = x;
        return (this.y - (firstDerivativeY() / secondDerivativeY()));
    }

    /**
     *
     * @param x last found Xn where max or min found
     * @param y last found Yn where max or min found
     * @return the Z for the the Xn an Yn using equation given
     */
    public double getZ(double x, double y){
        return (Math.pow(x, 4)+ (2 * Math.pow(y, 6)) - (x * y) - x + 2);
    }

}
