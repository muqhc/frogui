package io.github.muqhc.frogui.myapp2

import io.github.muqhc.frogui.*
import javax.swing.JButton
import javax.swing.JPanel

fun main() {
    val panel = borderLayout {
        //add component to 'north'
        north = JButton("I'm north!")

        //add component to 'south'
        south = JButton("I'm south!")

        //add component to 'center'
        center = gridLayout { // add inner panel
            layout.columns = 2

            //use 'unary plus' to add component
            +JButton("I'm the First!")

            +flowLayout { // add inner panel
                +JButton("[ 1 ]")
                +JButton("[ 2 ]")
                +JButton("[ 3 ]")
            }
        }
    }
    panel.asFrame.run {
        title = "Hello Frogui!"
        setSize(400,300)
        isVisible = true
    }
}