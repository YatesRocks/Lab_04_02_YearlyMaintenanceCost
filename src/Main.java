public class Main {
    public static void main(String[] args) {
        int springMaintenance = 128;
        int summerMaintenance = 204;
        int fallMaintenance = 102;
        int winterMaintenance = 329;
        System.out.println("Your maintenance cost by season breakdown: ");
        System.out.println("$" + springMaintenance + "; Spring");
        System.out.println("$" + summerMaintenance + "; Summer");
        System.out.println("$" + fallMaintenance + "; Fall");
        System.out.println("$" + winterMaintenance + "; Winter");
        System.out.println("- - - -");
        int total = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;
        System.out.println("$" + total + "; TOTAL COST");
    }
}