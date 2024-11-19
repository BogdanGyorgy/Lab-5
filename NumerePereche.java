package exercitiul1;

public class NumerePereche {
    private int a ;
    private int b ;

    public NumerePereche(){}
    public NumerePereche(int a , int b)
    {
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;

    }

    public void setB(int b) {
        this.b = b;
    }

    @Override

    public String toString() {
        return "Primul Numar = " + a + ", Al doilea Numar = " + b;
    }

    public boolean suntConsecutiveFibonacci() {
        return (a == 0 && b == 1) || (a == 1 && b == 1) ||
                (a == 1 && b == 2) || (a == 2 && b == 3) ||
                (a == 3 && b == 5) || (a == 5 && b== 8) ||
                (a == 8 && b == 13);
    }

    public int cmmmc()
{
    int gcdValue = gcd(a, b);
    return Math.abs(a * b) / gcdValue;
}


    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public boolean sumaCifre()
    {
        return sumaCifre(a) == sumaCifre(b);
    }

    public int sumaCifre(int x) {
        int suma = 0;
        while (x!= 0) {
            suma =suma+ x % 10;
            x /= 10;
        }
        return suma;
    }
    public boolean cifrePare()
    {
        return numereCifrePare(a) == numereCifrePare(b);
    }

    private int numereCifrePare(int x) {
        int count = 0;
        while (x != 0) {
            if ((x % 10) % 2 == 0) {
                count++;
            }
            x /= 10;
        }
        return count;
    }
}

