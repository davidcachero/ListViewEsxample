package com.example.listviewsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = arrayOf(
            "Uno",
            "Dos",
            "Tres",
            "Cuatro",
            "Cinco",
            "Seis",
            "Siete",
            "Ocho",
            "Nueve",
            "Diez",
            "Once",
            "Doce",
            "Trece",
            "Catorce",
            "Quince",
            "Dieciseis",
            "Diecisiete",
            "Dieciocho",
            "Diecinueve",
            "Veinte"

        )

        var listView = findViewById<ListView>(R.id.listView)
        var adapter = ArrayAdapter(this, R.layout.listview_item, array)
        listView.adapter = adapter
        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemValue = listView.getItemAtPosition(position) as String
                Toast.makeText(
                    applicationContext,
                    "Posicion : $position \nValor : $itemValue",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}