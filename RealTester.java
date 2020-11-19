public class RealTester{
  public static void main(String[] args){
    //RealNumber
    RealNumber a = new RealNumber(3);
    RealNumber b = new RealNumber(4);
    RealNumber c = new RealNumber(3.0000001);
    RealNumber d = new RealNumber(0);
    RealNumber e = new RealNumber(0);
    RealNumber f = new RealNumber(0.0000001);

    System.out.println("RealNumber Tests");
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

    //RationalNumber
    RationalNumber g = new RationalNumber(1,2);
    RationalNumber h = new RationalNumber(2,4);
    RationalNumber j = new RationalNumber(3,5);
    RationalNumber k = new RationalNumber(0,4);
    RationalNumber l = new RationalNumber(4,0);
    RationalNumber m = new RationalNumber(5,4);
    RationalNumber n = new RationalNumber(1,2);

    System.out.println("RationalNumber Tests");
    //getValue tests
    System.out.println("getValue Tests:");
    System.out.println(g.getValue()); //0.5
    System.out.println(h.getValue()); //0.5
    System.out.println(j.getValue()); //0.6
    System.out.println(k.getValue()); //0.0
    System.out.println(l.getValue()); //0.0
    System.out.println(m.getValue()); //1.25
    //getNumerator and getDenominator tests
    System.out.println("\ngetNumerator and getDenominator Tests:");
    System.out.println(g.getNumerator()); //1
    System.out.println(g.getDenominator()); //2
    System.out.println(h.getNumerator()); //2
    System.out.println(h.getDenominator()); //4
    System.out.println(l.getNumerator()); //0
    System.out.println(l.getDenominator()); //1
    //reciprocal tests
    System.out.println("\nReciprocal Tests:");
    System.out.println(g.reciprocal()); //2/1
    System.out.println(h.reciprocal()); //4/2
    System.out.println(j.reciprocal()); //5/3
    System.out.println(k.reciprocal()); //0/1
    System.out.println(l.reciprocal()); //0/1
    System.out.println(m.reciprocal()); //4/5
    //equals tests
    System.out.println("\nEquals Tests:");
    System.out.println(g.equals(h)); //false
    System.out.println(g.equals(n)); //true
    System.out.println(j.equals(m)); //false
  }
}
