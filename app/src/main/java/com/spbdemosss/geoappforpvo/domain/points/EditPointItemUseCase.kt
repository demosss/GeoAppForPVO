package com.spbdemosss.geoappforpvo.domain.points

class EditPointItemUseCase(private val pointListRepository: PointListRepository) {
    fun editPointItem(pointItem: PointItem){
        pointListRepository.editPointItem(pointItem)
    }
}