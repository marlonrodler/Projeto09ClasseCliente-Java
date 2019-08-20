/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author marlo
 */
public class Projeto09ClasseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  Um OBJETO c1 do tipo da Classe Cliente,
         sendo Instanciado por meio do operador NEW
         que chama o método construtor Cliente();  */
        Cliente c1 = new Cliente("1122", "Rodler", "8877-04", "Pirajuí", "SP");

        System.out.println("RG: " + c1.getRG());//c1.getRG, estou recuperando e mostrando para o usuário o valor do RG
        //c1.setRG("Valor"), estou definindo com o set um valor para o meu RG
        c1.setRG("7788");
        System.out.println("Tocando valor do RG: " + c1.getRG());
        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCPF());
        System.out.println("Cidade: " + c1.getCidade());
        System.out.println("Estado: " + c1.getEstado());

    }

}
