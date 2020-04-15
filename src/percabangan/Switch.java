package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs     :\"terimakasih pak\"");
                System.out.println("Dosen   :\"Selamat lahh !!\"");
                break;
            case 'B':
                System.out.println("Mhs     :\"nah, kenapa ulun kada dapat A, pak\"");
                System.out.println("Dosen   :\"pian tu terlalu pintar beuntung ai\"");
                break;
            case 'C':
                System.out.println("Mhs     :\"ulun tugas ngumpul tarus pak ai\"");
                System.out.println("Dosen   :\"hiih ikam ngumpul, tapi jawaban nya kdda\"");
                System.out.println("Mhs     :\"hhihihiii,\"");
                break;
            default:
                System.out.println("Mhs     :\"ulun turun tarus pak ai makul pian\"");
                System.out.println("Dosen   :\"hadang lahhhh\"");
                System.out.println("Dosen   :\"*meriks absen\"");
                System.out.println("Dosen   :\"mana suah ikam masuk kelas haur membolos ja\"");
                System.out.println("Mhs     :\"aja maaf pak\"");
                break;
        }
    }
}
