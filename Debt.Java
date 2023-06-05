
public class Debt {
    String description;
    double preco;
    String payday;
    boolean recorrente;

    public Debt(String description, double preco, String payday, boolean recorrente) {
        this.description = description;
        this.preco = preco;
        this.payday = payday;
        this.recorrente = recorrente;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double Preco) {
        this.preco = preco;
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday;
    }

    public boolean getRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }
}