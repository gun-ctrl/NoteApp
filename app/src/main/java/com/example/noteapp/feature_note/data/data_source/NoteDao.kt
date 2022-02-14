package com.example.noteapp.feature_note.data.data_source

import androidx.room.*
import com.example.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
@Dao
interface NoteDao {
    @Query("select * from note_table")
    fun getNotes():Flow<List<Note>>

    @Query("select * from note_table where id=:id")
    suspend fun getNoteById(id:Int):Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}