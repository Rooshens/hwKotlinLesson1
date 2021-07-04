package qr.a.rooshen.hwkotlinlesson1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.PI


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputParameter = 1..10
        for (input in inputParameter) {
            val areaRadiusCircle = (PI * input).toInt()
            val areaSquare = (input * input)
            if (areaRadiusCircle > areaSquare) {
                Log.d(
                    "hwkotlinlesson1",
                    "Площадь радиуса круга $areaRadiusCircle >  Площади квадрата $areaSquare"
                )
            } else if (areaSquare > areaRadiusCircle) {
                Log.d(
                    "hwkotlinlesson1",
                    "Площади квадрата $areaSquare >  Площадь радиуса круга $areaRadiusCircle"
                )
            } else if (areaSquare == areaRadiusCircle) {
                //Это условие не отработает никогда :)
                Log.d(
                    "hwkotlinlesson1",
                    "Площадь радиуса круга $areaRadiusCircle =  Площади квадрата $areaSquare"
                )
            }
        }
    }
}