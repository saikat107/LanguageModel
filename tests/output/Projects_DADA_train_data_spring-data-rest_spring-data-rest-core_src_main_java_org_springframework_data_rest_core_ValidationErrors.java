<METHOD_START> public void ( java.lang.Object java.lang.Object , PersistentEntities org.springframework.data.rest.core.PersistentEntities ) { super( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ); Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( org.springframework.data.rest.core.PersistentEntities , STRING ) ; this . org.springframework.data.rest.core.PersistentEntities = org.springframework.data.rest.core.PersistentEntities ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.core.ConfigurablePropertyAccessor org.springframework.data.rest.core.ConfigurablePropertyAccessor ( ) { return new DirectFieldAccessor ( java.lang.Object ( ) ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws org.springframework.data.rest.core.BeansException { java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String . java.lang.String[] ( STRING ) ) ; java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = java.util.Collection<java.lang.String> . java.util.Iterator<java.lang.String> ( ) ; java.lang.Object java.lang.Object = java.lang.Object ; do { java.lang.String java.lang.String = java.util.Iterator<java.lang.String> . java.lang.String ( ) ; java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> < ? extends PersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> = org.springframework.data.rest.core.PersistentEntities . getPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) . flatMap ( it -> it . getPersistentProperty ( PropertyAccessorUtils . getPropertyName ( segment ) ) ) ; java.lang.Object = java.lang.Object ( java.lang.Object , java.util.Optional<> , java.lang.String , java.lang.String ) ; } while ( java.util.Iterator<java.lang.String> . boolean ( ) ); return java.lang.Object ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws org.springframework.data.rest.core.BeansException { java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String . java.lang.String[] ( STRING ) ) ; java.util.Iterator<java.lang.String> < java.lang.String > java.util.Iterator<java.lang.String> = java.util.Collection<java.lang.String> . java.util.Iterator<java.lang.String> ( ) ; java.lang.Object java.lang.Object = java.lang.Object ; do { java.lang.String java.lang.String = java.util.Iterator<java.lang.String> . java.lang.String ( ) ; java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> < ? extends PersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> = org.springframework.data.rest.core.PersistentEntities . getPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) . flatMap ( it -> it . getPersistentProperty ( PropertyAccessorUtils . getPropertyName ( segment ) ) ) ; java.lang.Object = java.lang.Object ( java.lang.Object , java.util.Optional<> , java.lang.String , java.lang.String ) ; } while ( java.util.Iterator<java.lang.String> . boolean ( ) ); return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> < ? extends PersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.rest.core.PersistentProperty<?>> , java.lang.String java.lang.String , java.lang.String java.lang.String ) { return java.util.Optional<> . java.util.Optional<java.lang.Object> ( it -> { ConfigurablePropertyAccessor org.springframework.data.rest.core.ConfigurablePropertyAccessor = it . usePropertyAccess ( ) ? PropertyAccessorFactory . forBeanPropertyAccess ( java.lang.Object ) : PropertyAccessorFactory . forDirectFieldAccess ( java.lang.Object ) ; return org.springframework.data.rest.core.ConfigurablePropertyAccessor . getPropertyValue ( java.lang.String ) ; } ) . orElseThrow ( ( ) new NotReadablePropertyException ( source . getClass ( ) , name ) ) ; }  <METHOD_END>
