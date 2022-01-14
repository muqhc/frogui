package io.github.muqhc.frogui.myapp2

import io.github.muqhc.frogui.*
import javax.swing.JButton
import javax.swing.JPanel

fun main() {
    val panel = JPanel() borderLayout {
        north = JButton("I'm north!")

        center = gridLayout {
            layout.rows = 2
            layout.columns = 2

            +JButton("I'm the First!")
            +JButton("I'm the Second!")

            +flowLayout {
                +JButton("[ 1 ]")
                +JButton("[ 2 ]")
                +JButton("[ 3 ]")
            }

            +flowLayout {
                +JButton("[ a ]")
                +JButton("[ b ]")
                +JButton("[ c ]")
            }
        }

        south = JButton("I'm south!")
    }
    panel.asFrame.run {
        title = "Hello Frogui!"
        setSize(400,300)
        isVisible = true
    }
}