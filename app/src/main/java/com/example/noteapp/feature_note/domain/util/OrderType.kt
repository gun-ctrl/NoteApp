package com.example.noteapp.feature_note.domain.util

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
