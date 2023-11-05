package com.himanshu.bundlepassingkotlin2

import java.io.Serializable

data class Person(
    val name: String,
    val age: String,
    val place: String
) : Serializable