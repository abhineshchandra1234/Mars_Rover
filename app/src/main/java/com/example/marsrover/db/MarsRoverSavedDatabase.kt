package com.example.marsrover.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MarsRoverSavedLocalModel::class],
    version = 1,
    exportSchema = false
)
abstract class MarsRoverSavedDatabase : RoomDatabase() {

}