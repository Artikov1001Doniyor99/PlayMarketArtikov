package com.artikov.modul_5_lesson_4_1

import adapter.PlayMarketAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*
import models.GeneralData
import models.Program

class MainActivity : AppCompatActivity() {

    lateinit var generalList:ArrayList<GeneralData>
    lateinit var plauMarketAdapter: PlayMarketAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        loadData()
        plauMarketAdapter = PlayMarketAdapter(generalList)
        rv.adapter = plauMarketAdapter

        supportActionBar?.hide()

    }

    private fun loadData() {

        generalList = ArrayList()
        val program1 = Program(
            R.drawable.johnnytriger,
            "Johnny Triger"
        )
        val program2 = Program(
            R.drawable.racemaster,
            "Race Master"
        )
        val program3 = Program(
            R.drawable.s,
            "Sonic"
        )
        val program4 = Program(
            R.drawable.trojan,
            "Trojan"
        )
        val program5 = Program(
            R.drawable.warandorder,
            "War and Order"
        )
        val program6 = Program(
            R.drawable.clashofclans,
            "Clash of Clans"
        )
        val program7 = Program(
            R.drawable.eightballpool,
            "8 ball pool"
        )
        val program8 = Program(
            R.drawable.mobilelegends,
            "Mobile legends"
        )
        val program9 = Program(
            R.drawable.pubgmobile,
            "Pubg mobile"
        )
        val program10 = Program(
            R.drawable.rideoutheroes,
            "Ride out Heroes"
        )
        val program11 = Program(
            R.drawable.royalmatch,
            "Royal Match"
        )
        val program12 = Program(
            R.drawable.thelorsdsoftherings,
            "The Lords of The Rings"
        )
        generalList.add(GeneralData("Mashhurlar", listOf(program1,program2,program3,program4)))
        generalList.add(GeneralData("O'yinlar", listOf(program5,program6,program7,program8)))
        generalList.add(GeneralData("Tavsiya qilinganlar", listOf(program9,program10,program11,program12)))

    }
}