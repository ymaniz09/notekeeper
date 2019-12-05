package com.github.ymaniz09.notekeeper.model

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    private val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }
}