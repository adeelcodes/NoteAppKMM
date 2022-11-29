package com.example.noteappkmm.domain.note

import com.example.noteappkmm.presentation.*
import kotlinx.datetime.LocalDateTime

// exposing the data from sqldelight to be used throughout the app

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
