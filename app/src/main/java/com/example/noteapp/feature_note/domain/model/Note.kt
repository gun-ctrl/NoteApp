package com.example.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.*
import kotlin.Exception

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey
    val id:Int ?=null,
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, RedPink, BabyBlue)
    }
}
class InvalidNoteException(message:String):Exception(message)