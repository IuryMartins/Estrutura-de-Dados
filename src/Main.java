import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Vetores pessoas = new Vetores();
        Scanner in = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        for(int i = 0; i < 5; i++){
            Pessoa p = new Pessoa();
            System.out.println("Informe um nome: ");
            p.setNome(in.next());
            System.out.println("Informe uma idade: ");
            p.setIdade(in.nextInt());
            System.out.println("Informe o sexo ( 'f' pare feminino e 'm' para masculino): ");
            p.setSexo(in.next().toCharArray()[0]);
            System.out.println("Informe uma data de nascimento: ");
            p.setData_nascimento(formato.parse(in.next()));
            pessoas.add(p);
            System.out.println("Pessoa " + (i+1) + " adicionada.");
        }
        System.out.println(pessoas.listar());
    }
}
