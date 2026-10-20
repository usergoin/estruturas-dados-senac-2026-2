package com.arvores;

public class ArvoreDemo extends ArvoreBase<String> {
    
    public void demonstrar() {
        NoArvore<String> empresa = new NoArvore<>("Empresa");
        
        definirRaiz(empresa);

        NoArvore<String> financeiro = new NoArvore<>("Financeiro");
        empresa.adicionarFilho(financeiro);

        NoArvore<String> contas = new NoArvore<>("Contas");
        financeiro.adicionarFilho(contas);

        NoArvore<String> senac = new NoArvore<String>("Senac");
        definirRaiz(senac);

        NoArvore<String> pi = new NoArvore<String>("Projeto");
        senac.adicionarFilho(pi);

        NoArvore<String> provas = new NoArvore<String>("Prova");
        pi.adicionarFilho(provas);

        NoArvore<String> notas = new NoArvore<String>("21");
        definirRaiz(notas);

        exibirResumo();
    }

    public static void main(String[] args) {
        new ArvoreDemo().executarDemonstracao();
    }
}