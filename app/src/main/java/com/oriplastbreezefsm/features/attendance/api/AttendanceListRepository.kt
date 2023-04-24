package com.oriplastbreezefsm.features.attendance.api

import com.oriplastbreezefsm.features.attendance.model.AttendanceRequest
import com.oriplastbreezefsm.features.attendance.model.AttendanceResponse
import com.oriplastbreezefsm.features.attendance.model.DayStartEndListResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class AttendanceListRepository(val apiService: AttendanceListApi) {
    fun getAttendanceList(attendanceRequest: AttendanceRequest?): Observable<AttendanceResponse> {
        return apiService.getAttendanceList(attendanceRequest)
    }

    fun getDayStartEndList(attendanceRequest: AttendanceRequest?): Observable<DayStartEndListResponse> {
        return apiService.getDayStartEndListAPI(attendanceRequest)
    }
}