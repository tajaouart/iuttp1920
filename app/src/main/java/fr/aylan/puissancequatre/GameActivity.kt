package fr.aylan.puissancequatre

import android.graphics.drawable.Drawable

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class GameActivity : AppCompatActivity() {
    private var listBtnPositions: ArrayList<Int>? = null
    var listGameSpace: ArrayList<ArrayList<Int>>? = null
    private var previousPositionBtn: Button? = null
    private var nextPositionBtn: Button? = null
    private var playBtn: Button? = null
    private var currentPosition = 0
    private var red: Drawable? = null
    private var yellow: Drawable? = null
    var sceneInBool: ArrayList<ArrayList<Boolean>>? = null



    @RequiresApi(api = Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_game)

        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        this.previousPositionBtn = this.findViewById(R.id.previousPositionBtn)
        this.nextPositionBtn = this.findViewById(R.id.nextBtn)

        this.playBtn = this.findViewById(R.id.playBtn)
        this.listBtnPositions = ArrayList(8)
        this.listGameSpace = ArrayList(8)
        this.sceneInBool = ArrayList(8)
        this.initializePositionButtonsList()
        this.initializeGameSpaces()
        this.initializeSceneInBool()

        this.hidePositionButtons()
        this.setVisibility(View.VISIBLE, 0)

        this.red = ContextCompat.getDrawable(this, R.drawable.red_round_button  )
        this.yellow = ContextCompat.getDrawable(this, R.drawable.yellow_round_button  )

    }

    private fun initializeSceneInBool() {





        for (x in 0..7){

            var column = ArrayList<Boolean>(6)
            for (y in 0..5){
                column.add(y,false)
            }

            this.sceneInBool?.add(x,column)
        }

        for (x in 0..7){
            for (y in 0..5) {
                this.sceneInBool?.get(x)?.set(y, false)
            }
        }

    }

    private fun initializeGameSpaces() {

        val listColumn1 : ArrayList<Int>  = ArrayList()
        listColumn1.add(R.id.b_1_6)
        listColumn1.add(R.id.b_1_5)
        listColumn1.add(R.id.b_1_4)
        listColumn1.add(R.id.b_1_3)
        listColumn1.add(R.id.b_1_2)
        listColumn1.add(R.id.b_1_1)


        val listColumn2 : ArrayList<Int>  = ArrayList()
        listColumn2.add(R.id.b_2_6)
        listColumn2.add(R.id.b_2_5)
        listColumn2.add(R.id.b_2_4)
        listColumn2.add(R.id.b_2_3)
        listColumn2.add(R.id.b_2_2)
        listColumn2.add(R.id.b_2_1)

        val listColumn3 : ArrayList<Int>  = ArrayList()
        listColumn3.add(R.id.b_3_6)
        listColumn3.add(R.id.b_3_5)
        listColumn3.add(R.id.b_3_4)
        listColumn3.add(R.id.b_3_3)
        listColumn3.add(R.id.b_3_2)
        listColumn3.add(R.id.b_3_1)

        val listColumn4 : ArrayList<Int>  = ArrayList()
        listColumn4.add(R.id.b_4_6)
        listColumn4.add(R.id.b_4_5)
        listColumn4.add(R.id.b_4_4)
        listColumn4.add(R.id.b_4_3)
        listColumn4.add(R.id.b_4_2)
        listColumn4.add(R.id.b_4_1)

        val listColumn5 : ArrayList<Int>  = ArrayList()
        listColumn5.add(R.id.b_5_6)
        listColumn5.add(R.id.b_5_5)
        listColumn5.add(R.id.b_5_4)
        listColumn5.add(R.id.b_5_3)
        listColumn5.add(R.id.b_5_2)
        listColumn5.add(R.id.b_5_1)

        val listColumn6 : ArrayList<Int>  = ArrayList()
        listColumn6.add(R.id.b_6_6)
        listColumn6.add(R.id.b_6_5)
        listColumn6.add(R.id.b_6_4)
        listColumn6.add(R.id.b_6_3)
        listColumn6.add(R.id.b_6_2)
        listColumn6.add(R.id.b_6_1)

        val listColumn7 : ArrayList<Int>  = ArrayList()
        listColumn7.add(R.id.b_7_6)
        listColumn7.add(R.id.b_7_5)
        listColumn7.add(R.id.b_7_4)
        listColumn7.add(R.id.b_7_3)
        listColumn7.add(R.id.b_7_2)
        listColumn7.add(R.id.b_7_1)

        val listColumn8 : ArrayList<Int>  = ArrayList()
        listColumn8.add(R.id.b_8_6)
        listColumn8.add(R.id.b_8_5)
        listColumn8.add(R.id.b_8_4)
        listColumn8.add(R.id.b_8_3)
        listColumn8.add(R.id.b_8_2)
        listColumn8.add(R.id.b_8_1)


        this.listGameSpace?.add(listColumn1)
        this.listGameSpace?.add(listColumn2)
        this.listGameSpace?.add(listColumn3)
        this.listGameSpace?.add(listColumn4)
        this.listGameSpace?.add(listColumn5)
        this.listGameSpace?.add(listColumn6)
        this.listGameSpace?.add(listColumn7)
        this.listGameSpace?.add(listColumn8)


    }

    private fun initializePositionButtonsList() {
        this.listBtnPositions?.add(R.id.btnPosition0)
        this.listBtnPositions?.add(R.id.btnPosition1)
        this.listBtnPositions?.add(R.id.btnPosition2)
        this.listBtnPositions?.add(R.id.btnPosition3)
        this.listBtnPositions?.add(R.id.btnPosition4)
        this.listBtnPositions?.add(R.id.btnPosition5)
        this.listBtnPositions?.add(R.id.btnPosition6)
        this.listBtnPositions?.add(R.id.btnPosition7)
    }

    private fun hidePositionButtons() {
        this.listBtnPositions?.forEach {
            this.findViewById<ImageView>(it).visibility = View.INVISIBLE
        }
    }


    private fun setVisibility(visibility : Int, position : Int){
        this.findViewById<ImageView>(requireNotNull(this.listBtnPositions?.get(position))).visibility = visibility

    }

    fun nextBtn(view: View){
            if(this.currentPosition ==(this.listBtnPositions?.size?.minus(1)))
                return
            else{
                this.setVisibility(View.INVISIBLE, this.currentPosition)
                this.currentPosition += 1
                this.setVisibility(View.VISIBLE, this.currentPosition)
            }
    }

    fun previousBtn(view: View){
            if(this.currentPosition ==0)
                return
            else{
                this.setVisibility(View.INVISIBLE, this.currentPosition)
                this.currentPosition -= 1
                this.setVisibility(View.VISIBLE, this.currentPosition)
            }
    }


    fun onPlayBtn(view : View){


        for (x in 0..5){
            if(requireNotNull(this.sceneInBool?.get(this.currentPosition)?.get(x)) == false){

                this.listGameSpace?.get(this.currentPosition)?.get(x)?.let {
                    findViewById<Button>(it).background = this.red
                }
                this.sceneInBool?.get(this.currentPosition)?.set(x,true)
                robotPlay(x+1)

                return
            }
        }




    }

    private fun robotPlay(x: Int){
        // rotating or not the ship depending on the random value
        var random = Math.random()
        if ((random * 100.toDouble()).toInt() % 2 == 0) {
            strategy(currentPosition)
        }else{
            strategy(currentPosition+1)
        }

    }


    private fun strategy(y : Int){
        var y = y
        if(y > 7) y = 0
        for (x in 0..5){
            if(!requireNotNull(this.sceneInBool?.get(y)?.get(x))){

                this.listGameSpace?.get(y)?.get(x)?.let {
                    findViewById<Button>(it).background = this.yellow
                }
                this.sceneInBool?.get(y)?.set(x,true)


                return
            }else if (x>=5){
                strategy(y+1)
            }
        }

    }
}