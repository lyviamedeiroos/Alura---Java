public class TestaBanco {
    public static void main(String[] args) {
        Cliente lyvia = new Cliente();
        lyvia.nome = "Lyvia Medeiros";
        lyvia.cpf = "000.000.000-00";
        lyvia.profissao = "Analista de sistemas";


        Conta contaDaLyvia = new Conta();
        contaDaLyvia.deposita(100);

        contaDaLyvia.titular = lyvia;
        System.out.println(contaDaLyvia.titular.nome);

    }
}
