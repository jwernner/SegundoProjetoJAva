/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoprojetojava;

/**
 *
 * @author Jorge
 */
// Classe Caminhão
public class Caminhao extends Veiculo {
    // Atributos adicionais da classe Caminhao
    private int toneladas;
    private int alturaMaxima;
    private int comprimento;

    // Construtor da classe Caminhao
    public Caminhao(int pesoEmQuilos, int velocidadeMaxima, float preco, int toneladas, int alturaMaxima, int comprimento) {
        // Chamada ao construtor da classe Veiculo usando super()
        super(pesoEmQuilos, velocidadeMaxima, preco);
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    // Getters e Setters para os atributos adicionais da classe Caminhao
    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}
