package ru.thetenzou.boston.service

import org.springframework.stereotype.Service
import ru.thetenzou.boston.datasource.BankDataSource
import ru.thetenzou.boston.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}