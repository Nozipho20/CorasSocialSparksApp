package com.example.corassocialsparksapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var edtTimeInput : EditText
    lateinit var btnSubmit : Button
    lateinit var btnClear: Button
    lateinit var txtShowSuggestion : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edtTimeInput = findViewById(R.id.edtTimeInput)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnClear = findViewById(R.id.btnClear)
        txtShowSuggestion = findViewById(R.id.txtShowSuggestion)


        Log.d("SocialSparks", "Output: Afternoon Spark displayed")
        // THE "GET SPARK" (With Toast for every choice!)
        //Triggered when the user clicks the "Get Spark" button [Ref:6]

        btnSubmit.setOnClickListener {
            val userInput = edtTimeInput.text.toString()

            // LOG:Shows exactly what Cora typed
            //Using Logcat for manual testing and debugging [Ref:4]
            Log.d("SocialSparks", "User clicked Submit. Input: $userInput")
// The Independent Institute of Education, “IMAD5112 Module Manual,” 2026.
            if (userInput == "Morning") {
                txtShowSuggestion.text = "Send a 'Good morning' text to a family member."
                Toast.makeText(this, "Morning Spark Found!", Toast.LENGTH_SHORT).show()
                Log.d("SocialSparks", "Output:Morning Spark displayed")
            } else if (userInput == "Mid-morning") {
                txtShowSuggestion.text = "Reach out to a colleague with a quick 'Thank you.'"
                Toast.makeText(this, "Mid-morning Found!", Toast.LENGTH_SHORT).show()
                Log.d("SocialSparks", "Output: Mid-morning Spark displayed")
            } else if (userInput == "Afternoon") {
                txtShowSuggestion.text = "Share a funny meme or interesting link with a friend."
                Toast.makeText(this, "Afternoon Spark Found!", Toast.LENGTH_SHORT).show()
            } else if (userInput == "After snack time") {
                txtShowSuggestion.text = "Send a quick 'thinking of you' message."
                Toast.makeText(this, "Snack Time Spark Found!", Toast.LENGTH_SHORT).show()
                Log.d("SocialSparks", "Output: Snack Time Spark displayed")
            } else if (userInput == "Dinner") {
                txtShowSuggestion.text = "Call a friend or relative for a 5-minute catch-up."
                Toast.makeText(this, "Dinner Spark Found!", Toast.LENGTH_SHORT).show()
                Log.d("SocialSparks", "Output: Dinner Spark displayed")
            } else if (userInput == "After dinner") {
                txtShowSuggestion.text = "Leave a thoughtful comment on a friend's post."
                Toast.makeText(this, "After dinner Spark Found!", Toast.LENGTH_SHORT).show()
                Log.d("SocialSparks", "Output: After Dinner Spark displayed")
            } else {
                //The "Oops" message if the spelling is wrong
                // Error message for Cora
                txtShowSuggestion.text =
                    "Oops! Use:Morning,Mid-morning,Afternoon,After snack time,Dinner or After dinner"
                Toast.makeText(this, "Check your spelling, Cora!", Toast.LENGTH_SHORT).show()
                // LOG: Useful for seeing what triggered an error
                Log.e("SocialSparks", "Invalid Input Entered: $userInput")
            }
        }

        // THE RESET BUTTON
        btnClear.setOnClickListener {
            //CLEAR THE TYPING BOX
            edtTimeInput.text.clear()

            //Clear the suggestion box
            txtShowSuggestion.text=""
            // Tell Cora it's ready!
            Toast.makeText(this, "Everything Cleared", Toast.LENGTH_SHORT).show()

            // LOG: Confirms the reset worked
            Log.d("SocialSparks", "User clicked Reset. Screen cleared.")
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }}

