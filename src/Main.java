public class Main {
    public static void main(String[] args) {
        // aula introdutória de orientação à objetos
        //criar objetos
        Pessoa adao = new Pessoa();
        //declaração de objetos
        Pessoa qualquer;
        //instanciação do obtjeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
        //definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        //definir comportamento do objeto
        qualquer.falar();
        adao.falar(" baixo");
        //criar mais objetos
        //declarar objeto
        Pessoa rainha;
        // instanciar objetos
        rainha = new Pessoa();
        // definir formato do objeto
        rainha.nome = "";
        rainha.sobrenome = "";
        //defiir com´portamento
        rainha.falar();
        rainha.falar("alto");
        System.out.println(rainha.falar("alto", "grave"));


        Animal cao = new Animal();
        cao.nome = "Pluto";
        cao.comer();

        rainha.comer();


    }
}