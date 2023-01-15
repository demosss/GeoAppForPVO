package com.spbdemosss.geoappforpvo.domain.points

import androidx.lifecycle.LiveData

class GetPointListUseCase(private val pointListRepository: PointListRepository) {
    fun getPointList(): LiveData<List<PointItem>>{
        return pointListRepository.getPointList()
    }
}