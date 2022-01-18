import java.util.Scanner;
/**
 * 
 * rentCalculator: calculate house rent
 */
public class rentCalculator {
    public static void main(String[] args) {
        int rentPrice = 3725;
        int roomA, roomB, roomC, sharedRoom;
        
        Scanner s = new Scanner(System.in);
        System.out.println("set room A price:");
        roomA = s.nextInt();
        System.out.println("set room B price:");
        roomB = s.nextInt();
        System.out.println("set room C price:");
        roomC = s.nextInt();

        sharedRoom = (rentPrice - roomA - (roomB * 2) - roomC) / 2;
        System.out.println("total price for all=");
        System.out.println("room A=" + roomA);
        System.out.println("room B=" + roomB);
        System.out.println("room C=" + roomC);
        System.out.println("shared room=" + sharedRoom);
        s.close();
    }
    
}