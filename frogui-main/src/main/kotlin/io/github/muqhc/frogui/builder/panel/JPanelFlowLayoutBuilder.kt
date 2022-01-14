package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.builder.panel.group.JPanelSimpleLayoutBuilderGroup
import io.github.muqhc.frogui.node.layout.FlowLayoutNode
import java.awt.FlowLayout
import javax.swing.JPanel

class JPanelFlowLayoutBuilder<PanelType : JPanel>(panel: PanelType) : JPanelSimpleLayoutBuilderGroup<FlowLayout,PanelType>(panel), FlowLayoutNode<PanelType> {
    override val layout: FlowLayout = FlowLayout()
}
