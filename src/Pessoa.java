public class Pessoa extends Animal{
    //atributos da classe

    String sobrenome;

    //métodos da classe
    public void falar() {
        System.out.println("falei");
    }
    // Sobrecarga do metodo
    public void falar(String volume) {
        System.out.println("falei" + volume);
    }

    public String falar(String volume, String tom) {
        return "falei" + volume + " e " + tom;
    }

    //sobrescrita de metodo
    public void comer() {
       System.out.println("comeu como pessoa");
    }
}