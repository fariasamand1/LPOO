package usuarios;

public class proprietario extends usuarios {
    private int propriedade;
    public proprietario(String nome, String endereco, String contato, int propriedade){
        super (nome, endereco, contato);
        this.propriedade=propriedade;
    }

    @Override
    public String toString() {
        return "proprietario{" +
                "propriedade=" + propriedade +
                '}';
    }
}
