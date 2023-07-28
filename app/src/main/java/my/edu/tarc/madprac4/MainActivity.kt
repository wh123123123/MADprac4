package my.edu.tarc.madprac4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import my.edu.tarc.madprac4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
        R.layout.activity_main)

        binding.buttonCalc.setOnClickListener{
            val age = binding.spinnerAge.selectedItemPosition
            val saving = binding.editTextNumberSaving.text.toString().toFloat()

            val investmentAmount = when(age){
                0 ->
                    if(saving >= 5000){
                        (saving - 5000) * 0.3
                    }else{
                        0.0
                    }

                1 ->
                    if(saving >= 14000){
                        (saving - 14000) * 0.3
                    }else{
                        0.0
                    }


                2 ->
                    if(saving >= 29000){
                        (saving - 29000) * 0.3
                    }else{
                        0.0
                    }

                3 ->
                    if(saving >= 50000){
                        (saving - 50000) * 0.3
                    }else{
                        0.0
                    }

                4 ->
                    if(saving >= 78000){
                        (saving - 78000) * 0.3
                    }else{
                        0.0
                    }

                5 ->
                    if(saving >= 116000){
                        (saving - 116000) * 0.3
                    }else{
                        0.0
                    }

                6 ->
                    if(saving >= 165000){
                        (saving - 165000) * 0.3
                    }else{
                        0.0
                    }

                else ->
                    if(saving >= 228000){
                        (saving - 228000) * 0.3
                    }else{
                        0.0
                    }

            }
            //assign object to the binding class myInvestment
            val investment = Investment(investmentAmount.toString())
            binding.myInvestment = investment



        }

        binding.buttonReset.setOnClickListener {
            val investment = Investment("")
            binding.myInvestment = investment
            binding.editTextNumberSaving.setText("")
            binding.spinnerAge.setSelection(0)
        }



    }
}