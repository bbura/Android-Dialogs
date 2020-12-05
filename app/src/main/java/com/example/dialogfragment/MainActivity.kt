package com.example.dialogfragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePicker(view: View) {
        val newFragment: DialogFragment = BlankFragment()
        newFragment.show(supportFragmentManager, "datePicker")
    }

    fun processDatePickerResult(year: Int, month: Int, day: Int) {
        val month_string = (month + 1).toString()
        val day_string = day.toString()
        val year_string = year.toString()
        val dateMessage = month_string +
                "/" + day_string + "/" + year_string

        Toast.makeText(this, "Date: $dateMessage",
                Toast.LENGTH_SHORT).show()
    }

}