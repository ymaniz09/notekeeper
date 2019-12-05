package com.github.ymaniz09.notekeeper.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CourseInfo(val courseId: String, val title: String) : Parcelable {
    override fun toString(): String {
        return title
    }
}