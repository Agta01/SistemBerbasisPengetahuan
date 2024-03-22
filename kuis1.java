public class kuis1 {
    public static void main(String[] args) {
        
        // deklarasi variabel
            boolean a = true, b, c, d, e = true, f, g, h, i, j, k;

        if (a && e) {
            System.out.println("Fakta baru f");
            f = true;
            if (a == true) {
                System.out.println("Fakta baru g");
                g = true;
                if (f == true && g == true) {
                    System.out.println("Fakta baru d");
                    d = true;
                    if (g == true && e == true) {
                        System.out.println("Fakta baru h");
                        h = true;
                        if (g==true) {
                            System.out.println("Fakta baru j");
                            j = true;
                            if (j == true) {
                                System.out.println("Fakta baru k");
                                k = true;
                                System.out.println("Maka k bernilai " + k);
                            }
                        }
                    }
                }
        } 
        
    }
}
}

/*
 Penjelasan : Disini saya hanya mengambil rule yang berkaitan saja 
 dan menghiraukan rule yang tidak berkaitan seperti R1, R2, R7, R8. 
 Pada ke-empat rule itu tidak berhubungan dengan nilai K. 

 Agta Fadjrin Aminullah
 01 / SIB 2C
 2241760072

 */