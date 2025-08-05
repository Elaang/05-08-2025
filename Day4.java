public class Day4 {
    public static void main(String[] args) {
        // Data 6 orang
        String[] nama = {
            "Alfonso Kayfas Nugroho",
            "Achmad Riyu Mariadi",
            "Muhammad Falaki Raqilla Al Rabbani",
            "Muhammad Dhiqal Radya Karna",
            "Nasheed Axel Saputra"
        };

        String[] kelas = {
            "10 RPL 7",
            "10 RPL 7",
            "10 RPL 7",
            "10 RPL 7",
            "10 RPL 7"
        };

        String[] hobi = {
            "Bermain Games",
            "Bermain Game dan Menonton Film",
            "Menonton Anime",
            "Melihat Film dan Bermain Game",
            "Bersepeda"
        };
        char[] jenisKelamin = {
            'L',
            'L',
            'L',
            'L',
            'L'
        };

        int[] umur = {
            15,
            15,
            15,
            15,
            15
        };
        String[] citaCita = {
            "Kerja di Luar Negeri",
            "Web Designer",
            "Programmer",
            "Software Engineer",
            "Orang Sukses"
        };

        // Menampilkan data untuk setiap orang
        for (int i = 0; i < nama.length; i++) {
            System.out.println("\nData Orang ke-" + (i + 1));
            inputAndDisplayData(nama[i], kelas[i], hobi[i], jenisKelamin[i], umur[i], citaCita[i]);
        }
    }

    public static void inputAndDisplayData(String nama, String kelas, String hobi, char jenisKelamin, int umur, String citaCita) {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Hobi: " + hobi);
        System.out.println("Umur: " + umur);
        System.out.println("Cita-Cita: " + citaCita);

        if (jenisKelamin == 'L') {
            System.out.println("Jenis Kelamin: Laki-laki");
        } else if (jenisKelamin == 'P') {
            System.out.println("Jenis Kelamin: Perempuan");
        }

    }
}
