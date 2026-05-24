import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String [] perguntas = { 
             "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"

        };
        int respostasPositivas = 0;

        for (int i = 0; i < perguntas.length; i++){
             System.out.println(perguntas[i]);
            System.out.print("Responda (S/N): ");

            char resposta = sc.next().toUpperCase().charAt(0);

            if (resposta == 'S') {
                respostasPositivas++;
            }
        }
         System.out.println("\nResultado:");

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();

        }
    }
