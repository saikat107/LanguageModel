<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; IdentifierAccessor org.springframework.data.mapping.IdentifierAccessor = new TargetAwareIdentifierAccessor ( ( ) sample ) { @ java.lang.Override public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( ) ; } } ; assertThatExceptionOfType ( java.lang.IllegalStateException .class ) . isThrownBy ( ( ) accessor . getRequiredIdentifier ( ) ) . withMessageContaining ( java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( ) ; }  <METHOD_END>
