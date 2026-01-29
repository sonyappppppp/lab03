package com.example.lab03

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим кнопки
        val newEntryButton: Button = findViewById(R.id.newEntryButton)
        val historyButton: Button = findViewById(R.id.historyButton)
        val statsButton: Button = findViewById(R.id.statsButton)
        val settingsButton: Button = findViewById(R.id.settingsButton)

        // Обработчики нажатия
        newEntryButton.setOnClickListener {
            Toast.makeText(this, "Создание новой записи", Toast.LENGTH_SHORT).show()
        }

        historyButton.setOnClickListener {
            Toast.makeText(this, "Просмотр истории", Toast.LENGTH_SHORT).show()
        }

        statsButton.setOnClickListener {
            Toast.makeText(this, "Просмотр статистики", Toast.LENGTH_SHORT).show()
        }

        settingsButton.setOnClickListener {
            Toast.makeText(this, "Открытие настроек", Toast.LENGTH_SHORT).show()
        }
    }
}