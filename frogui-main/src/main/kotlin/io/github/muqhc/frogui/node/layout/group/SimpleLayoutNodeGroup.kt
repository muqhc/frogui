package io.github.muqhc.frogui.node.layout.group

import java.awt.Component

interface SimpleLayoutNodeGroup {
    val children: List<Component>
    operator fun <T : Component> T.unaryPlus() : T
}