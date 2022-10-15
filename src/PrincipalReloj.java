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
        System.out.println("------------------------");
        System.out.print("Ingrese la hora=> ");
        h=sx.nextInt();
        System.out.print("Ingrese la minutos=> ");
        m=sx.nextInt();
        System.out.print("Ingrese la segundos=> ");
        s=sx.nextInt();
        t2.ponerALas(h, m, s);
        t2.tic();
        t2.tic();
        t2.visualizar();
    }
}
