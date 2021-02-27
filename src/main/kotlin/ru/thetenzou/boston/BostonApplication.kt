package ru.thetenzou.boston

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BostonApplication

fun main(args: Array<String>) {
	runApplication<BostonApplication>(*args)
}
