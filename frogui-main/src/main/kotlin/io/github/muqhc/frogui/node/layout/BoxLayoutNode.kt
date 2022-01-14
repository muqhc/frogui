package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import io.github.muqhc.frogui.node.layout.group.SimpleLayoutNodeGroup
import java.awt.Component
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JPanel

@FroguiDsl
interface BoxLayoutNode<PanelType : JPanel> : LayoutManagerNode<BoxLayout,PanelType>, SimpleLayoutNodeGroup {
    var axis: Int
}