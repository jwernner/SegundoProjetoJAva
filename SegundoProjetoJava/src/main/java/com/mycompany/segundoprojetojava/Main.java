/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoprojetojava;

/**
 *
 * @author Jorge
 */
// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        // Instanciando um veículo
        Veiculo veiculo = new Veiculo(1500, 200, 50000.0f);

        // Instanciando um caminhão
        Caminhao caminhao = new Caminhao(5000, 120, 100000.0f, 10, 3, 10);

        // Exibindo informações do veículo e caminhão
        System.out.println("Informações do veículo:");
        System.out.println("Peso: " + veiculo.getPesoEmQuilos());
        System.out.println("Velocidade Máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Preço: " + veiculo.getPreco());

        System.out.println("\nInformações do caminhão:");
        System.out.println("Peso: " + caminhao.getPesoEmQuilos());
        System.out.println("Velocidade Máxima: " + caminhao.getVelocidadeMaxima());
        System.out.println("Preço: " + caminhao.getPreco());
        System.out.println("Toneladas: " + caminhao.getToneladas());
        System.out.println("Altura Máxima: " + caminhao.getAlturaMaxima());
        System.out.println("Comprimento: " + caminhao.getComprimento());
    }
}
