import java.util.Scanner;

public class MediaAnual {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[12];

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double soma = 0;
        double media;

        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();

            soma += temperaturas[i];
        }

        
        media = soma / 12;

        System.out.println("\nMédia anual: " + media);

        // Mostrar temperaturas acima da média
        System.out.println("\nMeses com temperatura acima da média:");

        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > media) {
                System.out.println(meses[i] + " -> " + temperaturas[i] + "°C");
            }
        }

        sc.close();
    }
}



        



    

