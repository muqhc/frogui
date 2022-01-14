package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import io.github.muqhc.frogui.node.layout.group.SimpleLayoutNodeGroup
import io.github.muqhc.frogui.util.NonLayoutManager
import javax.swing.JPanel

@FroguiDsl
interface NonManagerLayoutNode<PanelType : JPanel> : LayoutManagerNode<NonLayoutManager?,PanelType>, SimpleLayoutNodeGroup