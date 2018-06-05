package com.example.stambek.fragmenttrain

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.View
import com.example.stambek.fragmenttrain.Fragments.FragmentOne
import com.example.stambek.fragmenttrain.Fragments.FragmentTwo


class MainActivity : FragmentActivity() {

    var frgOne : FragmentOne? = null
    var frgTwo : FragmentTwo? = null

    var manager : FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = supportFragmentManager

        frgOne = FragmentOne()
        frgTwo = FragmentTwo()
    }
    fun onClickReplace(view:View){
        val transaction = manager!!.beginTransaction()
        when(view.id){
            R.id.replace_one ->
                transaction.replace(R.id.container,frgOne)
            R.id.replace_two ->
                transaction.replace(R.id.container,frgTwo)

        }
        transaction.commit()
    }
}


