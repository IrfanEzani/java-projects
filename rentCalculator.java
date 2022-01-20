/**
 * 
 * rentCalculator: calculate house rent
 */
public class rentCalculator {
    public static void main(String[] args) {
        double rentPrice = 4750;
        double utilities= 50;
        double roomA, roomB, roomC, roomD;
        int tenant = 6;
        double houseTotal = rentPrice + (utilities*tenant);
        double aRatio = 4.25, bRatio = 4, cRatio = 3.5, dRatio = 3.25;
        double totalRatio = (aRatio*2) + (bRatio*3) + cRatio + dRatio;

        roomA = (houseTotal / totalRatio) * aRatio; 
        roomB = (houseTotal / totalRatio) * bRatio; 
        roomC = (houseTotal / totalRatio) * cRatio; 
        roomD = (houseTotal / totalRatio) * dRatio; 
        
        System.out.println("roomA = " + (int) roomA);
        System.out.println("roomB = " + (int) roomB);
        System.out.println("roomC = " + (int) roomC);
        System.out.println("roomD = " + (int) roomD);
        roomD /= tenant;
        System.out.println("roomA with utilities and D = " + (int)(roomA+roomD));
        System.out.println("roomB with utilities and D = " + (int)(roomB+roomD));
        System.out.println("roomC with utilities and D = " + (int)(roomC+roomD));
        System.out.println("houseTotal = " + (int) houseTotal);

        System.out.println("left:" + (int)((houseTotal - 
        ((roomA * 2)) - ((roomB * 3)) - (roomC) - (roomD * tenant))
        )); 
        
        /*Scanner s = new Scanner(System.in);
        System.out.println("set room A price:");
        roomA = s.nextDouble();
        System.out.println("set room B price:");
        roomB = s.nextDouble();
        System.out.println("set room C price:");
        roomC = s.nextDouble();
        System.out.println("set room D price:");
        roomD = s.nextDouble(); 

        roomA *= 2;
        roomB *= 3;
        System.out.println("total price for all=");
        System.out.println("room A total = " + roomA);
        System.out.println("room B total = " + roomB);
        System.out.println("room C total = " + roomC);
        double total = roomA+roomB+roomC;
        System.out.println("rent price left=" + (fullTotal-total));
        s.close(); */
    }
    
}