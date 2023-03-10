package com.spbdemosss.geoappforpvo.domain.points

import androidx.lifecycle.LiveData

interface PointListRepository {
    fun addPointItem(pointItem: PointItem)
    fun deletePointItem(pointItem: PointItem)
    fun editPointItem(pointItem: PointItem)
    fun getPointItem(pointItemId: Int): PointItem
    fun getPointList(): LiveData<List<PointItem>>
}