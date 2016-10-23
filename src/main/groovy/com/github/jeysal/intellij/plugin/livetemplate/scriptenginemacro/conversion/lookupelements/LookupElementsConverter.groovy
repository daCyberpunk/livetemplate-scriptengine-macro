package com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.lookupelements

import com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.generic.BaseStreamConverter
import com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.generic.InputStreamConverter
import com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.generic.IterableConverter
import com.github.jeysal.intellij.plugin.livetemplate.scriptenginemacro.conversion.generic.IteratorConverter

/**
 * @author seckinger
 * @since 10/18/16
 */
class LookupElementsConverter extends DefaultLookupElementsConverter implements
        BaseStreamConverter,
        InputStreamConverter,
        IterableConverter,
        IteratorConverter,
        SpliteratorLookupElementsConverter {
}
