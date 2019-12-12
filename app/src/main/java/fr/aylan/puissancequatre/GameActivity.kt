package fr.aylan.puissancequatre

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class GameActivity : AppCompatActivity() {
    var listtBtnPositions: ArrayList<Int>? = null
    var previousPositionBtn: Button? = null
    var nextPositionBtn: Button? = null
    var playbtn: Button? = null
    var currentPosition = 0



    @RequiresApi(api = Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        //Remove notification bar


        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        previousPositionBtn = findViewById(R.id.previousPositionBtn)
        nextPositionBtn = findViewById(R.id.nextBtn)

        playbtn = findViewById(R.id.playBtn)
        listtBtnPositions = ArrayList()
        listtBtnPositions?.add(R.id.btnPosition0)
        listtBtnPositions?.add(R.id.btnPosition1)
        listtBtnPositions?.add(R.id.btnPosition2)
        listtBtnPositions?.add(R.id.btnPosition3)
        listtBtnPositions?.add(R.id.btnPosition4)
        listtBtnPositions?.add(R.id.btnPosition5)
        listtBtnPositions?.add(R.id.btnPosition6)
        listtBtnPositions?.add(R.id.btnPosition7)
        hidePositionButtons()
        setVisibility(View.VISIBLE, 0)





    }

    private fun hidePositionButtons() {
        listtBtnPositions?.forEach {
            findViewById<ImageView>(it).visibility = View.INVISIBLE
        }
    }


    fun setVisibility(visibility : Int, position : Int){
        findViewById<ImageView>(requireNotNull(listtBtnPositions?.get(position))).visibility = visibility

    }

    fun nextBtn(view: View){
            if(currentPosition==(listtBtnPositions?.size?.minus(1)))
                return
            else{
                setVisibility(View.INVISIBLE, currentPosition)
                currentPosition += 1
                setVisibility(View.VISIBLE, currentPosition)
            }
    }

    fun previousBtn(view: View){
            if(currentPosition==0)
                return
            else{
                setVisibility(View.INVISIBLE, currentPosition)
                currentPosition -= 1
                setVisibility(View.VISIBLE, currentPosition)
            }
    }
}