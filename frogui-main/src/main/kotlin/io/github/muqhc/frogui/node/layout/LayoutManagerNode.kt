package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.node.component.panel.DirectJPanelBuildingNode
import java.awt.LayoutManager
import javax.swing.JPanel

interface LayoutManagerNode<LayoutType : LayoutManager?, PanelType: JPanel> : DirectJPanelBuildingNode {
    val layout: LayoutType
    val panel: PanelType
    operator fun LayoutType.invoke(applier: LayoutType.() -> Unit) = this.apply(applier)
}