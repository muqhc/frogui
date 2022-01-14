package io.github.muqhc.frogui.builder

import io.github.muqhc.frogui.FroguiDsl
import java.awt.Component

@FroguiDsl
abstract class FroguiBuilder<T : Component> {
    abstract fun build() : T
}