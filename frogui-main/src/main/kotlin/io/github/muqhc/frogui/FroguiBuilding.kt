package io.github.muqhc.frogui

import io.github.muqhc.frogui.builder.panel.*
import io.github.muqhc.frogui.node.layout.*
import javax.swing.BoxLayout
import javax.swing.JFrame
import javax.swing.JPanel

fun JPanel.toJFrame() = JFrame().apply { contentPane = this@toJFrame }
val JPanel.asFrame: JFrame get() = this.toJFrame()




infix fun <PanelType : JPanel> PanelType.borderLayout(init: BorderLayoutNode<PanelType>.() -> Unit) =
    JPanelBorderLayoutBuilder(this).apply { preBuild() }.apply(init).build()

infix fun <PanelType : JPanel> PanelType.flowLayout(init: FlowLayoutNode<PanelType>.() -> Unit) =
    JPanelFlowLayoutBuilder(this).apply { preBuild() }.apply(init).build()

fun <PanelType : JPanel> PanelType.boxLayout(axis: Int, init: BoxLayoutNode<PanelType>.() -> Unit) =
    JPanelBoxLayoutBuilder(axis,this).apply { preBuild() }.apply(init).build()

infix fun <PanelType : JPanel> PanelType.gridLayout(init: GridLayoutNode<PanelType>.() -> Unit) =
    JPanelGridLayoutBuilder(this).apply { preBuild() }.apply(init).build()

infix fun <PanelType : JPanel> PanelType.nonManagerLayout(init: NonManagerLayoutNode<PanelType>.() -> Unit) =
    JPanelNonManagerLayoutBuilder(this).apply { preBuild() }.apply(init).build()

infix fun <PanelType : JPanel> PanelType.cardLayout(init: CardLayoutNode<PanelType>.() -> Unit) =
    JPanelCardLayoutBuilder(this).apply { preBuild() }.apply(init).build()

infix fun <PanelType : JPanel> PanelType.boxLayout(init: BoxLayoutNode<PanelType>.() -> Unit) = this.boxLayout(BoxLayout.Y_AXIS,init)

