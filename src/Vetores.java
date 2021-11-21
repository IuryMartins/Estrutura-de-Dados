public class Vetores {

    Pessoa[] pessoas;
    int index;

    public Vetores() {
        this.pessoas = new Pessoa[10];
        index = 0;
    }

    public Pessoa[] get() {
        return pessoas;
    } // end getter

    public boolean add(Pessoa pessoa){
        if(index < 10){
            pessoas[index] = pessoa;
            index++;
            return true;
        }
        return false;
    }

    public String listar(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < index; i++) {
            str.append(pessoas[i].toString());
            if(pessoas[i].getIdade() >= 18){
                str.append(", MAIOR DE IDADE");
            }
            else {
                str.append(", MENOR DE IDADE");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
