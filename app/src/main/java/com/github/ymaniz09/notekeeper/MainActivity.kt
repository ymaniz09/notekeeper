package com.github.ymaniz09.notekeeper

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.github.ymaniz09.notekeeper.model.CourseInfo
import com.github.ymaniz09.notekeeper.model.DataManager
import com.github.ymaniz09.notekeeper.model.NoteInfo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val adapterCourses = ArrayAdapter<CourseInfo>(
            this,
            android.R.layout.simple_spinner_item,
            DataManager.courses.values.toList()
        )

        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerCourses.adapter = adapterCourses

        val parcelableExtra =
            intent.getParcelableExtra<NoteInfo>(CourseAdapter.CourseHolder.NOTE_INFO_KEY)

        if (parcelableExtra != null) {
            displayNote(parcelableExtra as NoteInfo)
        }
    }

    private fun displayNote(noteInfo: NoteInfo) {
        textNoteTitle.setText(noteInfo.title)
        textNoteText.setText(noteInfo.text)

        val coursePosition = DataManager.courses.values.indexOf(noteInfo.course)
        spinnerCourses.setSelection(coursePosition)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
