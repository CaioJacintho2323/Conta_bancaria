import domain.Conta;
import domain.ContaJuridica;
import domain.Contafisica;

import java.io.*;


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

        File file = new File("contas.txt");
        try(FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Conta conta : contas) {
                bw.write(conta.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String linha;
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }





    }
}