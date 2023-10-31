package com.currency.app

class Currency_obj() {
    var image = 0
    lateinit var name: String
    var year = 0

    constructor(image: Int, name: String) : this() {
        this.image = image
        this.name = name
    }

    constructor(image: Int, name: String, year: Int) : this() {
        this.image = image
        this.name = name
        this.year = year
    }
}