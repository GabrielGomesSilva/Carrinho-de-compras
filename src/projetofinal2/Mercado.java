/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal2;

import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {

        Carrinho carro = new Carrinho();

        System.out.println("Bem vindo ao mercado GJM");
        int menu = 0;

        do {
            System.out.println("Favor, selecionar uma das opções abaixo:");
            System.out.println("Digite uma opção!");
            System.out.println("1-Eletronicos");
            System.out.println("2-Alimentos");
            System.out.println("3-Higiene");
            System.out.println("4-Mostrar Produtos do carrinho:");
            System.out.println("5-Remover Produtos do carrinho:");
            System.out.println("6-Sair");
            System.out.println("Produtos no carrinho:" + carro.carrinho.size() + "\nValor das compras:" + carro.Soma());
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) {

                case 1:
                    System.out.println("1-TV" + "\n2-Som" + "\n3-Smartphone" + "\n0-Sair");
                    System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                    int opcao = sc.nextInt();
                    if (opcao == 1) {
                        String exemplo = "SAMSUNG";
                        Eletronicos tvsamsung = new Eletronicos(exemplo);
                        String exemplo2 = "TCL";
                        Eletronicos tvTCL = new Eletronicos(exemplo2);
                        System.out.println("Favor escolher uma das opções abaixo:" + "\n*****1-SAMSUNG******\n" + tvsamsung.toString() + "\n " + "\n*****2-TCL*****\n" + tvTCL.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao1 = sc.nextInt();
                        switch (opcao1) {
                            case 1:
                                carro.carrinho.add(tvsamsung);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(tvTCL);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    if (opcao == 2) {
                        String a = null;
                        String exemplo = "SONY";
                        Eletronicos somSONY = new Eletronicos(a, exemplo);
                        String exemplo2 = "PANASONIC";
                        Eletronicos somPANASONIC = new Eletronicos(a, exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n*****1-SONY*****\n" + somSONY.toString() + "\n*****2-PANASONIC*****\n" + somPANASONIC.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao1 = sc.nextInt();
                        switch (opcao1) {
                            case 1:
                                carro.carrinho.add(somSONY);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(somPANASONIC);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    if (opcao == 3) {
                        String a = null;
                        String b = null;
                        String exemplo = "MOTOROLA";
                        Eletronicos celmoto = new Eletronicos(a, b, exemplo);
                        String exemplo2 = "LG";
                        Eletronicos cellg = new Eletronicos(a, b, exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n1*****-MOTOROLA*****\n" + celmoto.toString() + "\n2*****-LG*****\n" + cellg.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao1 = sc.nextInt();
                        switch (opcao1) {
                            case 1:
                                carro.carrinho.add(celmoto);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(cellg);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("1-FEIJAO" + "\n2-ARROZ" + "\n3-CARNES" + "\n0-Sair");
                    System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                    int opcao1 = sc.nextInt();
                    if (opcao1 == 1) {
                        String exemplo = "TURQUESA";
                        Alimentos feijaoT = new Alimentos(exemplo);
                        String exemplo2 = "MARANATA";
                        Alimentos feijaoM = new Alimentos(exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n1*****-TURQUESA*****\n" + feijaoT.toString() + "\n*****2-MARANATA*****\n" + feijaoM.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao2 = sc.nextInt();
                        switch (opcao2) {
                            case 1:
                                carro.carrinho.add(feijaoT);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(feijaoM);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    if (opcao1 == 2) {
                        String a = null;
                        String exemplo = "TURQUESA";
                        Alimentos arrozT = new Alimentos(a, exemplo);
                        String exemplo2 = "CARIOCA";
                        Alimentos arrozC = new Alimentos(a, exemplo2);
                        System.out.println("Favor escolher uma das opções abaixo:" + "\n*****1-TURQUESA*****\n" + arrozT.toString() + "\n*****2-CARIOCA*****\n" + arrozC.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao2 = sc.nextInt();
                        switch (opcao2) {
                            case 1:
                                carro.carrinho.add(arrozT);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(arrozC);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    if (opcao1 == 3) {
                        String a = null;
                        String b = null;
                        String exemplo = "NATO";
                        Alimentos carneNATO = new Alimentos(a, b, exemplo);
                        String exemplo2 = "FRIBOI";
                        Alimentos carneFRIBOI = new Alimentos(a, b, exemplo2);
                        System.out.println("Favor escolher uma das opções abaixo:" + "\n******1-NATO*****\n" + carneNATO.toString() + "\n*****2-FRIBOI*****\n" + carneFRIBOI.toString() + "\n3-Sair");

                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao2 = sc.nextInt();
                        switch (opcao2) {
                            case 1:
                                carro.carrinho.add(carneNATO);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(carneFRIBOI);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;

                        }

                    }

                    break;

                case 3:
                    String a = null;
                    String b = null;
                    System.out.println("1-CREME DENTAL" + "\n2-SHAMPOO" + "\n3-SABONETE" + "\n0-Sair");

                    System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                    int opcao2 = sc.nextInt();
                    if (opcao2 == 1) {
                        String exemplo = "SORRISO";
                        Higiene cremeSORRISO = new Higiene(exemplo);
                        String exemplo2 = "COLGATE";
                        Higiene cremeCOLGATE = new Higiene(exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n*****1-SORRISO\n" + cremeSORRISO.toString() + "\n*****2-COLGATE*****\n" + cremeCOLGATE.toString() + "\n3-Sair");

                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao3 = sc.nextInt();
                        switch (opcao3) {
                            case 1:
                                carro.carrinho.add(cremeSORRISO);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(cremeCOLGATE);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;

                        }

                    }
                    if (opcao2 == 2) {
                        String exemplo = "PALMOLIVE";
                        Higiene shampooP = new Higiene(a, exemplo);
                        String exemplo2 = "CLEAR";
                        Higiene shampooC = new Higiene(a, exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n*****1-PALMOLIVE*****\n" + shampooP.toString() + "\n*****2-CLEAR*****\n" + shampooC.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao3 = sc.nextInt();
                        switch (opcao3) {
                            case 1:
                                carro.carrinho.add(shampooP);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(shampooC);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;

                        }

                    }
                    if (opcao2 == 3) {
                        String exemplo = "NIVIEA";
                        Higiene saboneteN = new Higiene(a, b, exemplo);
                        String exemplo2 = "PROTEX";
                        Higiene saboneteP = new Higiene(a, b, exemplo2);
                        System.out.println("Favor escolher uma das opções:" + "\n*****1-NIVIEA*****\n" + saboneteN.toString() + "\n*****2-PROTEX*****\n" + saboneteP.toString() + "\n3-Sair");
                        System.out.println("Produtos no carrinho:" + carro.carrinho.size());
                        int opcao3 = sc.nextInt();
                        switch (opcao3) {
                            case 1:
                                carro.carrinho.add(saboneteN);
                                System.out.println("Produto adicionado com sucesso");
                                break;
                            case 2:
                                carro.carrinho.add(saboneteP);
                                System.out.println("Produto adicionado com sucesso");
                                break;

                            default:
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n \n \n \n \n \n \n \n ");
                    for (int i = 0; i < carro.carrinho.size(); i++) {
                        System.out.println(carro.carrinho.get(i).toString());
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("\n \n \n \n \n \n \n ");
                    System.out.println("----------------------------");
                    for (int i = 0; i < carro.carrinho.size(); i++) {
                        System.out.println(i + "-" + carro.carrinho.get(i).toString());
                    }
                    int x = carro.carrinho.size();
                    int y = x - 1;
                    System.out.println("Escolha um item do carrinho para ser removido(entre 0 e " + y + ")");
                    int opcao4 = sc.nextInt();
                    if (opcao4 >= x) {
                        System.out.println("opcao incorreta!!");
                        break;
                    } else {
                        carro.carrinho.remove(opcao4);
                        break;
                    }
                    
            }
        } while (menu != 6);
    }
}
