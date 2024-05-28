package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TomatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tomatoes)

        // Найдем ImageView и TextView по их идентификаторам
        val imageView: ImageView = findViewById(R.id.imageViewTomato)
        val headingText: TextView = findViewById(R.id.headingText)
        val contentText: TextView = findViewById(R.id.contentText)

        headingText.text = "Помидоры"
        contentText.text = "Солнечная Магия: Наши помидоры — это истинное воплощение вкуса и пользы! Спелые, сочные, насыщенного красного цвета, они выращены с любовью и заботой на экологически чистых полях. Каждый помидор наполнен витаминами и антиоксидантами, которые укрепляют здоровье и дарят бодрость. Идеально подходят для салатов, соусов, пиццы и множества других блюд. Откройте для себя мир кулинарных шедевров с нашими восхитительными помидорами. Сделайте свой стол ярче и вкуснее уже сегодня!"
    }
}