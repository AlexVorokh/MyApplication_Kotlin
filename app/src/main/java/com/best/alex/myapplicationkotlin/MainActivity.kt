package com.best.alex.myapplicationkotlin


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private var countString = ""
    private var count: Int = 0
    //Вывод всплывающего сообщения по нажатию на кнопку TOAST
    fun toastMe (view: View){
        //Toast.makeText(this, сообщение(message), продолжительность(duration))
        val myToast = makeText(this, "Счёт: ${textView.text}", Toast.LENGTH_SHORT)

        myToast.show()
    }
    //Увеличение счётчика по нажатию на кнопку ADD 1 POINT
    fun countAdd(view: View) {
        countString = textView.text.toString()//принимаем значение текстового поля TextView
        count = Integer.parseInt(countString)// конвертируем полученное значение в число
        count++
        textView.text = count.toString()//отображаем новое значение в TextView
    }
    //Сброс счётчика по нажатию на кнопку RESET COUNT
    fun resetCount(view: View) {
        count = 0
        textView.text = count.toString()//отображаем новое значение в TextView
    }
    //Переход на 2ое активити по нажатию на кнопку RANDOM
    fun randomMe(view: View) {
        //Создаём Intent для запуста второго активити
        val randomIntent = Intent(this, SecondActivity::class.java)
        //Заупск нового активити
        startActivity(randomIntent)
    }
    //Кнопка перехода на активити с Java кодом
    fun GoJavaCode(view: View){
        val JavaCodeIntent = Intent(this, Java_Main::class.java)
        startActivity(JavaCodeIntent)
    }
    //Кнопка перехода на активити с обучением View
    fun GoViewApplication(view: View){
        val Go_View_Application = Intent(this, View_Activity_Application::class.java)
        startActivity(Go_View_Application)
    }
}
