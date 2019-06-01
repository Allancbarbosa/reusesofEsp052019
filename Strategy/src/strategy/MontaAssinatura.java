/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MontaAssinatura {

    public MontaAssinatura(String QualidadeVideo, String Preco, String QuantidadeTransmissao) {
        QualidadeVideo q = new QualidadeVideo();
        Preco p = new Preco();
        QuantidadeTransmissao t = new QuantidadeTransmissao();
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha sua Assinatura : ");//B=Básico|P=Padrão|I=Premium  
        String plano = s.next();
        System.out.println("Qualidade de Imagem :" + q.getQtde(plano));
        System.out.println("Valor Pacote :" + p.getPreco(plano));
        System.out.println("Quantidade de Transmissão(Telas) :" + t.getTransmissao(plano));         
    }  

}
