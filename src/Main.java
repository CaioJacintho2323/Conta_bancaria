import domain.Conta;
import domain.ContaJuridica;
import domain.Contafisica;


public class Main {
    public static void main(String[] args)  {
        Conta c = new Contafisica("Caio", 123, 500);
        System.out.println(c);

        System.out.println(c.sacar(100));
        System.out.println(c.depositar(100));
        c.verificarSaldo();

        System.out.println("------------------");

        Conta c2 = new ContaJuridica("Paulo", 234, 1000);
        System.out.println(c2);

        System.out.println(c2.sacar(200));
        System.out.println(c2.depositar(200));
        c2.verificarSaldo();

        System.out.println("-------------------");
        System.out.println("Contas atualizadas");
        Conta[] contas = {c, c2};

        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i]);
        }





    }
}