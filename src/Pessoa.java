import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
   private String nome;
   private int idade;
   private char sexo;
   private Date data_nascimento;

   public Pessoa() {

   }
   public Pessoa(String nome, int idade, char sexo, Date data_nascimento) {
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
      this.data_nascimento = data_nascimento;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   public char getSexo() {
      return sexo;
   }

   public void setSexo(char sexo) {
      this.sexo = sexo;
   }

   public Date getData_nascimento() {
      return data_nascimento;
   }

   public void setData_nascimento(Date data_nascimento) {
      this.data_nascimento = data_nascimento;
   }

   public String falar() {
     return "Olá";
   }

   public String andar() {
      return "andou!";
   }

   public String comer() {
      return "comeu!";
   }

   @Override
   public String toString() {
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      return
              "Nome: " + nome +
              ", Idade: " + idade +
              ", Sexo: " + String.valueOf(sexo).toUpperCase() +
              ", Nascimento: " + formato.format(data_nascimento);
   }
}
