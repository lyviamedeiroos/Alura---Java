public class Conta {

        //atributos
        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private  static int total;
        public Conta(int agencia, int numero){
         System.out.println("Criando uma conta");
         this.agencia = agencia;
         this.numero = numero;
         this.saldo = 100; //toda conta começa com 100 de saldo.
         System.out.println("Criando uma conta");
        }
        //metodos
        public void deposita(double valor) {
                this.saldo += valor;

        }

        public boolean saca(double valor) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        return true;
                } else {
                        return false;
                }
        }

        public boolean transfere(double valor, Conta destino) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposita(valor);
                        return true;
                }
                return false;
        }
        //Getter
        public int getNumero(){

                return this.numero;
        }
        //Setter
        public void setNumero(int numero){
                if (this.numero <= 0){
                    System.out.println("ERRO, NÃO PODE VALOR MENOR OU IGUAL A 0");
                    return;
                }
                this.numero = numero;
        }
        //Getter
        public int getAgencia(){

                return this.agencia;
        }
        //Setter
        public void setAgencia(int agencia){
                if (this.agencia <= 0){
                    System.out.println("ERRO, NÃO PODE VALOR MENOR OU IGUAL A 0");
                    return;
                }
                this.agencia = agencia;
        }
        //Getter
        public Cliente getTitular() {

                return this.titular;
        }
        //Setter
        public void setTitular(Cliente titular) {

                this.titular = titular;
        }


        public static int getTotal() {
                return Conta.total;
        }

}

