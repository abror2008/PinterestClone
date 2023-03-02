package com.example.pinterestclone.repository

import android.app.Application
import com.example.pinterestclone.data.local.PinterestDao
import com.example.pinterestclone.data.local.PinterestDataBase
import com.example.pinterestclone.model.SaveImage

class ImageRepository {
    lateinit var pinterestDao: PinterestDao
    constructor(application: Application){
        val db=PinterestDataBase.getInstance(application)
        pinterestDao=db.getImageDao()
    }

    fun saveImage(saveImage: SaveImage){
        pinterestDao.saveImage(saveImage)
    }
    fun loadImages()=pinterestDao.getAllImage()

    fun getImageById(id:Long)=pinterestDao.getImageById(id)

}