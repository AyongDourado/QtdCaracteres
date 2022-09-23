import java.util.Scanner;

public class caracteres{

    public static void main(String[] args){
        //Crie um método que realize a leitura da quantidade de caracteres de uma String
        
        //Declaração de variáveis
        String a;
    
        //pegar input do usuário
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sequencia de caracteres: ");
        a = input.nextLine();
    
        input.close();

        //Contador de string (incluindo espaço)
        int tstr = a.length();

        //Contador de string (sem contar o espaço)
        int tstrse = a.replace(" ", "").length();

        System.out.println("\nQuantidade de caracteres contando espaco: " + tstr);
        System.out.println("\nQuantidade de caracteres sem contar espaco: " + tstrse);
    }        
}