package com.example.welltestedsample

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class UtilityTest {

    @Test
    fun filterBlackItems() {
        val items = listOf("red", "green", "blue", "black", "white", "Black")
        val filteredItems = Utility.filterBlackItems(items)
        assertEquals(4, filteredItems.size)
        assertFalse(filteredItems.contains("black"))
    }

}