package Ex1;

public class Carro {
    final String MODELO = "Modelo T";
    final String COR = "preto";

    int anoFab;
    int numPortas;

    public Carro(int anoFab, int numPortas) {
        this.anoFab = anoFab;
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Carro [modelo = " + MODELO + ", cor = " + COR + ", ano fabricacao = " + anoFab + ", numero portas = " + numPortas + "]";
    }
}
