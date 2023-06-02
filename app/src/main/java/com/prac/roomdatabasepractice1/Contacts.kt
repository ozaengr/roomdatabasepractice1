package com.prac.roomdatabasepractice1

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
data class Contacts(

    @PrimaryKey(autoGenerate = true)
    var id : Long,
    var name : String,
    var number : String,
)


