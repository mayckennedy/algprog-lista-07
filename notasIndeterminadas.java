import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class notasIndeterminadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList <>();

        double nota;

        while (true) {
            System.out.println("Digite -1 para sair ");
            System.out.println("Digite uma nota:");
             nota = sc.nextDouble();
            
             if (nota == -1){
                break;
             }

             notas.add(nota);
        }

        if(notas.size()==0){
             System.out.println("Nenhuma nota foi informada.");

        }else{
            double soma = 0;
            int acimaMedia = 0;
            int abaixoSete = 0;

            for (double n : notas) {
                soma += n;
            }
             double media = soma / notas.size();

             for(double n : notas){
                if(n > media ){
                    acimaMedia ++;
                }

                if(n < media){
                    abaixoSete ++;
                }

             }
              System.out.println("\nQuantidade de valores lidos: " + notas.size());

                System.out.println("\nValores na ordem informada:");

                for (double n : notas) {
                System.out.print(n + " ");
            }
              System.out.println("\n\nValores na ordem inversa:");

            for (int i = notas.size() - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }
             System.out.println("\nSoma dos valores: " + soma);
             System.out.println("Média dos valores: " + media);
             System.out.println("Quantidade acima da média: " + acimaMedia);
             System.out.println("Quantidade abaixo de 7: " + abaixoSete);
             System.out.println("\nPrograma encerrado com sucesso.");

        }
        sc.close();
     

    }
}
