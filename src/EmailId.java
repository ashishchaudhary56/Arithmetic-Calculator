import java.util.Scanner;
public class EmailId {
    public static void main(String[] args){
        String[] ashish={"ashish@gmail.com","chaudhary1@gmail.com","111@gmail.com"};
        Scanner ash=new Scanner(System.in);
        System.out.println("which email u want to search");
        String meriMail=ash.nextLine();
        boolean found=false;
        for (String email : ashish) {
            if (email.equals(meriMail)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Email ID is found");
        } else {
            System.out.println("Email ID not found");
        }

        ash.close();
    }

}
