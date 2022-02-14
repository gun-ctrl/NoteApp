package com.example.noteapp.feature_note.presentation.util

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
sealed class Screen(val route:String){
    object NotesScreen:Screen("notes_screen")
    object AddEditNoteScreen:Screen("add_edit_note_screen")
}

