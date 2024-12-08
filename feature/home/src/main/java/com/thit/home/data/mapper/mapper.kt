package com.thit.home.data.mapper

import com.thit.home.data.model.Result
import com.thit.home.domain.model.ResultHomeUI

fun Result.toResultHomeUI(): ResultHomeUI {
    return ResultHomeUI(
        id = id,
        posterPath = posterPath,
        title = title
    )
}