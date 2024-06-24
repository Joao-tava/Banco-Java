
package banco;

/**
 *
 * Essa é a super classse ou classe pai
 */
public class Pessoa {
   String nome;   
   private String dataDeNascimento;
   private String cpf;
   private String rg;
   private String nomeDopai;
   private String nomeDaMae;
   private String endereco;

    public Pessoa(String nome, String dataDeNascimento, String cpf, String rg, String nomeDopai, String nomeDaMae, String endereco) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeDopai = nomeDopai;
        this.nomeDaMae = nomeDaMae;
        this.endereco = endereco;
    }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeDopai() {
        return nomeDopai;
    }

    public void setNomeDopai(String nomeDopai) {
        this.nomeDopai = nomeDopai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public Pessoa(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
      
   
                 
    
}
