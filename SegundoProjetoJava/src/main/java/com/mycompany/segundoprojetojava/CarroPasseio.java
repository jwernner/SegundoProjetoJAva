/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoprojetojava;

/**
 *
 * @author Jorge
 */
// Classe CarroPasseio
public class CarroPasseio extends Veiculo {
    // Atributos adicionais da classe CarroPasseio
    private String cor;
    private String modelo;

    // Construtor da classe CarroPasseio
    public CarroPasseio(int pesoEmQuilos, int velocidadeMaxima, float preco, String cor, String modelo) {
        // Chamada ao construtor da classe Veiculo usando super()
        super(pesoEmQuilos, velocidadeMaxima, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    // Getters e Setters para os atributos adicionais da classe CarroPasseio
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
