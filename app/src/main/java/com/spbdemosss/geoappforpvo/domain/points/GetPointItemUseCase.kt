package com.spbdemosss.geoappforpvo.domain.points

class GetPointItemUseCase(private val pointListRepository: PointListRepository) {
    fun getPointItem(pointItemId: Int): PointItem{
        return pointListRepository.getPointItem(pointItemId)
    }
}