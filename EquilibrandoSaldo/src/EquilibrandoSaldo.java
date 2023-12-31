import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        double saldoAtualizado;
        double auxSaldoAtualizado;
        
        //Processamento
        auxSaldoAtualizado = saldoAtual + valorDeposito;
        saldoAtualizado = auxSaldoAtualizado - valorRetirada;


        //saida
        System.out.println("Saldo atualizado na conta: " +String.format("%.1f", saldoAtualizado));

        scanner.close();

    }
}
