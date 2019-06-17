/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;

public class Alimentos extends Produtos {

    protected float peso;
    protected double codigodebarras;

    public Alimentos() {

    }

    public Alimentos(String a) {

        if (a.equals("TURQUESA")) {
            this.tipo = "FEIJAO MACASSAR";
            this.peso = 2;
            this.codigodebarras = 1029318;
            this.fabricante = "TURQUESA";
            this.preco = 5;

        } else {

            this.tipo = "FEIJAO PRETO";
            this.peso = 2;
            this.codigodebarras = 1029318;
            this.fabricante = "MARANATA";
            this.preco = 4;
        }
    }

    public Alimentos(String a, String b) {

        if (b.equals("TURQUESA")) {
            this.tipo = "ARROZ COMUM";
            this.peso = 1;
            this.codigodebarras = 1029318;
            this.fabricante = "TURQUESA";
            this.preco = 7;

        } else {

            this.tipo = "ARROZ PARBOLIZADO";
            this.peso = 1;
            this.codigodebarras = 1029318;
            this.fabricante = "CARIOCA";
            this.preco = 5;
        }

    }

    public Alimentos(String a, String b, String c) {

        if (c.equals("NATO")) {
            this.tipo = "CARNE BOVINA";
            this.peso = 1;
            this.codigodebarras = 1029318;
            this.fabricante = "NATO";
            this.preco = 25;

        } else {
            this.tipo = "CARNE SUINA";
            this.peso = 1;
            this.codigodebarras = 1029318;
            this.fabricante = "FRIBOI";
            this.preco = 18;
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

        return "Tipo:" + this.tipo + "" + " " + "\nPESO: " + this.peso + " " + "kg \nCOD:" + this.codigodebarras + "" + "\nFABRICANTE: " + this.fabricante + "\nPREÇO:" + "R$" + this.preco + "\n";
    }
}
