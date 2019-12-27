package pl.itger.polishAPI.utils;

/**
 * ISO 20022 CashAccountTypeCode
 * Specifies the nature, or use, of the cash account.
 *
 */
public enum ISO_20022_cash_account_type {
    CASH("CashPayment", "Account used for the payment of cash."),
    CHAR("Charges", "Account used for charges if different from the account for payment."),
    COMM("Commission", "Account used for commission if different from the account for payment."),
    TAXE("Tax", "Account used for taxes if different from the account for payment."),
    CISH("CashIncome", "Account used for payment of income if different from the current cash account."),
    TRAS("CashTrading", "Account used for trading if different from the current cash account."),
    SACC("Settlement", "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system."),
    CACC("Current", "Account used to post debits and credits when no specific account has been nominated."),
    SVGS("Savings", "Account used for savings."),
    ONDP("OverNightDeposit", "Account used for overnight deposits."),
    MGLD("MarginalLending", "Account used for a marginal lending facility."),
    NREX("NonResidentExternal", "Account used for non-resident external."),
    MOMA("MoneyMarket", "Account used for money markets if different from the cash account."),
    LOAN("Loan", "Account used for loans."),
    SLRY("Salary", "Accounts used for salary payments."),
    ODFT("Overdraft", "Account is used for overdrafts."),
    LEND("Lending", "Account is for the coverage of lending."),
    COLL("Collateral", "Account is for collateral."),
    SETT("FinancialSettlement", "Account is for financial settlements."),
    MARR("MarginReturn", "Account is for margin returns."),
    SEGT("Segregated", "Account is an segregated account.");

    public String description;
    public String definition;

    ISO_20022_cash_account_type(String description, String definition) {
        this.description = description;
        this.definition = definition;
    }
}
