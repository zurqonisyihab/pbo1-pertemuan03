package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=3;
        switch(jalanJalan){
            case 1:
                System.out.println("kesungai");
                break;
            case 2:
                System.out.println("meunjunan");
                break;
            case 3:
                System.out.println("mendanau");
                break;
            case 4:
                System.out.println("melunta");
                break;
            default:
                System.out.println("menangguk");
                break;
        }
    }
}
