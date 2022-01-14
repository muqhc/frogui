package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import io.github.muqhc.frogui.node.layout.group.SimpleLayoutNodeGroup
import java.awt.GridLayout
import javax.swing.JPanel

@FroguiDsl
interface GridLayoutNode<PanelType : JPanel> : LayoutManagerNode<GridLayout,PanelType>, SimpleLayoutNodeGroup