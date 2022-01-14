package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.builder.panel.group.JPanelSimpleLayoutBuilderGroup
import io.github.muqhc.frogui.node.layout.BoxLayoutNode
import javax.swing.BoxLayout
import javax.swing.JPanel

class JPanelBoxLayoutBuilder<PanelType : JPanel>(override var axis: Int = BoxLayout.Y_AXIS, panel: PanelType) : JPanelSimpleLayoutBuilderGroup<BoxLayout,PanelType>(panel), BoxLayoutNode<PanelType> {
    override val layout: BoxLayout = BoxLayout(panel,axis)
}
