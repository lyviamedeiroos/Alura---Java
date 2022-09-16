public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2456);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente lyvia = new Cliente();
        lyvia.setNome("Lyvia Medeiros");
        lyvia.setCpf("153.117.774-35");
        lyvia.setProfissao("Tech Manager - Pier");

        conta.setTitular(lyvia);
        System.out.println("Seu nome é: " +conta.getTitular().getNome());
        System.out.println("Seu CPF é: " +conta.getTitular().getCpf());
        System.out.println("Sua profissão é: " +conta.getTitular().getProfissao());
    }
}