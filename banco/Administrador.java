
package banco;
import java.util.Scanner;
/**
 *
 * A classe Administradro implementa a interface Comandos com seus metodos "criar" e "deletar" e herda da classe Pessoa 
 */
public class Administrador extends Pessoa implements Comandos  {
Scanner sc = new Scanner(System.in);
Pessoa p = new Pessoa();
    public Administrador(String nome, String dataDeNascimento, String cpf, String rg, String nomeDopai, String nomeDaMae, String endereco) {
        super(nome, dataDeNascimento, cpf, rg, nomeDopai, nomeDaMae, endereco);
    }

    Administrador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
   public void criar(){ 
   }
   @Override
   public void deletar(){}
   
}

                 
    

