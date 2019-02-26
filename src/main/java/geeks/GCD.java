package geeks;
public class GCD {

    int a = 4;
    int b = 9;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GCD gcd = new GCD();
        System.out.println(gcd.findGcd(gcd.a, gcd.b));

    }

    public int findGcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGcd(b, a % b);
    }
}
