package com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.generic

import java.util.function.Function

/**
 * @author seckinger
 * @since 10/17/16
 */
trait MapConverter<R> implements Function<Object, R> {
    R apply(final obj) {
        obj instanceof Map ?
                apply(obj.values().spliterator()) :
                super.apply(obj)
    }
}
