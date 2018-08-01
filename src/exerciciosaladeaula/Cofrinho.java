/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaladeaula;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Liniker
 */
public class Cofrinho {
    
    public Cofrinho(){
    
    }
    
    private List<Moeda> moedas = new ArrayList<>();
    
    public void adicionaMoeda(Moeda moeda){
        moedas.add(moeda);
    }
    
    public double calculaTotal(){
        double soma = 0;
        for(Moeda moeda : moedas){
            soma += moeda.getValor();
    }
        return soma;   
    }
    
    public void verMoedas(){
        System.out.println("Quantidade de Moedas adicionas no Cofrinho: "+ moedas.size());
    }
    
    public int totalDeMoedasCujoValorE(double valor){
        int quantidadeMoedas = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() == valor) {
                quantidadeMoedas++; 
            }
        }
        
        return quantidadeMoedas;
    }
    
    public void contarMoedasValor(double valor) {
        int totalMoedas = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() == valor) {
                totalMoedas++; 
            }
        }
        System.out.println("Quantidade de moedas de " + valor + ": " + totalMoedas);
    }
    
    public double maiorValorDeMoedaNoCofrinho(){
        double maior = Double.NEGATIVE_INFINITY;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() > maior) {
                maior = moeda.getValor();
            }
        }
        
        return maior;
    }
    
    /*public int maiorValor() {
        int maior = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() > maior)
                maior = (int) moeda.getValor();
                System.out.println("quantidade de moedas de " + maior);
            
        }
        return maior;
    }*/
}

