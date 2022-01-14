package io.github.muqhc.frogui.builder.panel

import io.github.muqhc.frogui.node.layout.CardLayoutNode
import java.awt.CardLayout
import javax.swing.JPanel

class JPanelCardLayoutBuilder<PanelType : JPanel>(panel: PanelType) : JPanelLayoutBuilder<CardLayout,PanelType>(panel), CardLayoutNode<PanelType> {
    override val layout: CardLayout = CardLayout()

    override val page: CardLayoutNode.PageContainer = object : CardLayoutNode.PageContainer {
        override val data: MutableMap<String, JPanel> = mutableMapOf()

        override fun put(key: String, value: JPanel): JPanel? {
            panel.add(value,key)
            return data.put(key,value)
        }

        override fun putAll(from: Map<out String, JPanel>) =
            from.forEach { (key, value) ->
                data[key] = value
            }
    }

    override fun build(): PanelType = panel
}