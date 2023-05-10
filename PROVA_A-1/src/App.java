import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

            //Declarando as variaveis
            String nome;
            double peso;
            double agua_ingerida;
            double quantidade_ideal;
            double falta_beber;
            double arredondada;

            //Entrada de dados
            System.out.println("-------------------- QUANTIDADE DE AGUA IDEAL --------------------");
            System.out.println("");

            System.out.println("Qual seu nome:");
            System.out.print("> ");
            nome = entrada.nextLine();
            System.out.println("");

            System.out.println("Qual seu peso atual em (Kg)? ");
            System.out.print("> ");
            peso = entrada.nextDouble();
            System.out.println("");

            System.out.println("Quantos litros de áqua já ingeriu hoje? ");
            System.out.print("> ");
            agua_ingerida = entrada.nextDouble();
            System.out.println("");

        entrada.close();

            //Processamento de dados
            quantidade_ideal = peso *  0.035;
            arredondada = Math.ceil(quantidade_ideal);
            falta_beber = arredondada - agua_ingerida;

            
            //Saida de dados
            System.out.println("*******************************************************************");
            System.out.println(" ");

            System.out.printf("Nome: %s ",nome);
            System.out.println("\n");

            System.out.printf("Peso: %.0f Kg", peso);
            System.out.println("\n");

            System.out.printf("Quantidade de agua ingerida: %.0f Litros", agua_ingerida);
            System.out.println("\n");

            System.out.printf("A quantidade de agua ideal a inerir e: %.0f Litros", arredondada);
            System.out.println("\n");

            if (falta_beber <= 0){
                System.out.print("Parabéns, você atingiu a meta de hidratação diária.");
                System.out.println("\n");

            } 

            else if (falta_beber > 0) {
                System.out.printf("Continue focado em se hidratar por hoje, ainda faltam [%.0f] litros! Você consegue!", falta_beber);
                System.out.println("\n");

            }

            System.out.println("*******************************************************************");
            System.out.println(" ");



        

    
    }
}
