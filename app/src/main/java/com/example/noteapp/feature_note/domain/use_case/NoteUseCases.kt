package com.example.noteapp.feature_note.domain.use_case

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
data class NoteUseCases(
    val getNotes:GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)