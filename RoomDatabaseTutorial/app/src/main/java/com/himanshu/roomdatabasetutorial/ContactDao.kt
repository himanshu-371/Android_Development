package com.himanshu.roomdatabasetutorial

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ContactDao {

    @Insert
    suspend fun insertContact(contact: Contact)

    @Update
    suspend fun updatetContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    //live data + roomDB does not manually requires suspend it automatically implements
    @Query("SELECT * FROM `contact table`")
    fun getContact(): LiveData<List<Contact>>




}