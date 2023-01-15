package com.spbdemosss.geoappforpvo.domain.points

class GetPointListUseCase(private val pointListRepository: PointListRepository) {
    fun getPointList(): List<PointItem>{
        return pointListRepository.getPointList()
    }
}