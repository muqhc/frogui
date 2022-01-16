package io.github.muqhc.frogui.myapp3

import io.github.muqhc.frogui.*
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

class CounterPanel() : JPanel() {
    var value = 0

    val device = JLabel("$value").apply { horizontalAlignment = JLabel.CENTER }

    init {
        gridLayout {
            layout.rows = 2
            +device
            +gridLayout {
                layout.columns = 2
                +JButton("-").apply { addActionListener { update(value - 1) } }
                +JButton("+").apply { addActionListener { update(value + 1) } }
            }
        }
    }

    fun update(value: Int) {
        this.value = value
        device.text = value.toString()
    }
}

fun main() {
    CounterPanel().gridLayout {
        layout.rows = 3
        +JButton("Reset!").apply { addActionListener { panel.update(0) } }
    }.asFrame.run {
        setSize(400,300)
        isVisible = true
    }
}