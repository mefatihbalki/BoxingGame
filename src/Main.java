public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fatih",10,100, 100, 50,50);
        Fighter f2 = new Fighter("Emre",10,100, 90, 50,50);

        //Maç Çıktısı
        Match match = new Match(f1,f2,90,110);
        match.fight();
    }
}