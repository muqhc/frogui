package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import io.github.muqhc.frogui.node.layout.group.SimpleLayoutNodeGroup
import java.awt.FlowLayout
import javax.swing.JPanel

@FroguiDsl
interface FlowLayoutNode<PanelType : JPanel> : LayoutManagerNode<FlowLayout,PanelType>, SimpleLayoutNodeGroup