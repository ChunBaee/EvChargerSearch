package com.jcorp.e_vap.model

data class StatusModel(
    var statNm: String?,
    var statId: String?,
    var chgerId: Int?,
    var chgerType: Int?,
    var addr: String?,
    var location: String?,
    var lat: Double?,
    var lng: Double?,
    var useTime: String?,
    var busiId: String?,
    var bnm: String?,
    var busiNm: String?,
    var busiCall: String?,
    var stat: Int?,
    var statUpdDt: Long?,
    var lastTsdt: Long?,
    var lastTedt: Long?,
    var nowTsdt: Long?,
    var powerType: String?,
    var output: Int?,
    var method: String?,
    var zcode: Int?,
    var parkingFree: String?,
    var note: String?,
    var limitYn: String?,
    var limitDetail: String?,
    var delYn: String?,
    var delDetail: String?
)
