package dev.jojo.fibonacciseriesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jojo.fibonacciseriesrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numbersList= fibonacci(100)
        println(numbersList)

        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = NumbersRecyclerViewAdapter(numbersList)

    }
    fun fibonacci(size:Int):List<Int>{
        var items = listOf<Int>()
        var num1 = 0
        var num2 = 1
        var numbers = 0

        while (numbers < size){
            var sum = num1 + num2
            num1 = num2

            num2 = sum
             numbers++

            items+=num2
        }
        return items
    }



}

