package com.github.ymaniz09.notekeeper.model

class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}