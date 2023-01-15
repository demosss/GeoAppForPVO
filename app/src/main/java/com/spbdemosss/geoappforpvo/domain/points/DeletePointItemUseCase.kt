package com.spbdemosss.geoappforpvo.domain.points

class DeletePointItemUseCase(private val pointListRepository: PointListRepository) {
    fun deletePointItem(pointItem: PointItem){
        pointListRepository.addPointItemUseCase(pointItem)
    }
}