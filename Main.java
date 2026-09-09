public class Main {
    public static void main() {

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS MANUAL              ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta picareta1 = new Picareta("Madeira",50, 5);

        Picareta picareta2 = new Picareta("Pedra", 70, 8);

        Picareta picareta3= new Picareta("Ferro",100, 12);

        Picareta picareta4 = new Picareta("Ouro", 30, 15);

        Picareta picareta5 = new Picareta("Diamante", 150, 20);

        picareta1.mostrarInfo();
        picareta2.mostrarInfo();
        picareta3.mostrarInfo();
        picareta4.mostrarInfo();
        picareta5.mostrarInfo();

        //Escolhemos a picareta para fabricar
    picareta5.fabricarPicareta(picareta5);

    //Usamos ela para minerar, muda-se os blocos
    picareta5.minerar(picareta5, 50);

    //Queremos reparar a picareta
    System.out.println("\nReparando a picareta de "+ picareta5.material +"...");
    picareta5.repararPicareta(picareta5,30);

    }
}
