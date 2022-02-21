public class Banco {
    public void depositar(Conta c, double valor){
        c.depositar(valor);
    }

    public void realizarTransferencias(Conta a, double valor, Conta c){
        a.sacar(valor);
        c.depositar(valor);
    }
}
