package com.example.marsrover.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [MarsRoverSavedLocalModel::class],
    version = 1,
    exportSchema = false
)
abstract class MarsRoverSavedDatabase : RoomDatabase() {

    abstract fun marsRoverPhotoSavedDao(): MarsRoverSavedPhotoDao

    companion object {
        @Volatile
        private var INSTANCE: MarsRoverSavedDatabase? = null

        fun getInstance(context: Context): MarsRoverSavedDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: BuildDatabase(context).also { INSTANCE = it }
            }

        private fun BuildDatabase(applicationContext: Context) =
            Room.databaseBuilder(
                applicationContext,
                MarsRoverSavedDatabase::class.java,
                "marsRover.db"
            )
                .fallbackToDestructiveMigration()
                .build()
    }
}