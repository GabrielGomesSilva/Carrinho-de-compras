/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;



public class Eletronicos extends Produtos {

    protected String Ligar;
    protected String Desligar;
    protected String Aumentarsom;
    protected double Ndeserie;
    protected double tamanho;
    protected String cor;
    protected String mudarcanal;
    protected String mudarestacao;
    protected String chamada;

    public Eletronicos() {

    }

    public Eletronicos(String tv) {

        if (tv.equals("SAMSUNG")) {
            this.tipo = "TV";
            this.cor = "preto";
            this.fabricante = "SAMSUNG";
            this.tamanho = 60;
            this.Ndeserie = 325;
            this.preco = 250;

        } else {

            this.tipo = "TV";
            this.cor = "preto";
            this.fabricante = "TCL";
            this.tamanho = 70;
            this.Ndeserie = 330;
            this.preco = 300;
        }

    }

    public Eletronicos(String a, String b) {
        if (b.equals("SONY")) {

            this.tipo = "SOM";
            this.cor = "azul";
            this.fabricante = "SONY";
            this.tamanho = 10;
            this.Ndeserie = 200;
            this.preco = 100;

        } else {

            this.tipo = "SOM";
            this.cor = "rosa";
            this.fabricante = "PANASONIC";
            this.tamanho = 15;
            this.Ndeserie = 215;
            this.preco = 120;
        }

    }

    public Eletronicos(String a, String b, String c) {
        if (c.equals("MOTOROLA")) {
            this.tipo = "SMARTPHONE";
            this.cor = "azul";
            this.fabricante = "MOTOROLA";
            this.tamanho = 5;
            this.Ndeserie = 170;
            this.preco = 1000;

        } else {
            this.tipo = "SMARTPHONE";
            this.cor = "amarelo";
            this.fabricante = "LG";
            this.tamanho = 5;
            this.Ndeserie = 290;
            this.preco = 1100;
        }

    }
//METODOS QUE FORAM CRIADOS SOMENTE DE MANEIRA ILUSTRATIVA
    public String Ligar() {
        return Ligar;
    }

    public String Desligar() {
        return Desligar;
    }

    public String Aumentarsom() {
        return Aumentarsom;
    }

 
    public String Mudarcanal() {
        return mudarcanal;
    }

    public String Mudarestacao() {
        return mudarestacao;
    }

    public String Chamada() {
        return chamada;
    }

    @Override
    public String toString() {

        return "Fabricante:" + " " + this.fabricante + "\nNumero de série:" + " " + this.Ndeserie + " " + "\nCor:" + this.cor + "\nTamanho:" + this.tamanho + "Cm \nPREÇO: " + "R$" + this.preco + "\n";
    }
}
