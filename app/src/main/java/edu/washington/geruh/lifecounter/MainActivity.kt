package edu.washington.geruh.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAssignEvent()
    }

    private fun btnAssignEvent() {
        p1MinusOne.setOnClickListener{updateLifePoints("player1", p1MinusOne.text.toString())}
        p1MinusFive.setOnClickListener{updateLifePoints("player1", p1MinusFive.text.toString())}
        p1PlusOne.setOnClickListener{updateLifePoints("player1", p1PlusOne.text.toString())}
        p1PlusFive.setOnClickListener{updateLifePoints("player1", p1PlusFive.text.toString())}

        p2MinusOne.setOnClickListener{updateLifePoints("player2", p2MinusOne.text.toString())}
        p2MinusFive.setOnClickListener{updateLifePoints("player2", p2MinusFive.text.toString())}
        p2PlusOne.setOnClickListener{updateLifePoints("player2", p2PlusOne.text.toString())}
        p2PlusFive.setOnClickListener{updateLifePoints("player2", p2PlusFive.text.toString())}

        p3MinusOne.setOnClickListener{updateLifePoints("player3", p3MinusOne.text.toString())}
        p3MinusFive.setOnClickListener{updateLifePoints("player3", p3MinusFive.text.toString())}
        p3PlusOne.setOnClickListener{updateLifePoints("player3", p3PlusOne.text.toString())}
        p3PlusFive.setOnClickListener{updateLifePoints("player3", p3PlusFive.text.toString())}

        p4MinusOne.setOnClickListener{updateLifePoints("player4", p4MinusOne.text.toString())}
        p4MinusFive.setOnClickListener{updateLifePoints("player4", p4MinusFive.text.toString())}
        p4PlusOne.setOnClickListener{updateLifePoints("player4", p4PlusOne.text.toString())}
        p4PlusFive.setOnClickListener{updateLifePoints("player4", p4PlusFive.text.toString())}

    }

    private fun updateLifePoints(player: String, value: String) {
        val currentPlayerLP = findViewById<TextView>(resources.getIdentifier(player, "id", getPackageName()))
        var currentLifePoints = currentPlayerLP.text.substring(15).toInt()
        var damage: String
        if (value == "-" || value == "+") {
            damage = value + "1"
        } else {
            damage = value
        }
        var newScore = currentLifePoints + damage.toInt()
        if (newScore <= 0) {
            results.text = "${player.take(1).toUpperCase() + player.substring(1,6) + " " + player.substring(6)} LOSES!"
        }
        currentPlayerLP.text = currentPlayerLP.text.substring(0, 15) + (newScore)
    }
}
