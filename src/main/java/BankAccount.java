/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {

        /**  */
        CHECKINGS,

        /**  */
        SAVINGS,

        /**  */
        STUDENT,

        /**  */
        WORKPLACE
    }

    /**  */
    private int accountNumber;

    /**  */
    private BankAccountType accountType;

    /**  */
    private double accountBalance;

    /**  */
    private String ownerName;

    /**  */
    private double interestRate;

    /**  */
    private double interestEarned;

    /**
     *
     * @param name              Owner name.
     * @param accountCategory   test.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;

        Bank.setNumberOfAccount(Bank.getNumberOfAccount() + 1);
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return                  test.
     */
    public final int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param newAccountNumber  test.
     */
    public void setAccountNumber(final int newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    /**
     *
     * @return                  test.
     */
    public final BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param newAccountType    test.
     */
    public void setAccountType(final BankAccountType newAccountType) {
        accountType = newAccountType;
    }

    /**
     *
     * @return                  test.
     */
    public final double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param newAccountBalance test.
     */
    public void setAccountBalance(final double newAccountBalance) {
        accountBalance = newAccountBalance;
    }

    /**
     *
     * @return                  test.
     */
    public final String getAccountOwner() {
        return ownerName;
    }

    /**
     *
     * @param newAccountOwner test.
     */
    public void setAccountOwner(final String newAccountOwner) {
        ownerName = newAccountOwner;
    }

    /**
     *
     * @return                  test.
     */
    public final double getAccountInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param newInterestRate test.
     */
    public void setAccountInterestRate(final double newInterestRate) {
        interestRate = newInterestRate;
    }

    /**
     *
     * @return                  test.
     */
    public final double getAccountInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param newInterestEarned test.
     */
    public void setAccountInterestEarned(final double newInterestEarned) {
        interestEarned = newInterestEarned;
    }

}
