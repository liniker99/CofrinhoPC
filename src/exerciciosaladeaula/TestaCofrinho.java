/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaladeaula;

/**
 *
 * @author Liniker
 */
public class TestaCofrinho {
    public static void main(String[] args){
        Cofrinho moedas = new Cofrinho();
        moedas.adicionaMoeda(new Moeda(10));
        moedas.adicionaMoeda(new Moeda(25));
        moedas.adicionaMoeda(new Moeda(50));
        moedas.adicionaMoeda(new Moeda(100));
        moedas.adicionaMoeda(new Moeda(25));
        moedas.adicionaMoeda(new Moeda(10));
        moedas.adicionaMoeda(new Moeda(25));
        moedas.adicionaMoeda(new Moeda(100));
        
        System.out.println("O cofrinho tem R$ " + (moedas.calculaTotal()/100));
        
        
        moedas.verMoedas();
        moedas.contarMoedasValor(25);
        moedas.contarMoedasValor(10);
        
        System.out.println("O maior valor de moeda no cofrinho é: " + moedas.maiorValorDeMoedaNoCofrinho()/100);
        
    
    }
}
