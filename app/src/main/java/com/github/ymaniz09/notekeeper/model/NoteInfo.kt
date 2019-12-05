package com.github.ymaniz09.notekeeper.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NoteInfo(var course: CourseInfo, var title: String, var text: String) : Parcelable