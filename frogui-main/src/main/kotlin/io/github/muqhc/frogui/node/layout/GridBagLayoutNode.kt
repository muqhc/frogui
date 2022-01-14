package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import java.awt.GridBagLayout
import javax.swing.JPanel

@FroguiDsl
interface GridBagLayoutNode<PanelType : JPanel> : LayoutManagerNode<GridBagLayout,PanelType> {
}