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
        return (-this.x - 12 * (Math.pow(this.y, 5)));
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
    /*
    (5 pts) Apply the Newton-Raphson's method xn+1 = xn – f '(xn) / f ''(xn) to develop a function double findMinMax(…)
    that returns a solution that is either a minimum value or a maximum value for z.
    The program finds a local minimum or a local maximum when the difference between the new solution and
    the previous one is smaller than 0.00001 within 10000 iterations. Otherwise, it shows Infinity as output.

    Let function z = x4+2y6 – xy – x + 2. Show the post-conditions for z.
    The preconditions for x and y are shown as below. Feel free to choose an arbitrary initial guess values x0 and
    y0 that meet the following precondition.

    |x| ≤ 6 and |y| ≤ 5
     */
}
