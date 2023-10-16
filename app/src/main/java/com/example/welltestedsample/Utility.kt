package com.example.welltestedsample

object Utility {

    fun filterBlackItems(items: List<String>): List<String> {
        return items.filter { !it.equals("black", true) }
    }

}