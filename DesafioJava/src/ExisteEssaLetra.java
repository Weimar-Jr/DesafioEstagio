public class ExisteEssaLetra
{

    static void EssaLetraExiste()
    {
        System.out.println("Digite a string que você desejar: ");
        String resposta1 = Main.scan.nextLine();
        System.out.println("String inserida: " + resposta1);

        System.out.println("Agora digite a letra que você quer contar: ");
        String  resposta2 = Main.scan.next();
        char respostaChar = resposta2.charAt(0);
        System.out.println("Char inserido: " + respostaChar);

        String resposta11 = resposta1.toLowerCase();
        char resposta22 = Character.toLowerCase(respostaChar);

        int contador = 0;

        for (int i = 0; i < resposta11.length(); i++)
        {
            if(resposta11.charAt(i) == resposta22)
            {
                contador++;
            }
        }

        System.out.println("O char: " + respostaChar + " aparece: " + contador + " vezes.");

    }
}

