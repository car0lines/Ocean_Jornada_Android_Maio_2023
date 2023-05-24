package com.oceanbrasil.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [HintEntily::class],version = 1)
abstract class AppDatabase: RoomDatabase() {
    new *
    abstract fun hintDao (): HintDao

    companion object{
        private var instance: AppDatabase? = null

        new *
        fun getInstance (context: Context): AppDatabase {
            return instance ?: Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "App_database"
            ).build().also { instance = it}
    }
}
}
