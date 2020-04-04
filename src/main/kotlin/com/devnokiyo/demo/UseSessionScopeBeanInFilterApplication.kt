package com.devnokiyo.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UseSessionScopeBeanInFilterApplication

fun main(args: Array<String>) {
	runApplication<UseSessionScopeBeanInFilterApplication>(*args)
}
