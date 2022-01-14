package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.builder.panel.group.JPanelSimpleLayoutBuilderGroup
import io.github.muqhc.frogui.node.layout.NonManagerLayoutNode
import io.github.muqhc.frogui.util.NonLayoutManager
import javax.swing.JPanel

class JPanelNonManagerLayoutBuilder<PanelType : JPanel>(panel: PanelType) : JPanelSimpleLayoutBuilderGroup<NonLayoutManager?,PanelType>(panel), NonManagerLayoutNode<PanelType> {
    override val layout: NonLayoutManager? = null
}
