package com.oriplast.features.task.api

import com.oriplast.features.timesheet.api.TimeSheetApi
import com.oriplast.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}