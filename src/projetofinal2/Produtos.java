/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;

public class Produtos extends Mercado{
    protected String nome;
    protected String tipo;
    protected String fabricante;
    protected float preco;
  
    public Produtos() {

    }
    

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFabricante() {
        return fabricante;
    }
 
    
    
}