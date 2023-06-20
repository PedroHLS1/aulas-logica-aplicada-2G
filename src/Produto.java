public class Produto {
    //atributos
    int codigo;
   private String nome;
    double valor;
    // setter - definição
  //  public void setNome(String valor) {
   //     if (nivelAcesso == 5) {
   //         this.nome = valor;
  //      }
 //   }
    //contrutor padrão
    Produto(){}
    //sobrecarga do método contrutor
    Produto(int _codigo){
        this.codigo = _codigo;
    }
    //mais uma sobrecarga
    Produto(int _codigo, String _nome){
        this.codigo = _codigo;
        this.nome = _nome;
    }

    public Produto(String nomeProduto) {
        this.nome = nomeProduto;
    }
}
