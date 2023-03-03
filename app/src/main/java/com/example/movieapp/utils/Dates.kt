package com.example.movieapp.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

object Dates {
    private var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    fun formatterDate(date: String): String {
        val parseDate = LocalDate.parse(date);
        return parseDate.format(formatter);
    }
}