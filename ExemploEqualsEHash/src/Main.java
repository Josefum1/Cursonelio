public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Lucy", "Lucy@gmail.com");
        Client c2 = new Client("Maria", "Maria@gmail.com");
        Client c3 = new Client("Lucy", "Lucy@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c3));
        System.out.println();
    }
}