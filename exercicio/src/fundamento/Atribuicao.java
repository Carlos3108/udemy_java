package fundamento;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;
        c += b; // c = c + b;
        c -= a; // c = c - a;
        c *= a; // c = c * a;
        c /= a; // c = c / a;
        c %= 2; // c = c % 2; Resultado 0 ou 1 sempre par ou impar; 

        System.out.println(c);
    }
}
