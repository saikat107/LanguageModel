<METHOD_START> public void ( java.lang.Iterable<? extends org.springframework.data.mapping.context.MappingContext<?,?>> < ? extends MappingContext < ? , ? > > java.lang.Iterable<? extends org.springframework.data.mapping.context.MappingContext<?,?>> ) { Assert . notNull ( java.lang.Iterable<> , STRING ) ; this . org.springframework.data.mapping.context.Streamable<? extends org.springframework.data.mapping.context.MappingContext<?,?>> = Streamable . of ( java.lang.Iterable<> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>>> < PersistentEntity < ? , ? extends PersistentProperty < ? > > > java.util.Optional<org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>>> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.mapping.context.Streamable<> . stream ( ) . filter ( it -> it . hasPersistentEntityFor ( type ) ) . findFirst ( ) . map ( it -> it . getRequiredPersistentEntity ( type ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>> < ? , ? extends PersistentProperty < ? > > org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return java.util.Optional<org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>>> ( java.lang.Class<> ) . orElseThrow ( ( ) new IllegalArgumentException ( String . format ( STRING , type ) ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mapping.context.Streamable<org.springframework.data.mapping.context.TypeInformation<?>> < TypeInformation < ? > > org.springframework.data.mapping.context.Streamable<org.springframework.data.mapping.context.TypeInformation<?>> ( ) { return Streamable . of ( org.springframework.data.mapping.context.Streamable<> . stream ( ) . flatMap ( it -> it . getManagedTypes ( ) . stream ( ) ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.Set<java.lang.Object>> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>>> < PersistentEntity < ? , ? extends PersistentProperty < ? > > > java.util.Iterator<org.springframework.data.mapping.context.PersistentEntity<?,? extends org.springframework.data.mapping.context.PersistentProperty<?>>> ( ) { return org.springframework.data.mapping.context.Streamable<> . stream ( ) .< PersistentEntity < ? , ? extends PersistentProperty < ? > > > flatMap ( it -> it . getPersistentEntities ( ) . stream ( ) ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) . iterator ( ) ; }  <METHOD_END>
