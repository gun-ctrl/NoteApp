package com.example.noteapp.di

import android.app.Application
import androidx.room.Room
import com.example.noteapp.feature_note.data.data_source.NoteDatabase
import com.example.noteapp.feature_note.data.repository.NoteRepositoryImpl
import com.example.noteapp.feature_note.domain.repository.NoteRepository
import com.example.noteapp.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(application: Application):NoteDatabase{
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase):NoteRepository{
        return NoteRepositoryImpl(database.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNote = GetNote(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNotes = GetNotes(repository)
        )
    }
}