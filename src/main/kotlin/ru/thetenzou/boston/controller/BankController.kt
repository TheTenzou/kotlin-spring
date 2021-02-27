package ru.thetenzou.boston.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.thetenzou.boston.model.Bank
import ru.thetenzou.boston.service.BankService

@RestController
@RequestMapping("api")
class BankController(private val bankService: BankService) {

    @RequestMapping("banks")
    fun getBanks(): Collection<Bank> = bankService.getBanks()
}