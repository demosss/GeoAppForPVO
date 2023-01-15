package com.spbdemosss.geoappforpvo.domain.points

data class PointItem(
    val namePoint: String,
    val xCoordinatePoint: Int,
    val zoneNumberPoint: Int,
    val yCoordinatePoint:Int,
    val heightPoint: Int,
    var idPoint: Int = UNDEFINED_ID
){
    companion object{
        const val UNDEFINED_ID = -1
    }
}
