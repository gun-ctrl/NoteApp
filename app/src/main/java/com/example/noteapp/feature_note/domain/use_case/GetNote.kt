package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepository

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
class GetNote(
    private val repository: NoteRepository
){
    suspend operator fun invoke(id:Int):Note?{
        return repository.getNoteById(id)
    }
}

