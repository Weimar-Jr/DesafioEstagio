
public class Fibonacci {

    static int primeiro = 0;
    static int segundo = 1;


    static void SequenciaFibonacci()
    {
        System.out.println("Digite o numero");
        String resposta0 = Main.scan.nextLine();
        int inputNumero = Integer.parseInt(resposta0);
        for(int i = 1; i <= inputNumero; i++)
        {
            int proximo =  primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            if(primeiro == inputNumero)
            {
                System.out.println("O numero: " + inputNumero + " esta na sequência.");
                break;
            }else if(i == inputNumero){
                System.out.println("O numero: " + inputNumero + " não esta na sequência.");
            }

        }

    }

}
