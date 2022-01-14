package io.github.muqhc.frogui.myapp

import io.github.muqhc.frogui.*
import java.awt.Color
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.BorderFactory
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.system.exitProcess

class MyApp : JFrame() {

    init {

        title = "MyApp!!!!"

        setSize(400,300)
        isResizable = false

        contentPane as JPanel cardLayout  {
            for (i in 1..4) page["$i"] = CounterPanel("PAGE $i",panel,layout).apply { border = BorderFactory.createLineBorder(Color.DARK_GRAY) }
            layout.show(panel,"4")
        }

        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(e: WindowEvent?) {
                exitProcess(0)
            }
        })

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApp().isVisible = true
        }
    }
}