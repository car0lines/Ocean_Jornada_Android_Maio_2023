package com.oceanbrasil.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.oceanbrasil.Hint

@Dao
interface HintDao {
    @Insert
    fun insert(hint: HintEntily)

    @Query("SELECT * FROM hints")
    fun findAll(): List<HintEntily>
}
