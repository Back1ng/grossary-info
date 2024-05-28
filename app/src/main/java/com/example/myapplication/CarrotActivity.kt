package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CarrotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_carrot)

        // Найдем ImageView и TextView по их идентификаторам
        val imageView: ImageView = findViewById(R.id.imageViewTomato)
        val headingText: TextView = findViewById(R.id.headingText)
        val contentText: TextView = findViewById(R.id.contentText)

        headingText.text = "Морковь"
        contentText.text = "Очарование Оранжевого: Представляем вам самую свежую, сочную и питательную морковь прямиком из наших экологически чистых полей! Насладитесь натуральным вкусом и богатством витаминов, которые только свежая морковь может предложить. Наша морковь идеально подходит для приготовления вкуснейших салатов, супов, закусок и даже десертов. Придайте своему столу яркие краски и здоровый вкус с нашей непревзойденной морковью уже сегодня!"
        // Дополнительный код для управления элементами пользовательского интерфейса
    }
}