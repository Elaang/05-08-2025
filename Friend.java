// No need a Main Method
public class Friend {
    //Property
    String nama;
    int usia;
    String citaCita;
    String hobi; 

    //Constructor
    public Friend(String na, int ur, String cc, String hi) {
        nama = na;
        usia = ur;
        citaCita = cc;
        hobi = hi;
    }

    //Method for Property
    public void print() {
        System.out.println(nama);
        System.out.println(usia);
        System.out.println(citaCita);
        System.out.println(hobi);
    }
}
