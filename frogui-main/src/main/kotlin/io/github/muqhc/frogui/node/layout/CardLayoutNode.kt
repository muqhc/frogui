package io.github.muqhc.frogui.node.layout

import io.github.muqhc.frogui.FroguiDsl
import java.awt.CardLayout
import javax.swing.JPanel

@FroguiDsl
interface CardLayoutNode<PanelType : JPanel> : LayoutManagerNode<CardLayout,PanelType> {
    val page: PageContainer

    interface PageContainer: MutableMap<String,JPanel> {
        val data: MutableMap<String, JPanel>
        override val size: Int get() = data.size
        override fun containsKey(key: String): Boolean = data.containsKey(key)
        override fun containsValue(value: JPanel): Boolean = data.containsValue(value)
        override val keys: MutableSet<String> get() = data.keys
        override val values: MutableCollection<JPanel> get() = data.values
        override fun isEmpty(): Boolean = data.isEmpty()
        override fun clear() = data.clear()
        override fun get(key: String): JPanel? = data[key]
        override fun remove(key: String): JPanel? = data.remove(key)
        override val entries: MutableSet<MutableMap.MutableEntry<String, JPanel>>
            get() = data.entries
    }
}