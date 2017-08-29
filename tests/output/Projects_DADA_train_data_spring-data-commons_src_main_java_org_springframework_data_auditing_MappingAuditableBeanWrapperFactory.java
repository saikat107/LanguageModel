<METHOD_START> public void ( PersistentEntities org.springframework.data.auditing.PersistentEntities ) { Assert . notNull ( org.springframework.data.auditing.PersistentEntities , STRING ) ; this . org.springframework.data.auditing.PersistentEntities = org.springframework.data.auditing.PersistentEntities ; this . java.util.Map<java.lang.Class<?>,org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata> = new java.util.HashMap<java.lang.Class<?>,org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata> <> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.data.auditing.AuditableBeanWrapper> < AuditableBeanWrapper > java.util.Optional<org.springframework.data.auditing.AuditableBeanWrapper> ( java.lang.Object java.lang.Object ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( java.lang.Object ) . java.util.Optional<org.springframework.data.auditing.AuditableBeanWrapper> ( java.lang.Object -> { if ( java.lang.Object instanceof Auditable ) { return super. getBeanWrapperFor ( java.lang.Object ) ; } java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; return org.springframework.data.auditing.PersistentEntities . getPersistentEntity ( java.lang.Class<> ) . map ( entity -> { MappingAuditingMetadata metadata = metadataCache . computeIfAbsent ( type , key -> new MappingAuditingMetadata ( entity ) ) ; return Optional .< AuditableBeanWrapper > ofNullable ( metadata . isAuditable ( ) ? new MappingMetadataAuditableBeanWrapper ( entity . getPropertyAccessor ( it ) , metadata ) : null ) ; } ) . orElseGet ( ( ) super. getBeanWrapperFor ( source ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> public void ( PersistentEntity < ? , ? extends PersistentProperty < ? > > org.springframework.data.auditing.PersistentEntity<?,? extends org.springframework.data.auditing.PersistentProperty<?>> ) { Assert . notNull ( org.springframework.data.auditing.PersistentEntity<,> , STRING ) ; this . java.util.Optional<? extends org.springframework.data.auditing.PersistentProperty<?>> = org.springframework.data.auditing.PersistentEntity<,> . getPersistentProperty ( CreatedBy .class ) ; this . java.util.Optional<? extends org.springframework.data.auditing.PersistentProperty<?>> = org.springframework.data.auditing.PersistentEntity<,> . getPersistentProperty ( CreatedDate .class ) ; this . java.util.Optional<? extends org.springframework.data.auditing.PersistentProperty<?>> = org.springframework.data.auditing.PersistentEntity<,> . getPersistentProperty ( LastModifiedBy .class ) ; this . java.util.Optional<? extends org.springframework.data.auditing.PersistentProperty<?>> = org.springframework.data.auditing.PersistentEntity<,> . getPersistentProperty ( LastModifiedDate .class ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return Optionals . isAnyPresent ( java.util.Optional<> , java.util.Optional<> , java.util.Optional<> , java.util.Optional<> ) ; }  <METHOD_END>
<METHOD_START> public void ( PersistentPropertyAccessor org.springframework.data.auditing.PersistentPropertyAccessor , org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata ) { Assert . notNull ( org.springframework.data.auditing.PersistentPropertyAccessor , STRING ) ; Assert . notNull ( org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata , STRING ) ; this . org.springframework.data.auditing.PersistentPropertyAccessor = org.springframework.data.auditing.PersistentPropertyAccessor ; this . org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata = org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata . java.util.Optional<> . void ( it -> this . org.springframework.data.auditing.PersistentPropertyAccessor . setProperty ( it , java.util.Optional . java.util.Optional<java.lang.Object> ( java.lang.Object ) ) ) ; return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ( java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ) { return java.time.temporal.TemporalAccessor ( org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata . java.util.Optional<> , java.time.temporal.TemporalAccessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return T ( org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata . java.util.Optional<> , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<java.time.temporal.TemporalAccessor> < java.time.temporal.TemporalAccessor > java.util.Optional<java.time.temporal.TemporalAccessor> ( ) { return getAsTemporalAccessor ( org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata . java.util.Optional<> . java.util.Optional ( org.springframework.data.auditing.PersistentPropertyAccessor :: getProperty ) , java.time.LocalDateTime .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ( java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ) { return java.time.temporal.TemporalAccessor ( org.springframework.data.auditing.MappingAuditableBeanWrapperFactory.MappingAuditingMetadata . java.util.Optional<> , java.time.temporal.TemporalAccessor ) ; }  <METHOD_END>
<METHOD_START> private < T , P extends org.springframework.data.auditing.PersistentProperty<?> < ? > > T T ( java.util.Optional<P> < P > java.util.Optional<P> , T T ) { java.util.Optional<P> . void ( P -> this . org.springframework.data.auditing.PersistentPropertyAccessor . setProperty ( P , java.util.Optional . java.util.Optional<T> ( T ) ) ) ; return T ; }  <METHOD_END>
<METHOD_START> private < P extends org.springframework.data.auditing.PersistentProperty<?> < ? > > java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ( java.util.Optional<P> < P > java.util.Optional<P> , java.time.temporal.TemporalAccessor java.time.temporal.TemporalAccessor ) { java.util.Optional<P> . void ( P -> this . org.springframework.data.auditing.PersistentPropertyAccessor . setProperty ( P , java.util.Optional . java.util.Optional ( getDateValueToSet ( java.time.temporal.TemporalAccessor , P . getType ( ) , org.springframework.data.auditing.PersistentPropertyAccessor . getBean ( ) ) ) ) ) ; return java.time.temporal.TemporalAccessor ; }  <METHOD_END>
