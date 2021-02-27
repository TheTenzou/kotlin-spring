package ru.thetenzou.boston.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import ru.thetenzou.boston.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        every { dataSource.retrieveBanks() } returns emptyList()

        val banks = bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}