package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.builder.panel.group.JPanelSimpleLayoutBuilderGroup
import io.github.muqhc.frogui.node.layout.GridLayoutNode
import java.awt.GridLayout
import javax.swing.JPanel

class JPanelGridLayoutBuilder<PanelType : JPanel>(panel: PanelType) : JPanelSimpleLayoutBuilderGroup<GridLayout,PanelType>(panel), GridLayoutNode<PanelType> {
    override val layout: GridLayout = GridLayout()
}
