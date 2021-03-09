public class NT{

  /* @param: an integer number n
  @return the sum of n's divisors excluding itself
  */
  public static int sumOfProperDivisors(int n){
    /* to be implemented */
  }
  
  /* @ param: an integer number n
  @return true if the sum of n's proper divisors
  is equal to n
  */
  public static boolean isPerfectNumber(int n){
    /* to be implemented */
  }

  /* main method */
  public static void main(String[] args){

    int n = Integer.parseInt(args[0]);
    if (isPerfectNumber(n)){
      System.out.println("Perfect Number");
    }
    else{
      System.out.println("Not a Perfect Number");
    }

  }
}
