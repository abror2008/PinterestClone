package com.example.pinterestclone.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SavedImage")
data class SaveImage(
    @PrimaryKey(autoGenerate = true)
    val imageId:Long?=null,
    val url: String,
    val title: String
)