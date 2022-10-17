package it.fscarponi.openseamap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform