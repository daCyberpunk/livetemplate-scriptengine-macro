package com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.lookupelements

import com.intellij.codeInsight.lookup.LookupElement

import java.util.stream.Collectors
import java.util.stream.StreamSupport

/**
 * @author seckinger
 * @since 10/22/16
 */
trait SpliteratorLookupElementsConverter implements LookupElementsConverter<Spliterator> {
    @Override
    LookupElement[] convert(final Spliterator spliterator) {
        StreamSupport.stream(spliterator, false).map(this.&convert).collect(Collectors.toList()).flatten() as LookupElement[]
    }
}
