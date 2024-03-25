package quizes.q2.lazare_nadaraia_1.sort;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int totalExpenses;

        int Tax = 51;
        float Water = 0.24F;
        float Gas = 2.01F;
        int Electricity = 31;
        int Parking = 89;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {

        int totalRevenue = pricePerCoffee * numCoffeeSold;
        int totalExpenses = totalCostOfBeans + otherExpenses;
        double profitInTetri = totalRevenue - totalExpenses;
        double profitInLaris = profitInTetri / 100.0;
        return profitInLaris;

    }
}
