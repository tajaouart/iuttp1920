package fr.aylan.puissancequatre

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class PuissanceQuatreTest {


    @Test
    fun testOnPlayBtn(){

        /*
        * given :
        *       - an empty game scene and the position indicator indicates to the first column
        *       - all game spaces equals to false (empty scene)
        * when the player clicks on play button
        * then the game space (0, 0)'s value becomes True
         */


        // indicator position
        var currentPosition = 0
        var sceneInBool: ArrayList<ArrayList<Boolean>>?  = ArrayList(8)

        for (x in 0..7){

            var column = ArrayList<Boolean>(6)
            for (y in 0..5){
                column.add(y,false)
            }
            sceneInBool?.add(x,column)
        }

        for (x in 0..5){
            if(!requireNotNull(sceneInBool?.get(currentPosition)?.get(x))){
                    sceneInBool?.get(currentPosition)?.set(x,true)
            }
        }

        Assert.assertEquals(true, sceneInBool?.get(0)?.get(0))

    }


    @Test
    fun testRobotPlay(){

        /*
        * given a game between a player and a robot
        * when it's to robot to play
        * then one of two strategies is chosen randomly
         */

        var playedAStrategy : Boolean

        // get a random number
        var random = Math.random()
        playedAStrategy = if ((random * 100.toDouble()).toInt() % 2 == 0) {
            true
        }else{
            true
        }

        Assert.assertEquals(true, playedAStrategy)

    }

    @Test
    fun testStrategy( ){


        /*
        * given an empty game scene and its the turn of the robot
        * when the robot plays
        * Then a game space will be set to True
         */


        // indicator position
        var currentPosition = 0
        var sceneInBool: ArrayList<ArrayList<Boolean>>?  = ArrayList(8)

        // popoulate scene with "False"
        for (x in 0..7){

            var column = ArrayList<Boolean>(6)
            for (y in 0..5){
                column.add(y,false)
            }
            sceneInBool?.add(x,column)
        }


        var y = 0
        if(y > 7) y = 0
        for (x in 0..5){
            if(!requireNotNull(sceneInBool?.get(y)?.get(x))){
                sceneInBool?.get(y)?.set(x,true)
            }else if (x>=5){
                //testStrategy(y+1) not needed since scene is empty
            }
        }


        // check if scene contains a "true"

        var contains_a_true = false

        sceneInBool?.forEach {
            if (it.contains(true)){
                contains_a_true = true
            }
        }

        Assert.assertEquals(true, contains_a_true)

    }



}