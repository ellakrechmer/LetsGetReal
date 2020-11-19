public class RealTester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(3);
    RealNumber b = new RealNumber(4);
    RealNumber c = new RealNumber(3.0000001);
    RealNumber d = new RealNumber(0);
    RealNumber e = new RealNumber(0);
    RealNumber f = new RealNumber(0.0000001);

    //add tests
    System.out.println("Add Tests:");
    System.out.println(a.add(b)); //7.0
    System.out.println(a.add(d)); //3.0

    //equals tests
    System.out.println("\nEquals Tests:");
    System.out.println(a.equals(b)); //false
    System.out.println(a.equals(c)); //true
    System.out.println(d.equals(e)); //true
    System.out.println(d.equals(f)); //false

    //multiply tests
    System.out.println("\nMultiply Tests:");
    System.out.println(a.multiply(b)); //12.0
    System.out.println(a.multiply(d)); //0.0

    //divide tests
    System.out.println("\nDivide Tests:");
    System.out.println(a.divide(b)); //0.75
    System.out.println(b.divide(a)); //1.3333
    System.out.println(d.divide(a)); //0.0
    System.out.println(a.divide(d)); //undefined-Java returns infinity

    //subtract tests
    System.out.println("\nSubtract Tests:");
    System.out.println(a.subtract(b)); //-1.0
    System.out.println(b.subtract(a)); //1.0
    System.out.println(d.subtract(a)); //-3.0
    System.out.println(a.subtract(d)); //3.0
  }
}
