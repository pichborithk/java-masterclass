package Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        var branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        var branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (var branch : branches) {
            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        var branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            var customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                var customer = customers.get(i);
                System.out.printf("Customer: %s[%d]%n", customer.getName(), i + 1);
                if (printTransactions) {
                    System.out.println("Transactions");
                    var transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.printf("[%d]  Amount %.2f%n", j + 1, transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
