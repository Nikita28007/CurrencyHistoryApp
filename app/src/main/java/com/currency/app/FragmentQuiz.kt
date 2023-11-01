package com.currency.app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.lang.StringBuilder

class FragmentQuiz : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.quiz_fragment, container, false)


        view.visibility = View.VISIBLE
        val questions = addDataQuestions()
        val answers = addDataAnswers()
        val options = addDataOptions()
        // val facts = addDataFacts()
        var titleCounter = 1
        var optionsCounter = 2
        var answerCounter = 0
        val answerText = view.findViewById<TextView>(R.id.answerText)
        val title = view.findViewById<TextView>(R.id.questionTitle)
        title.text = questions[0].toString()
        val option1 = view.findViewById<RadioButton>(R.id.radioButton1)
        val option2 = view.findViewById<RadioButton>(R.id.radioButton2)
        val option3 = view.findViewById<RadioButton>(R.id.radioButton3)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroupQuiz)
        option1.text = options[0].toString()
        option2.text = options[1].toString()
        option3.text = options[2].toString()
        view.findViewById<Button>(R.id.checkAnswerButton).setOnClickListener {

            when (radioGroup.checkedRadioButtonId) {
                option1.id -> {

                    if (answers[answerCounter].equals(option1.text.toString())) {
                        answerText.text = StringBuilder("Right")
                    } else {
                        answerText.text = StringBuilder("Wrong")
                    }
                }

                option2.id -> {
                    if (answers[answerCounter].equals(option2.text.toString())) {
                        answerText.text = StringBuilder("Right")
                    } else {
                        answerText.text = StringBuilder("Wrong")
                    }
                }

                option3.id -> {
                    if (titleCounter == 1) answerCounter = 9
                    Log.d("title", titleCounter.toString() + " " + answerCounter)
                    if (answers[answerCounter].equals(option3.text.toString())) {
                        answerText.text = StringBuilder("Right")
                    } else {
                        answerText.text = StringBuilder("Wrong")
                    }
                }

            }


        }
        view.findViewById<Button>(R.id.nextButton).setOnClickListener {
            title.text = questions[titleCounter].toString()
            option1.isChecked = false
            option2.isChecked = false
            option3.isChecked = false
            answerText.text = ""
            for (i in options.keys) {
                option1.text = options[optionsCounter + 1]
                option2.text = options[optionsCounter + 2]
                option3.text = options[optionsCounter + 3]
            }

            titleCounter++
            optionsCounter += 3
            answerCounter++
            if (titleCounter == 10) {
                titleCounter = 0
                optionsCounter = -1

            }
            if (answerCounter == 10)
                answerCounter = 0
        }

        return view
    }

    private fun addDataQuestions(): HashMap<Int, String> {
        val questionsArray = HashMap<Int, String>()

        questionsArray[0] =
            "What is the official currency of Russia?"
        questionsArray[1] =
            "In which year did the United States officially establish the U.S. dollar as its currency?"
        questionsArray[2] =
            "Which European currency was introduced as an accounting currency in 1999 and later with banknotes and coins in 2002?"
        questionsArray[3] = "What is the currency of the United Kingdom?"
        questionsArray[4] =
            "In which year was the Kazakhstani tenge introduced as the official currency of Kazakhstan?"
        questionsArray[5] = "What is the modern version of the Polish currency called?"
        questionsArray[6] =
            "When was the first block of the Bitcoin blockchain mined, marking the creation of Bitcoin as a cryptocurrency?"
        questionsArray[7] =
            "The term \"greenbacks\" is associated with the currency of which country or region?"

        questionsArray[8] =
            "What is the term used for the process by which new bitcoins are created and transactions are added to the public ledger, known as the blockchain?"
        questionsArray[9] =
            "Which European currency's name means \"scale\" or \"balance\" in its native language, referencing its historical use as a measurement for trade?"
        return questionsArray
    }

    private fun addDataAnswers(): HashMap<Int, String> {
        val answersArray = HashMap<Int, String>()

        answersArray[0] = "Ruble"
        answersArray[1] = "1792"
        answersArray[2] = "Euro"
        answersArray[3] = "Pound Sterling"
        answersArray[4] = "1993"
        answersArray[5] = "Zloty"
        answersArray[6] = "2009"
        answersArray[7] = "United States"
        answersArray[8] = "Zloty"
        answersArray[9] = "Tenge"
        return answersArray
    }

    private fun addDataFacts(): HashMap<Int, String> {
        val answersArray = HashMap<Int, String>()

        answersArray[0] =
            "International biathlon competition has been dominated by northern Europeans over the years," +
                    " particularly by athletes from Russia, Finland, Germany, and Norway."
        answersArray[1] =
            "The longest game in NHL history was played on March 24, 1936, " +
                    "between the Detroit Red Wings and the Montreal Maroons." +
                    " It lasted six overtimes, totalling 116 minutes and 30 seconds of extra time."
        answersArray[2] =
            "Sweeping the ice in front of the stone is not just about cleaning the path. " +
                    "The act of sweeping creates friction, which slightly melts the ice, " +
                    "reducing the curl and increasing the stone’s speed and distance traveled."
        answersArray[3] =
            "Depending on paper readings, measurements show that a skater landing a triple or quadruple jump will have a landing force of 5 to 14 times the body weight on impact. " +
                    "Therefore, a male skater weighing 150 pounds can land with a pressure of 1000 pounds!"
        answersArray[4] =
            "There are various styles of snowboarding, including freestyle, freeride, and alpine. Freestyle focuses on tricks, freeride emphasizes natural terrain, and alpine involves racing and carving turns. "
        answersArray[5] =
            "The coveted Stanley Cup outdates the NHL by a full 24 years. That is, " +
                    "the Stanley Cup was created in 1893, while the NHL was officially established in 1917 on November 22"
        answersArray[6] =
            "The resurfacer after scraping the ice, puts a thin layer of water that is heated to 140 to 145 °F" +
                    " (60 to 63°C). Actually, the hotter the water, the more even surface will get! " +
                    "You would think you need cold water to make ice; But hot water contains less " +
                    "oxygen which makes it easier for molecules to bind and freeze."
        answersArray[7] = "During each game, teams only get one 30-second timeout." +
                "Coaches and teams must use this timeout wisely as it is the only time they " +
                "get to huddle and make decisions during the game. Otherwise, they will have to wait " +
                "on intermission and other involuntary timeouts like commercial breaks."
        answersArray[8] =
            "Have you seen the top figure skaters spin on the ice and how their faces are smashed by the speed." +
                    " Have you ever wondered how fast they spin?" +
                    " The answer is that they can reach 6 revolutions per second which is over 300 revolutions per minute!"
        answersArray[9] =
            "The iconic black puck used in hockey is made of vulcanized rubber. Its dense and durable construction allows it to withstand the high-speed impacts and provides excellent glide on the ice."

        return answersArray
    }

    private fun addDataOptions(): HashMap<Int, String> {
        val optionsArray = HashMap<Int, String>()

        optionsArray[0] = "Ruble"
        optionsArray[1] = "Euro"
        optionsArray[2] = "Zloty"

        optionsArray[3] = "1776"
        optionsArray[4] = "1865"
        optionsArray[5] = "1792"

        optionsArray[6] = "Pound Sterling"
        optionsArray[7] = "Euro"
        optionsArray[8] = "Tenge"

        optionsArray[9] = "Pound Sterling"
        optionsArray[10] = "Tenge"
        optionsArray[11] = "Euro"

        optionsArray[12] = "2000"
        optionsArray[13] = "1993"
        optionsArray[14] = "1990"

        optionsArray[15] = "Zloty"
        optionsArray[16] = "Euro"
        optionsArray[17] = "Ruble"

        optionsArray[18] = "2005"
        optionsArray[19] = "2013"
        optionsArray[20] = "2009"

        optionsArray[21] = "United States"
        optionsArray[22] = "Australia"
        optionsArray[23] = "Canada"

        optionsArray[24] = "Exchange"
        optionsArray[25] = "Mining"
        optionsArray[26] = "Cryptography"

        optionsArray[27] = "Zloty"
        optionsArray[28] = "Euro"
        optionsArray[29] = "Tenge"

        return optionsArray
    }
}