package com.spbdemosss.geoappforpvo.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.spbdemosss.geoappforpvo.domain.points.PointItem
import com.spbdemosss.geoappforpvo.domain.points.PointListRepository

object PointListRepositoryImpl: PointListRepository {

    private val pointListLD = MutableLiveData<List<PointItem>>()

    private val pointList = mutableListOf<PointItem>()

    private var autoIncrementId = 0

    init{
        for (i in 0 until 10){
            val item = PointItem("Point $i", 1,2,3,4)
            addPointItem(item)
        }
    }

    override fun addPointItem(pointItem: PointItem) {
        if (pointItem.idPoint == PointItem.UNDEFINED_ID){
            pointItem.idPoint = autoIncrementId++
        }
        pointList.add(pointItem)
    }

    override fun deletePointItem(pointItem: PointItem) {
        pointList.remove(pointItem)
    }

    override fun editPointItem(pointItem: PointItem) {
        val oldElement = getPointItem(pointItem.idPoint)
        pointList.remove(pointItem)
        addPointItem(pointItem)
    }

    override fun getPointItem(pointItemId: Int): PointItem {
        return pointList.find {
            it.idPoint == pointItemId
        } ?: throw RuntimeException("Element with id $pointItemId not found")
    }

    override fun getPointList(): LiveData<List<PointItem>> {
        return pointListLD
    }

    private fun updateList(){
        pointListLD.value = pointList.toList()
    }
}