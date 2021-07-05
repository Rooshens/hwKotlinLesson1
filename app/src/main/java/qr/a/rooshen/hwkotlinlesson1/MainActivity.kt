package qr.a.rooshen.hwkotlinlesson1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.PI


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputParameter = generateRandomNumber(10)
        val areaCircle = (PI * inputParameter * inputParameter)
        val areaSquare = (inputParameter * inputParameter).toDouble()
        Log.d("hwkotlinlesson1", "Рандомное число $inputParameter")
        when (inputParameter > 0) {
            areaCircle > areaSquare -> Log.d(
                "hwkotlinlesson1",
                "Площадь радиуса круга $areaCircle >  Площади квадрата $areaSquare"
            )
            areaSquare > areaCircle -> Log.d(
                "hwkotlinlesson1",
                "Площади квадрата $areaSquare >  Площадь радиуса круга $areaCircle"
            )
            areaSquare == areaCircle -> Log.d(
                "hwkotlinlesson1",
                "Площадь радиуса круга $areaCircle =  Площади квадрата $areaSquare"
            )
        }

    }

    private fun generateRandomNumber(Range: Int): Int {
        return Range + (Math.random() * Range).toInt()
    }
}