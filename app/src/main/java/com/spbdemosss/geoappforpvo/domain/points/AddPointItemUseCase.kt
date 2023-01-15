package com.spbdemosss.geoappforpvo.domain.points

class AddPointItemUseCase(private val pointListRepository: PointListRepository) {
    fun addPointItem(pointItem: PointItem){
        pointListRepository.addPointItem(pointItem)
    }
}