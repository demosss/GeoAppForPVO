package com.spbdemosss.geoappforpvo.presentation.points

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.spbdemosss.geoappforpvo.data.PointListRepositoryImpl
import com.spbdemosss.geoappforpvo.domain.points.DeletePointItemUseCase
import com.spbdemosss.geoappforpvo.domain.points.EditPointItemUseCase
import com.spbdemosss.geoappforpvo.domain.points.GetPointListUseCase
import com.spbdemosss.geoappforpvo.domain.points.PointItem

class MainPointViewModel: ViewModel() {
    private val repository = PointListRepositoryImpl

    private val getPointListUseCase = GetPointListUseCase(repository)
    private val deletePointItemUseCase = DeletePointItemUseCase(repository)
    private val editPointItemUseCase = EditPointItemUseCase(repository)

    val pointList = getPointListUseCase.getPointList()


    fun deletePointItem(pointItem: PointItem){
        deletePointItemUseCase.deletePointItem(pointItem)
    }
}