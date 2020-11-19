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
  }
}
