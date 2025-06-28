package Ex2;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno[] alunos;
        alunos = new Aluno[10];

        for(int i = 0; i < 10; i++) {
            alunos[i] = new Aluno();
        }

        System.out.println(Aluno.getNumAlunos());
    }
}
