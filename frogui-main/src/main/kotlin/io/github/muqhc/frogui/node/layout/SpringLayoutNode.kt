package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import javax.swing.JPanel
import javax.swing.SpringLayout

@FroguiDsl
interface SpringLayoutNode<PanelType : JPanel> : LayoutManagerNode<SpringLayout,PanelType>