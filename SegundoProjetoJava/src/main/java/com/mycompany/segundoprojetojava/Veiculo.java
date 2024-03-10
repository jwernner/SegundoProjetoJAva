/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundoprojetojava;

/**
 *
 * @author Jorge
 */
// Classe Veiculo
public class Veiculo {
    // Atributos da classe Veiculo
    private int pesoEmQuilos;
    private int velocidadeMaxima;
    private float preco;

    // Construtor da classe Veiculo
    public Veiculo(int pesoEmQuilos, int velocidadeMaxima, float preco) {
        this.pesoEmQuilos = pesoEmQuilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public int getPesoEmQuilos() {
        return pesoEmQuilos;
    }

    public void setPesoEmQuilos(int pesoEmQuilos) {
        this.pesoEmQuilos = pesoEmQuilos;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}