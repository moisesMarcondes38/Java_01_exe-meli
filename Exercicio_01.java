import java.util.Scanner;

public class Exercicio_01 {

    public static void main (String [] args){
        double salario, abono, novoSalario;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor do salário: ");
        salario = leia.nextDouble();
        System.out.print ("Digite o valor do abono: ");
        abono = leia.nextDouble ();

        novoSalario = salario + abono;

        System.out.println("\n Seu novo salario e de : " + (novoSalario));
    }

}
