package me.kitmorgan.kmnotes.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import me.kitmorgan.kmnotes.entities.Notes

@Dao
interface NotesDao {

    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(note: Notes)
}