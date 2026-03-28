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


        Log.d("SocialSparks", "Output: Afternoon Spark displayed") ;// ([Reference:2])
        // THE "GET SPARK" (With Toast for every choice!)
        //Triggered when the user clicks the "Get Spark" button

        btnSubmit.setOnClickListener {
            val userInput = edtTimeInput.text.toString()

            // LOG:Shows exactly what Cora typed
            //Using Logcat for manual testing and debugging [Ref:4]
            Log.d("SocialSparks", "User clicked Submit. Input: $userInput") ;//([Reference:2)]

            if (userInput == "Morning") {
                txtShowSuggestion.text = "Send a 'Good morning' text to a family member."
                Toast.makeText(this, "Morning Spark Found!", Toast.LENGTH_SHORT).show() ;//([Reference:4])
                Log.d("SocialSparks", "Output:Morning Spark displayed") ;//([Ref:2])
            } else if (userInput == "Mid-morning") {    ;// ([Reference:3])
                txtShowSuggestion.text = "Reach out to a colleague with a quick 'Thank you.'"
                Toast.makeText(this, "Mid-morning Found!", Toast.LENGTH_SHORT).show()   ;//([Refrence:4])
                Log.d("SocialSparks", "Output: Mid-morning Spark displayed") ;//([Reference:1])
            } else if (userInput == "Afternoon") { ;//([Ref:3])
                txtShowSuggestion.text = "Share a funny meme or interesting link with a friend."
                Toast.makeText(this, "Afternoon Spark Found!", Toast.LENGTH_SHORT).show() ;//([Reference:4])
            } else if (userInput == "After snack time") {  ;//([Reference:3])
                txtShowSuggestion.text = "Send a quick 'thinking of you' message."
                Toast.makeText(this, "Snack Time Spark Found!", Toast.LENGTH_SHORT).show() ;//([Reference:4])
                Log.d("SocialSparks", "Output: Snack Time Spark displayed") ;//([Reference:2])
            } else if (userInput == "Dinner") {  ;//([Reference:3])
                txtShowSuggestion.text = "Call a friend or relative for a 5-minute catch-up."
                Toast.makeText(this, "Dinner Spark Found!", Toast.LENGTH_SHORT).show()    ;//([Reference:4])
                Log.d("SocialSparks", "Output: Dinner Spark displayed") ;//([Reference:1])
            } else if (userInput == "After dinner") {
                txtShowSuggestion.text = "Leave a thoughtful comment on a friend's post."
                Toast.makeText(this, "After dinner Spark Found!", Toast.LENGTH_SHORT).show() ;//([Reference:4])
                Log.d("SocialSparks", "Output: After Dinner Spark displayed") ;//([Reference:1])
            } else {
                //The "Oops" message if the spelling is wrong
                // Error message for Cora
                txtShowSuggestion.text =
                    "Oops! Use:Morning,Mid-morning,Afternoon,After snack time,Dinner or After dinner"
                Toast.makeText(this, "Check your spelling, Cora!", Toast.LENGTH_SHORT).show() ;//[(Ref:1])
                // LOG: Useful for seeing what triggered an error
                Log.e("SocialSparks", "Invalid Input Entered: $userInput") ;// ([Ref:2])
            }
        }

        // THE RESET BUTTON
        btnClear.setOnClickListener {
            //CLEAR THE TYPING BOX
            edtTimeInput.text.clear()

            //Clear the suggestion box
            txtShowSuggestion.text=""
            // Tell Cora it's ready!
            Toast.makeText(this, "Everything Cleared", Toast.LENGTH_SHORT).show() ;// ([Ref:4])

            // LOG: Confirms the reset worked
            Log.d("SocialSparks", "User clicked Reset. Screen cleared.") ;// ([Ref:2])
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        //Reference List:
        //[1] Emeris.,2026. Introduction to Mobile Application Development IMAD5112/p/w Module   Manual. [e-book] Available through the Independent Institution of Education website . Available at:<https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BCA5A47EE-F107-44AD-AB60-6E296E0B3EAE%7D&file=IMAD5112MM.docx&action=default&mobileredirect=true> [Accessed 21 March 2026].
        //[2] Smartherd., 2016 . #12 Android LogCat Tutorial : Android Studio Part – 2. [video online] Available at:<https://youtu.be/QqjrR11tuz0?si=ODGvGgObkT_5oyxu> [Accessed 21 March 2026].
        //[3] Kotlin Docs.,2024. Control flow: if, when for, while. [Online]. Available at: <https://kotlinlang.org/docs/control-flow.html> [Accessed 21 March 2026].
        //[4] Android Developers., 2024. Toasts overview. [online] Available at:<https://developer.android.com/guide/topics/ui/notifiers/toasts> [Accessed 21 March 2026].
        //[5] Google Gemini.2023.Google Gemini(Version 1.0) .[Large language model]. Available at: https://gemini.google.com/ [Accessed: 21 March 2026].
        //[6] Android Developers.,2024. Buttons. [online]. Available at:< https://developer.android.com/develop/ui/views/components/button >  [Accessed 21 March 2026].






        }
    }}

