<METHOD_START> @ java.lang.Deprecated public void ( MappingContext < ? extends PersistentEntity < ? , ? > , ? > org.springframework.data.mapping.context.MappingContext<? extends org.springframework.data.mapping.context.PersistentEntity<?,?>,?> ) { this( new PersistentEntities ( java.util.Collections . java.util.List ( org.springframework.data.mapping.context.MappingContext<,> ) ) ); }  <METHOD_END>
<METHOD_START> public void ( PersistentEntities org.springframework.data.mapping.context.PersistentEntities ) { Assert . notNull ( org.springframework.data.mapping.context.PersistentEntities , STRING ) ; this . org.springframework.data.mapping.context.PersistentEntities = org.springframework.data.mapping.context.PersistentEntities ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mapping.context.IsNewStrategy org.springframework.data.mapping.context.IsNewStrategy ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.mapping.context.PersistentEntities . getPersistentEntity ( java.lang.Class<> ) . flatMap ( org.springframework.data.mapping.context.MappingContextIsNewStrategyFactory :: java.util.Optional<org.springframework.data.mapping.context.IsNewStrategy> ) . orElseThrow ( ( ) new MappingException ( String . format ( STRING , type ) ) ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Optional<org.springframework.data.mapping.context.IsNewStrategy> < IsNewStrategy > java.util.Optional<org.springframework.data.mapping.context.IsNewStrategy> ( PersistentEntity < ? , ? > org.springframework.data.mapping.context.PersistentEntity<?,?> ) { if ( org.springframework.data.mapping.context.PersistentEntity<,> . hasVersionProperty ( ) ) { return org.springframework.data.mapping.context.PersistentEntity<,> . getVersionProperty ( ) . map ( it -> PersistentPropertyInspectingIsNewStrategy . of ( it , MappingContextIsNewStrategyFactory :: propertyIsNullOrZeroNumber ) ) ; } else if ( org.springframework.data.mapping.context.PersistentEntity<,> . hasIdProperty ( ) ) { return org.springframework.data.mapping.context.PersistentEntity<,> . getIdProperty ( ) . map ( it -> PersistentPropertyInspectingIsNewStrategy . of ( it , MappingContextIsNewStrategyFactory :: propertyIsNull ) ) ; } return java.util.Optional . java.util.Optional<org.springframework.data.mapping.context.IsNewStrategy> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; return java.util.function.Function<java.util.Optional<java.lang.Object>,java.lang.Boolean> . java.lang.Boolean ( org.springframework.data.mapping.context.PersistentProperty<> . getOwner ( ) . getPropertyAccessor ( java.lang.Object ) . getProperty ( org.springframework.data.mapping.context.PersistentProperty<> ) ) ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { return ! java.util.Optional<java.lang.Object> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ) { return java.util.Optional<java.lang.Object> . java.util.Optional<java.lang.Boolean> ( java.lang.Object -> { if ( ! ( java.lang.Object instanceof java.lang.Number ) ) { return false ; } return ( ( java.lang.Number ) java.lang.Object ) . long ( ) == NUMBER ; } ) . java.lang.Boolean ( true ) ; }  <METHOD_END>
