package ru.thetenzou.boston.datasource.mock

import org.springframework.stereotype.Repository
import ru.thetenzou.boston.datasource.BankDataSource
import ru.thetenzou.boston.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("123", 2.0, 1),
        Bank("101010", 10.0, 5),
        Bank("124534", 3.1, 1),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}