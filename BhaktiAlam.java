import java.util.Scanner;

public class BhaktiAlam{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Pilih cottage:harga (weekday) (weekend) (holiday)");
        System.out.println("Duku : 915000 1025000 1225000");
        System.out.println("Jeruk: 915000 1025000 1225000");
        System.out.println(" Alpukat : 575000 695000 895000");
        System.out.println("Jambu Air : 575000 695000 895000");
        System.out.println("Durian : 595000 715000 915000");
        System.out.println("Melon : 595000 715000 915000");
        System.out.println("Blimbing : 495000 575000 755000");
        System.out.println("Mangga : 495000 575000 755000");
        System.out.println("Kedondong : 495000 575000 755000");
        System.out.println("---Contoh : Mangga, weekend ---");

        int harga=0;
        String cottage = data.nextLine();
        String day = data.nextLine();


        if(cottage.equals ("Duku")|| cottage.equals("jeruk")){
            switch(day){
                case "weekday":
                harga = 915000;
                break;

                case "weekend":
                harga = 1025000;
                break;

                case "holiday":
                harga = 1225000;
                break;

                default:
                harga = 0;

            }

         }else if (cottage.equals("Alpukat")|| cottage.equals("Jambu Air")){
            switch(day){
                case "weekday":
                harga = 575000;
                break;

                case "weekend":
                harga = 695000;
                break;

                case "holiday":
                harga = 895000;
                break;

                default:
                harga = 0;
                break;
            }

         }else if (cottage.equals("Durian")|| cottage.equals("Melon")){
            switch(day){
                case "Durian":
                harga = 595000;
                break;

                case "Melon":
                harga = 715000;
                break;

                default:
                harga = 0;
                break;
            }
         }else if (cottage.equals("Blimbing")|| cottage.equals("Mangga")){
            switch(day){
                case "Blimbing":
                harga = 495000;
                break;

                case "Mangga":
                harga = 575000;
                break;

                default:
                harga = 0;
                break;
            }
        } else{
            System.out.println("Maaf inputan anda tidak valid !!");
        }
            
            System.out.println("Cottage yang anda pilih: " + cottage );
            System.out.println("Hari yang anda pilih: " + day );
            System.out.println("Total Biaya: " + harga );


    }
    
}
