package conta;

public class Cartao  {
    private double saldo;
    private double limiteCredito;

    public Cartao(double saldo){
        this.saldo= saldo;
        this.limiteCredito=saldo*0.1;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double valorEmConta(){return saldo+limiteCredito;}

    private void setSaldo(double saldo){
        this.saldo=saldo;
    }

    private void setLimiteCredito(double limite){
        this.limiteCredito=limite;
    }

    public boolean compraAprovada(boolean compra){
        return compra;
    }

    @Override
    public String toString(){
        return "O saldo da sua conta é Rs$" + this.getSaldo() + " com um limite adicional de Rs$" +this.getLimiteCredito();
    }

    public boolean verificarComprar(double preco){
        double credito=this.getLimiteCredito();
        double  conta=this.getSaldo();
        double soma=conta+credito;
        double novoSaldo;
        if(preco < this.getSaldo()){
            novoSaldo= this.getSaldo()-preco;
            this.setSaldo(novoSaldo);
            System.out.println("Compra realizada!");
            return true;
        }
        else if(preco<soma){
            novoSaldo=0;
            this.setSaldo(novoSaldo);
            novoSaldo=soma-preco;
            this.setLimiteCredito(novoSaldo);
            System.out.println("Compra realizada, limite utilizado!");

            return true;
        }
        else{
            System.out.println("Não foi possivel realizar a compra saldo insufiente");
            return false;
        }


    }
}
