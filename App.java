public class App {
    public static void main(String[] args) throws Exception {
        Sala s1 = new Sala("Sala 1", true, 8);
        Sala s2 = new SalaReuniao("Sala 2", true, 20, false);
        System.out.println(s1.reservar(6));
        System.out.println(s2.reservar(15));
        System.out.println(s1.reservar(2));
    }
}
