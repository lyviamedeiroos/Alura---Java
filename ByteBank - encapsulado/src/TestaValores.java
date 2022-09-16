public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2456);

        System.out.println(conta.getAgencia());

        conta.setAgencia(121212);

        Conta conta1 = new Conta(1337, 16667);
        Conta conta2 = new Conta(2323, 2364);
        System.out.println(Conta.getTotal());
    }
}
