package Ex5;

public class Semaforo {
    enum CoresSemaforo { AMARELO1, VERMELHO, AMARELO2, VERDE };

    public static void main(String[] args) {
        CoresSemaforo corSemaf = CoresSemaforo.VERMELHO;

        switch (corSemaf) {
            case AMARELO1:
                System.out.println("Sinal Amarelo, Atenção");
            case VERMELHO:
                System.out.println("Sinal Vermelho, Pare");
            case AMARELO2:
                System.out.println("Sinal Amarelo, Atenção");
            case VERDE:
                System.out.println("Sinal Verde, Siga");
        }
    }
}
