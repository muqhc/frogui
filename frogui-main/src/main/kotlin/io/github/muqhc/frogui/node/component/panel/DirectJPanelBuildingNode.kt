package io.github.muqhc.frogui.node.component.panel

import io.github.muqhc.frogui.*
import io.github.muqhc.frogui.node.layout.*
import javax.swing.JPanel

interface DirectJPanelBuildingNode {
    fun borderLayout(init: BorderLayoutNode<JPanel>.() -> Unit) = JPanel().borderLayout(init)
    fun flowLayout(init: FlowLayoutNode<JPanel>.() -> Unit) = JPanel().flowLayout(init)
    fun boxLayout(axis: Int,init: BoxLayoutNode<JPanel>.() -> Unit) = JPanel().boxLayout(axis,init)
    fun gridLayout(init: GridLayoutNode<JPanel>.() -> Unit) = JPanel().gridLayout(init)
    fun nonManagerLayout(init: NonManagerLayoutNode<JPanel>.() -> Unit) = JPanel().nonManagerLayout(init)
    fun cardLayout(init: CardLayoutNode<JPanel>.() -> Unit) = JPanel().cardLayout(init)

    fun boxLayout(init: BoxLayoutNode<JPanel>.() -> Unit) = JPanel().boxLayout(init)
}