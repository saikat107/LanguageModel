<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String[] = new java.lang.String [] { java.lang.String } ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( SharedCacheMode org.springframework.orm.jpa.persistenceunit.SharedCacheMode ) { this . org.springframework.orm.jpa.persistenceunit.SharedCacheMode = org.springframework.orm.jpa.persistenceunit.SharedCacheMode ; }  <METHOD_END>
<METHOD_START> public void void ( ValidationMode org.springframework.orm.jpa.persistenceunit.ValidationMode ) { this . org.springframework.orm.jpa.persistenceunit.ValidationMode = org.springframework.orm.jpa.persistenceunit.ValidationMode ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,javax.sql.DataSource> < java.lang.String , javax.sql.DataSource > java.util.Map<java.lang.String,javax.sql.DataSource> ) { this . org.springframework.orm.jpa.persistenceunit.DataSourceLookup = new MapDataSourceLookup ( java.util.Map<java.lang.String,javax.sql.DataSource> ) ; }  <METHOD_END>
<METHOD_START> public void void ( DataSourceLookup org.springframework.orm.jpa.persistenceunit.DataSourceLookup ) { this . org.springframework.orm.jpa.persistenceunit.DataSourceLookup = ( org.springframework.orm.jpa.persistenceunit.DataSourceLookup != null ? org.springframework.orm.jpa.persistenceunit.DataSourceLookup : new JndiDataSourceLookup ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.jpa.persistenceunit.DataSourceLookup org.springframework.orm.jpa.persistenceunit.DataSourceLookup ( ) { return this . org.springframework.orm.jpa.persistenceunit.DataSourceLookup ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> public javax.sql.DataSource javax.sql.DataSource ( ) { return this . javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> public javax.sql.DataSource javax.sql.DataSource ( ) { return this . javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> public void void ( PersistenceUnitPostProcessor ... org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ) { this . org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] = org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor [] org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ( ) { return this . org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( LoadTimeWeaver org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver ) { this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver = org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver ( ) { return this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.orm.jpa.persistenceunit.ResourceLoader ) { this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver = ResourcePatternUtils . getResourcePatternResolver ( org.springframework.orm.jpa.persistenceunit.ResourceLoader ) ; this . org.springframework.orm.jpa.persistenceunit.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( org.springframework.orm.jpa.persistenceunit.ResourceLoader . getClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver == null && InstrumentationLoadTimeWeaver . isInstrumentationAvailable ( ) ) { this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver = new InstrumentationLoadTimeWeaver ( this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver . getClassLoader ( ) ) ; } void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.Set<java.lang.String> . void ( ) ; this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . clear ( ) ; java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> < SpringPersistenceUnitInfo > java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> = java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> ( ) ; for ( SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo : java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> ) { if ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitRootUrl ( ) == null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setPersistenceUnitRootUrl ( java.net.URL ( ) ) ; } if ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getJtaDataSource ( ) == null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setJtaDataSource ( this . javax.sql.DataSource ) ; } if ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getNonJtaDataSource ( ) == null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setNonJtaDataSource ( this . javax.sql.DataSource ) ; } if ( this . org.springframework.orm.jpa.persistenceunit.SharedCacheMode != null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setSharedCacheMode ( this . org.springframework.orm.jpa.persistenceunit.SharedCacheMode ) ; } if ( this . org.springframework.orm.jpa.persistenceunit.ValidationMode != null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setValidationMode ( this . org.springframework.orm.jpa.persistenceunit.ValidationMode ) ; } if ( this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver != null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . init ( this . org.springframework.orm.jpa.persistenceunit.LoadTimeWeaver ) ; } else { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . init ( this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver . getClassLoader ( ) ) ; } void ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ) ; java.lang.String java.lang.String = org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitName ( ) ; if ( ! this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) && ! boolean ( ) ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ) . java.lang.StringBuilder ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitRootUrl ( ) ) . append ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . get ( java.lang.String ) . getPersistenceUnitRootUrl ( ) ) ; throw new java.lang.IllegalStateException ( java.lang.StringBuilder . java.lang.String ( ) ) ; } this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . put ( java.lang.String , org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> < SpringPersistenceUnitInfo > java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> ( ) { java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> < SpringPersistenceUnitInfo > java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> = new java.util.LinkedList<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> <> ( ) ; java.lang.String java.lang.String = this . java.lang.String ; boolean boolean = ( this . java.lang.String[] != null || this . java.lang.String[] != null ) ; boolean boolean = false ; PersistenceUnitReader org.springframework.orm.jpa.persistenceunit.PersistenceUnitReader = new PersistenceUnitReader ( this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver , this . org.springframework.orm.jpa.persistenceunit.DataSourceLookup ) ; SpringPersistenceUnitInfo [] org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo[] = org.springframework.orm.jpa.persistenceunit.PersistenceUnitReader . readPersistenceUnitInfos ( this . java.lang.String[] ) ; for ( SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo : org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo[] ) { java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> . add ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ) ; if ( java.lang.String != null && java.lang.String . boolean ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitName ( ) ) ) { boolean = true ; } } if ( boolean ) { if ( boolean ) { if ( org.springframework.orm.jpa.persistenceunit.Log . isInfoEnabled ( ) ) { org.springframework.orm.jpa.persistenceunit.Log . info ( STRING + java.lang.String + STRING + STRING ) ; } } else { java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> . add ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ( ) ) ; } } return java.util.List<org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo> ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ( ) { SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo = new SpringPersistenceUnitInfo ( ) ; org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setPersistenceUnitName ( this . java.lang.String ) ; org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setExcludeUnlistedClasses ( true ) ; if ( this . java.lang.String[] != null ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { if ( this . org.springframework.orm.jpa.persistenceunit.CandidateComponentsIndex != null ) { void ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo , java.lang.String ) ; } else { void ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo , java.lang.String ) ; } } } if ( this . java.lang.String[] != null ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . addMappingFileName ( java.lang.String ) ; } } else { Resource org.springframework.orm.jpa.persistenceunit.Resource = org.springframework.orm.jpa.persistenceunit.Resource ( ) ; if ( org.springframework.orm.jpa.persistenceunit.Resource != null ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . addMappingFileName ( java.lang.String ) ; if ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitRootUrl ( ) == null ) { try { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setPersistenceUnitRootUrl ( PersistenceUnitReader . determinePersistenceUnitRootUrl ( org.springframework.orm.jpa.persistenceunit.Resource ) ) ; } catch ( java.io.IOException java.io.IOException ) { org.springframework.orm.jpa.persistenceunit.Log . debug ( STRING , java.io.IOException ) ; } } } } return org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ; }  <METHOD_END>
<METHOD_START> private void void ( SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo , java.lang.String java.lang.String ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( AnnotationTypeFilter org.springframework.orm.jpa.persistenceunit.AnnotationTypeFilter : java.util.Set<org.springframework.orm.jpa.persistenceunit.AnnotationTypeFilter> ) { java.util.Set<java.lang.String> . boolean ( this . org.springframework.orm.jpa.persistenceunit.CandidateComponentsIndex . getCandidateTypes ( java.lang.String , org.springframework.orm.jpa.persistenceunit.AnnotationTypeFilter . getAnnotationType ( ) . getName ( ) ) ) ; } java.util.Set<java.lang.String> . void ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo :: addManagedClassName ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = this . org.springframework.orm.jpa.persistenceunit.CandidateComponentsIndex . getCandidateTypes ( java.lang.String , STRING ) ; java.util.Set<java.lang.String> . void ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo :: addManagedPackage ) ; }  <METHOD_END>
<METHOD_START> private void void ( SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo , java.lang.String java.lang.String ) { try { java.lang.String java.lang.String = ResourcePatternResolver . CLASSPATH_ALL_URL_PREFIX + ClassUtils . convertClassNameToResourcePath ( java.lang.String ) + java.lang.String ; Resource [] org.springframework.orm.jpa.persistenceunit.Resource[] = this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver . getResources ( java.lang.String ) ; MetadataReaderFactory org.springframework.orm.jpa.persistenceunit.MetadataReaderFactory = new CachingMetadataReaderFactory ( this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver ) ; for ( Resource org.springframework.orm.jpa.persistenceunit.Resource : org.springframework.orm.jpa.persistenceunit.Resource[] ) { if ( org.springframework.orm.jpa.persistenceunit.Resource . isReadable ( ) ) { MetadataReader org.springframework.orm.jpa.persistenceunit.MetadataReader = org.springframework.orm.jpa.persistenceunit.MetadataReaderFactory . getMetadataReader ( org.springframework.orm.jpa.persistenceunit.Resource ) ; java.lang.String java.lang.String = org.springframework.orm.jpa.persistenceunit.MetadataReader . getClassMetadata ( ) . getClassName ( ) ; if ( boolean ( org.springframework.orm.jpa.persistenceunit.MetadataReader , org.springframework.orm.jpa.persistenceunit.MetadataReaderFactory ) ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . addManagedClassName ( java.lang.String ) ; if ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getPersistenceUnitRootUrl ( ) == null ) { java.net.URL java.net.URL = org.springframework.orm.jpa.persistenceunit.Resource . getURL ( ) ; if ( ResourceUtils . isJarURL ( java.net.URL ) ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . setPersistenceUnitRootUrl ( ResourceUtils . extractJarFileURL ( java.net.URL ) ) ; } } } else if ( java.lang.String . boolean ( java.lang.String ) ) { org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . addManagedPackage ( java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - java.lang.String . int ( ) ) ) ; } } } } catch ( java.io.IOException java.io.IOException ) { throw new PersistenceException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( MetadataReader org.springframework.orm.jpa.persistenceunit.MetadataReader , MetadataReaderFactory org.springframework.orm.jpa.persistenceunit.MetadataReaderFactory ) throws java.io.IOException { for ( TypeFilter org.springframework.orm.jpa.persistenceunit.TypeFilter : java.util.Set<org.springframework.orm.jpa.persistenceunit.AnnotationTypeFilter> ) { if ( org.springframework.orm.jpa.persistenceunit.TypeFilter . match ( org.springframework.orm.jpa.persistenceunit.MetadataReader , org.springframework.orm.jpa.persistenceunit.MetadataReaderFactory ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> private java.net.URL java.net.URL ( ) { if ( this . java.lang.String == null ) { return null ; } try { java.net.URL java.net.URL = this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver . getResource ( this . java.lang.String ) . getURL ( ) ; return ( ResourceUtils . isJarURL ( java.net.URL ) ? ResourceUtils . extractJarFileURL ( java.net.URL ) : java.net.URL ) ; } catch ( java.io.IOException java.io.IOException ) { throw new PersistenceException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.persistenceunit.Resource org.springframework.orm.jpa.persistenceunit.Resource ( ) { Resource org.springframework.orm.jpa.persistenceunit.Resource = this . org.springframework.orm.jpa.persistenceunit.ResourcePatternResolver . getResource ( this . java.lang.String + java.lang.String ) ; if ( org.springframework.orm.jpa.persistenceunit.Resource . exists ( ) ) { try { Resource org.springframework.orm.jpa.persistenceunit.Resource = org.springframework.orm.jpa.persistenceunit.Resource . createRelative ( java.lang.String ) ; if ( ! org.springframework.orm.jpa.persistenceunit.Resource . exists ( ) ) { return org.springframework.orm.jpa.persistenceunit.Resource ; } } catch ( java.io.IOException java.io.IOException ) { return org.springframework.orm.jpa.persistenceunit.Resource ; } } return null ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo ( java.lang.String java.lang.String ) { PersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo = this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . get ( java.lang.String ) ; return ( MutablePersistenceUnitInfo ) org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ; }  <METHOD_END>
<METHOD_START> protected void void ( MutablePersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo ) { PersistenceUnitPostProcessor [] org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] = org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ( ) ; if ( org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] != null ) { for ( PersistenceUnitPostProcessor org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor : org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor[] ) { org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor . postProcessPersistenceUnitInfo ( org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo ) ; } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ( ) { if ( this . java.util.Set<java.lang.String> . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING + ObjectUtils . nullSafeToString ( this . java.lang.String[] ) ) ; } if ( this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . isEmpty ( ) ) { throw new java.lang.IllegalStateException ( STRING + ObjectUtils . nullSafeToString ( this . java.lang.String[] ) + STRING ) ; } if ( this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . size ( ) > NUMBER ) { return org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ( this . java.lang.String ) ; } PersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo = this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . values ( ) . iterator ( ) . next ( ) ; this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . clear ( ) ; return org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ( java.lang.String java.lang.String ) { PersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo = this . java.util.Map<java.lang.String,org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo> . remove ( java.lang.String ) ; if ( org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo == null ) { if ( ! this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } else { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } } return org.springframework.orm.jpa.persistenceunit.PersistenceUnitInfo ; }  <METHOD_END>
