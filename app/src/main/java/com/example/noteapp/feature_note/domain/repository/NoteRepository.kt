package com.example.noteapp.feature_note.domain.repository

import com.example.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
interface NoteRepository {

    fun getNotes():Flow<List<Note>>

    suspend fun getNoteById(id:Int):Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}