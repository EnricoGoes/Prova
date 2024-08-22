package resolucao;

public class ColecaoAlunoArray {
    private Aluno[] alunos;
    private int pontoAtual;

    public ColecaoAlunoArray(int tamanho) {
        alunos = new Aluno[tamanho];
        pontoAtual = 0;
    }

    public void cadastrarAluno(Aluno aluno) {
        if (pontoAtual < alunos.length) {
            alunos[pontoAtual] = aluno;
            pontoAtual++;
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("A coleção está cheia!");
        }
    }

    public void cadastrarAlunoPorPosicao(Aluno aluno, int posicao) {
        if (posicao >= 0 && posicao < alunos.length) {
            if (alunos[posicao] == null) {
                for (int i = alunos.length - 1; i > posicao; i--) {
                    alunos[i] = alunos[i - 1];
                }
                alunos[posicao] = aluno;
                System.out.println("Aluno cadastrado com sucesso na posicao " + posicao + "!");

                if (posicao >= pontoAtual) {
                    pontoAtual = posicao + 1;
                } else {
                    pontoAtual++;
                }
            } else {
                System.out.println("Posicao ja ocupada!");
            }
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void excluirAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < alunos.length) {
            if (alunos[posicao] != null) {
                alunos[posicao] = null;
                System.out.println("Aluno excluído da posição " + posicao + "!");
            } else {
                System.out.println("Não há aluno nesta posição para excluir");
            }
        } else {
            System.out.println("Posicão invalida!");
        }
    }

    public void listarAluno() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Posicao " + i + " : " + alunos[i]);
            }
        }
    }

    public Aluno procurarAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < alunos.length) {
            if (alunos[posicao] != null) {
                return alunos[posicao];
            } else {
                System.out.println("Não há aluno nesta posição!");
            }
        } else {
            System.out.println("Posição invalida!");

        }
        return null;
    }
}
