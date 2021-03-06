/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import produto.Produto;

/**
 *
 * @author Amaro
 */
public class ItemPedido {
    private int quantidade;
    private double precoUnitario;
    private double precoTotal;
    private String observacao;
    private Produto produto;

    public ItemPedido(int quantidade, String observacao, Produto produto) {
        this.quantidade = quantidade;
        this.observacao = observacao;
        this.produto = produto;
        this.precoUnitario = produto.getPreco();
        this.precoTotal = this.quantidade * this.precoUnitario;
    }



    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto p) {
        this.produto = p;
    } 
}
