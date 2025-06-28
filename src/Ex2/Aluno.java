package Ex2;

public class Aluno {
    private static int numAlunos = 0;

    public Aluno() {
        numAlunos++;
    }

    public static int getNumAlunos() {
        return numAlunos;
    }
}
