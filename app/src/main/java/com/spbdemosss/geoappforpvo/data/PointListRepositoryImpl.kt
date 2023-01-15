package com.spbdemosss.geoappforpvo.data

import com.spbdemosss.geoappforpvo.domain.points.PointItem
import com.spbdemosss.geoappforpvo.domain.points.PointListRepository

object PointListRepositoryImpl: PointListRepository {

    private val pointList = mutableListOf<PointItem>()

    private var autoIncrementId = 0

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

    override fun getPointList(): List<PointItem> {
        return pointList.toList()
    }
}