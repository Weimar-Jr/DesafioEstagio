import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        boolean funcionando = true;
        while(funcionando)
        {
           try {
               System.out.println("Bem vindo, digite a opção que voce deseja acessar.");
               System.out.println("Digite \"1\" para ver se o numero que você digitar esta na sequência Fibonacci");
               System.out.println("Digite \"2\" para ver quantas vezes uma letra aparece em uma string.");
               System.out.println("Digite \"3\" para sair");
               System.out.println("Resposta: ");
               String resposta0 = scan.nextLine();

               //não consegui resolver o bug do input fantasma, então fiz uma gambiarra
               if(!resposta0.trim().isEmpty()) {

                   int resposta = Integer.parseInt(resposta0);
                   switch (resposta) {
                       case 1:
                           Fibonacci.SequenciaFibonacci();
                           break;
                       case 2:
                           ExisteEssaLetra.EssaLetraExiste();
                           break;
                       case 3:
                           funcionando = false;
                           System.out.println("Você saiu com sucesso.");
                           break;
                       default:
                           System.out.println("Opção errada, use apenas as que estão no menu.");
                   }
               }else {
                   resposta0 = scan.nextLine();
                   int resposta = Integer.parseInt(resposta0);
                   switch (resposta) {
                       case 1:
                           Fibonacci.SequenciaFibonacci();
                           break;
                       case 2:
                           ExisteEssaLetra.EssaLetraExiste();
                       case 3:
                           funcionando = false;
                           break;

                       default:
                           System.out.println("Opção errada, use apenas as que estão no menu.");
                   }
               }

           }catch (Exception e)
           {
               System.out.println(e);
           }
        }

    }
}