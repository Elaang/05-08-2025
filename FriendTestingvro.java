// DRIVER CLASS -> Need Main Method
public class FriendTestingvro {
    public static void main(String[] args) {
        Friend nee = new Friend 
        ("Rafa",15,"Proggramer", "Watcing anime");
        Friend alfon = new Friend(
        "Alfonso", 15, "Kerja di Luar Negeri", "Playing Games");
        Friend dik = new Friend(
            "Dhiqa", 15, "Software Enginner", "Watching Film and Playing a Games"
        );
        Friend riyu = new Friend(
            "Riyu", 15, "Web Designer", "Playing Games and Watching Film"
        );
        Friend roman = new Friend(
            "Rohman", 15, "Web Desginer", "Running away from Reality :heartbreak:"
        );
        nee.print();
        System.out.println("======================");
        alfon.print();
        System.out.println("======================");
        dik.print();
        System.out.println("======================");
        riyu.print();
        System.out.println("======================");
        roman.print();
        System.out.println("======================");
    }
}
