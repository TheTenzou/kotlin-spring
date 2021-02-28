package ru.thetenzou.boston.datasource

import ru.thetenzou.boston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}