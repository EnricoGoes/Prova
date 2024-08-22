package resolucao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ColecaoAlunoArray alunoArray  = new ColecaoAlunoArray(10);
        
        //alunoArray.cadastrarAluno(new Aluno("Enrico", "2020340023", 21, "Informática"));
        //alunoArray.cadastrarAluno(new Aluno("Jóse", "2523534023", 20, "Informática"));
        //alunoArray.cadastrarAlunoPorPosicao(new Aluno("Thiago", "2030420343", 19, "Informática"), 2);
        //alunoArray.listarAluno();
        //System.out.println("Aluno na posição 2: "  + alunoArray.procurarAlunoPorPosicao(2));
        //alunoArray.excluirAlunoPorPosicao(1);
        //alunoArray.listarAluno();

        ColecaoAluno alunoList = new ColecaoAluno();
        alunoList.cadastrarAluno(new Aluno("João", "2020340023", 23,  "Informática"));
        alunoList.cadastrarAluno(new Aluno("Maria", "2239490023", 18,  "Informática"));
        alunoList.cadastrarAlunoPorPosicao(new Aluno("Tony", "3459394593", 22, "informática"), 2);
        alunoList.listarAluno();
        System.out.println("Aluno na posição 2: " +alunoList.procurarAlunoPorPosicao(2));
        alunoList.excluirAlunoPorPosicao(1);
        alunoList.listarAluno();
    }

}
