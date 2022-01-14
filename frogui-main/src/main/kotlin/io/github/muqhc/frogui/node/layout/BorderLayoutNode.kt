package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import java.awt.BorderLayout
import java.awt.Component
import javax.swing.JPanel

@FroguiDsl
interface BorderLayoutNode<PanelType : JPanel> : LayoutManagerNode<BorderLayout,PanelType> {
    var center : Component?
    var east : Component?
    var west : Component?
    var north : Component?
    var south : Component?
}