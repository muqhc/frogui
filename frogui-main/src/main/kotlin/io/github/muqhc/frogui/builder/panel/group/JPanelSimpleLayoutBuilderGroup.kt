package io.github.muqhc.frogui.builder.panel.group

import io.github.muqhc.frogui.builder.panel.JPanelLayoutBuilder
import io.github.muqhc.frogui.node.layout.group.SimpleLayoutNodeGroup
import java.awt.BorderLayout
import java.awt.Component
import java.awt.FlowLayout
import java.awt.LayoutManager
import javax.swing.JPanel

abstract class JPanelSimpleLayoutBuilderGroup<LayoutType : LayoutManager?,PanelType : JPanel>(panel: PanelType) : JPanelLayoutBuilder<LayoutType,PanelType>(panel), SimpleLayoutNodeGroup {
    private val _children: MutableList<Component> = mutableListOf()
    override val children: List<Component>
        get() = _children
    override fun <T : Component> T.unaryPlus(): T = apply { _children += this; panel.add(this) }
    override fun build(): PanelType = panel
    abstract override val layout: LayoutType
}