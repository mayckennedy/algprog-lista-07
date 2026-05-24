import java.util.Scanner;

public class ComissaoVendedor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] faixas = new int[9];

        System.out.print("Digite a quantidade de vendedores: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.println("\nVendedor " + (i + 1));

            System.out.print("Digite o valor das vendas brutas: ");
            double vendas = sc.nextDouble();

             double salario = 200 + (vendas * 0.09);

            System.out.println("Salário recebido: $" + salario);
             if (salario >= 1000) {
                faixas[8]++;
            } else {
                int indice = (int) salario / 100 - 2;

                if (indice >= 0 && indice < 8) {
                    faixas[indice]++;
                }
            }
        }
         System.out.println("\nQuantidade de vendedores por faixa salarial:");

        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 em diante: " + faixas[8]);

        sc.close();       

    }
}