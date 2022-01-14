package io.github.muqhc.frogui.myapp

import io.github.muqhc.frogui.*
import java.awt.CardLayout
import java.awt.Color
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel

class CounterPanel(prefix: String, panelRef: JPanel, layoutRef: CardLayout) : JPanel() {
    var value = 0

    val device = JLabel("$value").apply { horizontalAlignment = JLabel.CENTER }

    init {
        borderLayout {
            north = borderLayout {
                center = JLabel(prefix).apply {
                    horizontalAlignment = JLabel.CENTER
                    foreground = Color.LIGHT_GRAY
                }
                east = JButton("->").apply { addActionListener { layoutRef.next(panelRef) } }
                west = JButton("<-").apply { addActionListener { layoutRef.previous(panelRef) } }
            }
            center = gridLayout {
                layout.rows = 2
                +device
                +gridLayout {
                    layout.columns = 2
                    +JButton("-").apply { addActionListener { update(value - 1) } }
                    +JButton("+").apply { addActionListener { update(value + 1) } }
                }
            }
        }
    }

    fun update(value: Int) {
        this.value = value
        device.text = value.toString()
    }
}