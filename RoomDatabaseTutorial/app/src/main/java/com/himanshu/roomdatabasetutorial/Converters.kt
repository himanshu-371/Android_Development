package com.himanshu.roomdatabasetutorial

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    //SQLite DB only supports few DataTypes
    //we cannot save Date DataType into DB so we convert Date into Long
    @TypeConverter
    fun fromDataToLong(value: Date): Long{

        return value.time  //returns Long DataType

    }

    @TypeConverter
    fun fromLongToDate(value: Long): Date{

        return Date(value)  //returns Long DataType

    }

}