// Usamos o this dentro de um método para acessar um atributo:

class Conta {

        double saldo;
        int numero;

        void deposita(double valor) {
            this.saldo = this.saldo + valor;
        }
}