package com.github.ymaniz09.notekeeper.model

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
        var note = courses["android_intents"]?.let {
            NoteInfo(
                it,
                "Learning Android Intents",
                "Simple note"
            )
        }
        if (note != null) {
            notes.add(note)
        }

        note =
            courses["android_async"]?.let { NoteInfo(it, "Learning AsyncTasks", "Simple note 2") }
        if (note != null) {
            notes.add(note)
        }
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