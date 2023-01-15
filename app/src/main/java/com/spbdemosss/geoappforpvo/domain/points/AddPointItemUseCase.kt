package com.spbdemosss.geoappforpvo.domain.points

class AddPointItemUseCase(private val pointListRepository: PointListRepository) {
    fun addPointItemUseCase(pointItem: PointItem){
        pointListRepository.addPointItemUseCase(pointItem)
    }
}