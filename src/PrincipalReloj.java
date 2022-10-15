import java.util.Scanner;

public class PrincipalReloj {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        Reloj t=new Reloj(0, 0, 0);
        Reloj t2=new Reloj();
        int h,m,s;
        t.visualizar();
        t.tic();
        t.visualizar();
        t.tic();
        t.visualizar();
        t.tic();
        t.visualizar();
    }
}
