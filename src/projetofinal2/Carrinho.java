/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;

import java.util.ArrayList;

public class Carrinho extends Produtos {

    public static final int size = 0;
    ArrayList<Produtos> carrinho = new ArrayList(10);

    public float Soma() {
        float preco=0;
        for (int i = 0; i < carrinho.size(); i++) {
            preco += carrinho.get(i).getPreco();
        }
        return  preco;
    }

    public int getSize() {
        return carrinho.size();

    }

    public float getAll() {
        return carrinho.size() + this.preco;
    }

    @Override
    public String toString() {
        return "Produto" + this.nome + " " + "Preço: R$" + this.preco;
    }
}
