import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        
        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite qual é a sua Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextDouble();

        // USANDO O METODO "CONCAT" DA CLASSE STRING PARA CONCATENAR AS INFORMAÇÕES VINDAS DO USUARIO AO TEXTO, E TAMBEM O METODO "VALUEOF" PARA CONVERTER AS VARIAVEIS DO TIPO NUMERICO PARA STRING
        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo " ).concat(String.valueOf(saldo)).concat(" já está disponível para saque"));
        
        //FAZENDO CONCATENAÇÃO SIMPLES.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");

        scanner.close();      
    }
}
