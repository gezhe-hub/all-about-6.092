public class GravityCalculator 
{
  public static void main(String[] args)
  {
    double gravity=-9.81;
    double initialvelocity=0.0;
    double fallingtime=10.0;
    double initialposition=0.0;
    double finalposition=0.0;

    finalposition=0.5*gravity*fallingtime*fallingtime+initialvelocity*fallingtime+initialposition;
    System.out.println("The object's position after"+fallingtime+"second is"+finalposition+"m.");
  }
}
