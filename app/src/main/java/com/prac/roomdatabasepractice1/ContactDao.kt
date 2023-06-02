package com.prac.roomdatabasepractice1

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ContactDao {

    @Insert
     fun insertContact(contacts: Contacts)

    @Update
     fun updateContact(contacts: Contacts)

    @Delete
     fun deleteContact(contacts: Contacts)

    @Query("SELECT * FROM contact")
    fun getAllContacts(): LiveData<List<Contacts>>
}