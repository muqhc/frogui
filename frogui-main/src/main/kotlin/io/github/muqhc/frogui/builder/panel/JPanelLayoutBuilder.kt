package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.builder.FroguiBuilder
import io.github.muqhc.frogui.node.layout.LayoutManagerNode
import java.awt.LayoutManager
import javax.swing.JPanel

abstract class JPanelLayoutBuilder<LayoutType : LayoutManager?,PanelType : JPanel>(
    final override val panel: PanelType
) : FroguiBuilder<PanelType>(), LayoutManagerNode<LayoutType,PanelType> {
    abstract override val layout: LayoutType
    open fun preBuild() {
        panel.layout = layout
    }
}