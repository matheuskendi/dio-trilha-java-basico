import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        //Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);         
       
        //Exibir a mensagem para o nosso usuário
        System.out.println("Vamos criar sua conta no BANCO");
        System.out.println("Digite o numero da conta que deseja: ");
        int numconta = scanner.nextInt();        

        System.out.println("Digite a agência que deseja: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomecliente = scanner.next();

        System.out.println("Digite o Sobrenome do cliente: ");
        String sobrenomecliente = scanner.next();

        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();

        //Obter os valores digitado pelo scanner
        //Exibir a mensagem da conta criada
        System.out.println(
            "Olá " + nomecliente + " " + sobrenomecliente  +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numconta + " e seu saldo R$" + saldo + " já está disponível para saque "
        );

    }
}
