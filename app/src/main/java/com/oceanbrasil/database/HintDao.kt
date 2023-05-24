package com.oceanbrasil.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.oceanbrasil.Hint

@Dao
interface HintDao {
    new *
    @Insert
    fun insert (hint: HintEntily)

    new*
    @Query("SELECT * FROM hints")
    fun findAll()
}