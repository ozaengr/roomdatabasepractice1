package com.prac.roomdatabasepractice1

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Contacts::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao() : ContactDao

    companion object{
        @Volatile
        private var INSTANCE: ContactDatabase?= null;

        fun getDatabase(context: Context):ContactDatabase{
            val temp = INSTANCE
            if(temp!=null){
                return temp
            }
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                    ContactDatabase::class.java,"my_database").build()
                INSTANCE = instance
                return instance
            }
        }
    }
}