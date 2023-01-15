package com.spbdemosss.geoappforpvo.domain.points

interface PointListRepository {
    fun addPointItemUseCase(pointItem: PointItem)
    fun deletePointItem(pointItem: PointItem)
    fun editPointItem(pointItem: PointItem)
    fun getPointItem(pointItemId: Int): PointItem
    fun getPointList(): List<PointItem>
}