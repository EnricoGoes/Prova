package resolucao;

import java.util.List;
import java.util.ArrayList;

public class ColecaoAluno {

    private List<Aluno> alunos;

    public ColecaoAluno() {
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno Cadastrado!");
    }

    public void cadastrarAlunoPorPosicao(Aluno aluno, int posicao) {
        if (alunos.isEmpty()) {
            if (posicao == 0) {
                alunos.add(aluno);
                System.out.println("Aluno Cadastrado na posicao " + posicao + "!");
            } else {
                System.out.println("Posição inválida!");
            }
        } else if (posicao >= 0 && posicao <= alunos.size()) {
            alunos.add(posicao, aluno);
            System.out.println("Aluno Cadastrado na posicao " + posicao + "!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void excluirAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < alunos.size()) {
            alunos.remove(posicao);
            System.out.println("Aluno excluido na posição " + posicao + "!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void listarAluno(){
        for (int i = 0; i < alunos.size(); i++){
        System.out.println("Alunos " + i + " : " + alunos.get(i));
        }
    }

    public Aluno procurarAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < alunos.size()) {
            return alunos.get(posicao);
        } else {
            System.out.println("Posição inválida!");
            return null;
        }
    }
}
