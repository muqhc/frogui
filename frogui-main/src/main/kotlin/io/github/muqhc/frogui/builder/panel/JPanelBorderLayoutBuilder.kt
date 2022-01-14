package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.node.layout.BorderLayoutNode
import java.awt.BorderLayout
import java.awt.Component
import javax.swing.JPanel

class JPanelBorderLayoutBuilder<PanelType : JPanel>(panel: PanelType) : JPanelLayoutBuilder<BorderLayout,PanelType>(panel), BorderLayoutNode<PanelType> {
    override val layout: BorderLayout = BorderLayout()

    override var center: Component? = null
    override var east: Component? = null
    override var west: Component? = null
    override var north: Component? = null
    override var south: Component? = null

    override fun build(): PanelType = panel.apply {
        layout = this@JPanelBorderLayoutBuilder.layout
        listOf(
            center to BorderLayout.CENTER,
            east to BorderLayout.EAST,
            west to BorderLayout.WEST,
            north to BorderLayout.NORTH,
            south to BorderLayout.SOUTH
        ).forEach { (component,tag) -> component?.let { add(it, tag) } }
    }
}