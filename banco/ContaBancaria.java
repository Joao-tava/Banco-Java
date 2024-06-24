/*
 * Essa e uma classe de associaçao da classe Banco.java
 */
package banco;

public class ContaBancaria {
 private String agencia;
 private String numero;
 private Double saldo;


    public ContaBancaria(String agencia, String numero, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        
    }

    public ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
       
    }

    ContaBancaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 
    
}
