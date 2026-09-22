<<<<<<< HEAD
public class problem2 {

    static String findDuplicateTeam(String[] teamNames) {

        for (int i = 0; i < teamNames.length; i++) {

            for (int j = i + 1; j < teamNames.length; j++) {

                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }

    public static void main(String[] args) {

        String[] teamNames = {
            "ByteForce",
            "CodeCrafters",
            "ByteForce"
        };

        System.out.println(findDuplicateTeam(teamNames));
=======
class MessWallet{

    private double balance;

    // Constructor
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance. Starting with 0.");
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    // Add money
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct money
    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Deduction rejected: amount must be greater than 0");
        } else if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}


public class problem2 {

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);

        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
>>>>>>> c0eef5d7687aa3bbed511b71bf9f17b11c8456ba
    }
}
