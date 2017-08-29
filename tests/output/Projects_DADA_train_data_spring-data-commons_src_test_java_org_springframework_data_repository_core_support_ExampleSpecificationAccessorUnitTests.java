<METHOD_START> @ Before public void void ( ) { org.springframework.data.repository.core.support.ExampleSpecificationAccessorUnitTests.Person = new org.springframework.data.repository.core.support.ExampleSpecificationAccessorUnitTests.Person ( ) ; org.springframework.data.repository.core.support.ExampleSpecificationAccessorUnitTests.Person . java.lang.String = STRING ; org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getDefaultStringMatcher ( ) ) . isEqualTo ( StringMatcher . DEFAULT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIncludeNullValues ( ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getNullHandler ( ) ) . isEqualTo ( NullHandler . INCLUDE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIgnorePaths ( STRING ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoredPath ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoredPath ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( org.springframework.data.repository.core.support.ExampleMatcher . getDefaultStringMatcher ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withStringMatcher ( StringMatcher . CONTAINING ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . CONTAINING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIgnoreCase ( ) . withMatcher ( STRING , contains ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIgnoreCase ( ) . withMatcher ( STRING , contains ( ) . caseSensitive ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withMatcher ( STRING , startsWith ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . STARTING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withMatcher ( STRING , contains ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . CONTAINING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withMatcher ( STRING , regex ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . REGEX ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withStringMatcher ( StringMatcher . ENDING ) . withMatcher ( STRING , contains ( ) ) . withMatcher ( STRING , startsWith ( ) ) . withMatcher ( STRING , GenericPropertyMatcher :: ignoreCase ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getPropertySpecifiers ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . CONTAINING ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . ENDING ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . ENDING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withStringMatcher ( StringMatcher . STARTING ) . withMatcher ( STRING , GenericPropertyMatcher :: ignoreCase ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getStringMatcherForPath ( STRING ) ) . isEqualTo ( StringMatcher . STARTING ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.core.support.ExampleMatcher . isIgnoreCaseEnabled ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIgnoreCase ( ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseEnabled ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withIgnoreCase ( STRING ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcher . isIgnoreCaseEnabled ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . isIgnoreCaseForPath ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getValueTransformerForPath ( STRING ) ) . isInstanceOf ( NoOpPropertyValueTransformer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertyValueTransformer org.springframework.data.repository.core.support.PropertyValueTransformer = source -> source . toString ( ) ; org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withTransformer ( STRING , org.springframework.data.repository.core.support.PropertyValueTransformer ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . getValueTransformerForPath ( STRING ) ) . isEqualTo ( org.springframework.data.repository.core.support.PropertyValueTransformer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . hasPropertySpecifiers ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withStringMatcher ( StringMatcher . STARTING ) . withMatcher ( STRING , contains ( ) ) ; org.springframework.data.repository.core.support.ExampleMatcherAccessor = new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) ; assertThat ( org.springframework.data.repository.core.support.ExampleMatcherAccessor . hasPropertySpecifiers ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExampleMatcher org.springframework.data.repository.core.support.ExampleMatcher = ExampleMatcher . matching ( ) . withMatcher ( STRING , exact ( ) ) ; assertThat ( new ExampleMatcherAccessor ( org.springframework.data.repository.core.support.ExampleMatcher ) . getPropertySpecifier ( STRING ) . getStringMatcher ( ) ) . isEqualTo ( StringMatcher . EXACT ) ; }  <METHOD_END>