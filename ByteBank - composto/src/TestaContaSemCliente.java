public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela Cavalcante De Andrade";
        System.out.println(contaDaMarcela.titular.nome);

        contaDaMarcela.titular.cpf = "222.333.444-55";
        System.out.println(contaDaMarcela.titular.cpf);

        contaDaMarcela.titular.profissao = "Desenvolvedora de Software";
        System.out.println(contaDaMarcela.titular.profissao);
    }
}