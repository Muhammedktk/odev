package M1;

import java.util.Scanner;

public class Kullanicigirisi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String userName, passWord,sifirlendirme, newPassword ;
        System.out.print("ENTER USERNAME :   ");
        userName=inp.nextLine( );
        System.out.print("ENTER PASSWORD :  ");
        passWord=inp.nextLine();

        if (userName.equals("ahmet") && passWord.equals("M1234") ){
            System.out.println(" ***  LOGGED IN  **** ");

        }
        else{
            System.out.println(" WRONG PASSWORD! WANT TO CHANGE PASSWORD? \n yes OR no PLEASE  ");
            sifirlendirme=inp.nextLine();

            if( sifirlendirme.equals("no")){
                System.out.println(" LOGIN TERMINATED ");}

            else if (sifirlendirme.equals("yes")) {
                System.out.println(" NEW PASSWORD PLEASE ");
                newPassword=inp.nextLine();

                if( newPassword.equals("M1234")|| newPassword.equals(passWord)){
                    System.out.println(" WRONG PASSWORD! TRY AGAIN. ");
                }
                else{
                    System.out.println(" PASSWORD HAS BEEN SUCCESSFULLY CHANGED. ");

                }
            }
            else{
                System.out.println(" YOU MADE THE WRONG CHOICE ");

            }

        }
    }
}
