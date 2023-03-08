/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Choose your favourite genre from the following options:");
        for (String genre : UserProfile.genres) {
            System.out.println(genre);
        }
        System.out.print("Genre: ");
        String genre = input.nextLine();
        
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your userProfile was created.");
    }
}
//end class
