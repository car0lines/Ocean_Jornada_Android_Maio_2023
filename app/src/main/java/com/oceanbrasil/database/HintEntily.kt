package com.oceanbrasil.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hints")
data class HintEntily(
    @PrimaryKey val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double
)
