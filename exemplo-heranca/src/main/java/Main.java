import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Enzo", 10.0, 9.0);
        Aluno alunoPos = new AlunoPos("Paulo", 10.0, 9.0, 8.0);


        System.out.println(aluno01);
        System.out.println(alunoPos);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno01);
        alunos.add(alunoPos);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.calcularNotaFinal());
        }
    }
}
