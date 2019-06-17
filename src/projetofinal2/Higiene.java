/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;

public class Higiene extends Produtos {

    protected float peso;
    protected double codigodebarras;

    public Higiene() {
    }

    public Higiene(String a) {

        if (a.equals("SORRISO")) {
            this.nome = "Sorriso MAX";
            this.peso = (float) 0.6;
            this.codigodebarras = 1139318;
            this.fabricante = "Sorriso";
            this.preco = 2;

        } else {

            this.nome = "colgate MAXplax";
            this.peso = (float) 0.7;
            this.codigodebarras = 1139318;
            this.fabricante = "colgate";
            this.preco = (float) 2.5;

        }
    }

    public Higiene(String a, String b) {

        if (b.equals("PALMOLIVE")) {
            this.nome = "palmolive action";
            this.peso = (float) 0.7;
            this.codigodebarras = 1139318;
            this.fabricante = "palmolive";
            this.preco = (float) 5.5;

        } else {

            this.nome = "clear MEN ANTI CASPA";
            this.peso = (float) 0.8;
            this.codigodebarras = 1139318;
            this.fabricante = "CLEAR";
            this.preco = (float) 4.5;
        }

    }

    public Higiene(String a, String b, String c) {

        if (c.equals("NIVIEA")) {
            this.nome = "nivea MEN";
            this.peso = (float) 0.3;//mg
            this.codigodebarras = 1139318;
            this.fabricante = "niviea";
            this.preco = (float) 2.5;

        } else {
            this.nome = "PROTEX";
            this.peso = (float) 0.3;//mg
            this.codigodebarras = 1139318;
            this.fabricante = "protex";
            this.preco = (float) 2.2;
        }

    }

    public float getPeso() {
        return peso;
    }

    public double getCodigodebarras() {
        return codigodebarras;
    }

    @Override
    public String toString() {

        return "PESO: " + this.peso + " " + "ML \nCOD:" + this.codigodebarras + "" + "\nFABRICANTE: " + this.fabricante + "\nPREÇO:" + "R$" + this.preco + "\n";

    }
}
