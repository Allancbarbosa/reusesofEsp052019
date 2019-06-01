/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_1;

/**
 *
 * @author Aluno
 */
public class Assinatura {

    private IPreco preco;
    private IContentTransformer qualidade;
    private IQuantidade qtde;

    Assinatura(IPreco preco, IContentTransformer qualidade, IQuantidade qtde) {

        this.preco = preco;
        this.qualidade = qualidade;
        this.qtde = qtde;

    }

    public double getPreco() {
        return preco.getPreco();
    }

    public void getQualidade() {
        qualidade.converterQuantidade();
    }

    public void getQtde() {
        int qtd = qtde.getQtde();
        System.out.println(qtd);
    }

}
