<METHOD_START> public void ( ) { this( new java.util.ArrayList<java.lang.Object> <> ( ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void ( java.util.List java.util.List ) { this . java.util.List<java.lang.Object> = ( java.util.List != null ? new java.util.ArrayList <> ( java.util.List ) : new java.util.ArrayList<java.lang.Object> <> ( ) ) ; this . java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> = new java.util.HashSet <> ( ) ; this . java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> = new java.util.HashSet <> ( ) ; this . java.util.Set<java.lang.Class<?>> = new java.util.HashSet<java.lang.Class<?>> <> ( ) ; this . org.springframework.data.solr.core.convert.SimpleTypeHolder = new SimpleTypeHolder ( java.util.Set<java.lang.Class<?>> , SolrSimpleTypes . HOLDER ) ; this . java.util.List<java.lang.Object> . boolean ( StringToPointConverter . INSTANCE ) ; this . java.util.List<java.lang.Object> . boolean ( Point3DToStringConverter . INSTANCE ) ; this . java.util.List<java.lang.Object> . boolean ( new SolrjConverters . SolrjConverters ( ) ) ; if ( VersionUtil . isJodaTimeAvailable ( ) ) { this . java.util.List<java.lang.Object> . boolean ( DateTimeConverters . DateToJodaDateTimeConverter . INSTANCE ) ; this . java.util.List<java.lang.Object> . boolean ( DateTimeConverters . JodaDateTimeToDateConverter . INSTANCE ) ; this . java.util.List<java.lang.Object> . boolean ( DateTimeConverters . DateToLocalDateTimeConverter . INSTANCE ) ; this . java.util.List<java.lang.Object> . boolean ( DateTimeConverters . JodaLocalDateTimeToDateConverter . INSTANCE ) ; } for ( java.lang.Object java.lang.Object : this . java.util.List<java.lang.Object> ) { void ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> public void void ( GenericConversionService org.springframework.data.solr.core.convert.GenericConversionService ) { Assert . notNull ( org.springframework.data.solr.core.convert.GenericConversionService , STRING ) ; for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { if ( java.lang.Object instanceof Converter ) { org.springframework.data.solr.core.convert.GenericConversionService . addConverter ( ( Converter < ? , ? > ) java.lang.Object ) ; } else if ( java.lang.Object instanceof ConverterFactory ) { org.springframework.data.solr.core.convert.GenericConversionService . addConverterFactory ( ( ConverterFactory < ? , ? > ) java.lang.Object ) ; } else if ( java.lang.Object instanceof GenericConverter ) { org.springframework.data.solr.core.convert.GenericConversionService . addConverter ( ( GenericConverter ) java.lang.Object ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING ) ; } } }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.solr.core.convert.SimpleTypeHolder . isSimpleType ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<?> ( java.lang.Class<> , null ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return java.lang.Class<?> ( java.lang.Class<> , java.lang.Class<> , java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> ) ; }  <METHOD_END>
<METHOD_START> java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Iterable<org.springframework.data.solr.core.convert.ConvertiblePair> < ConvertiblePair > java.lang.Iterable<org.springframework.data.solr.core.convert.ConvertiblePair> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( java.lang.Iterable<org.springframework.data.solr.core.convert.ConvertiblePair> , STRING ) ; ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair = new ConvertiblePair ( java.lang.Class<> , java.lang.Class<> != null ? java.lang.Class<> : org.springframework.data.solr.core.convert.CustomConversions.Any .class ) ; if ( java.util.concurrent.ConcurrentMap<org.springframework.data.solr.core.convert.ConvertiblePair,java.lang.Class<?>> . containsKey ( org.springframework.data.solr.core.convert.ConvertiblePair ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.util.concurrent.ConcurrentMap<org.springframework.data.solr.core.convert.ConvertiblePair,java.lang.Class<?>> . get ( org.springframework.data.solr.core.convert.ConvertiblePair ) ; return java.lang.Class<> != org.springframework.data.solr.core.convert.CustomConversions.Any .class ? java.lang.Class<> : null ; } for ( ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair : java.lang.Iterable<org.springframework.data.solr.core.convert.ConvertiblePair> ) { if ( org.springframework.data.solr.core.convert.ConvertiblePair . getSourceType ( ) . isAssignableFrom ( java.lang.Class<> ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.solr.core.convert.ConvertiblePair . getTargetType ( ) ; if ( java.lang.Class<> == null || java.lang.Class<> . boolean ( java.lang.Class<> ) ) { java.util.concurrent.ConcurrentMap<org.springframework.data.solr.core.convert.ConvertiblePair,java.lang.Class<?>> . putIfAbsent ( org.springframework.data.solr.core.convert.ConvertiblePair , java.lang.Class<> ) ; return java.lang.Class<> ; } } } java.util.concurrent.ConcurrentMap<org.springframework.data.solr.core.convert.ConvertiblePair,java.lang.Class<?>> . putIfAbsent ( org.springframework.data.solr.core.convert.ConvertiblePair , org.springframework.data.solr.core.convert.CustomConversions.Any .class ) ; return null ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; return java.lang.Class<?> ( java.lang.Class<> , java.lang.Class<> ) != null ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<?> ( java.lang.Class<> , java.lang.Class<> , java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> ) != null ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<?> ( java.lang.Class<> , java.lang.Class<> , java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; boolean boolean = java.lang.Class<> . boolean ( WritingConverter .class ) ; boolean boolean = java.lang.Class<> . boolean ( ReadingConverter .class ) ; if ( ! boolean && ! boolean ) { boolean = true ; boolean = true ; } if ( java.lang.Object instanceof GenericConverter ) { GenericConverter org.springframework.data.solr.core.convert.GenericConverter = ( GenericConverter ) java.lang.Object ; for ( ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair : org.springframework.data.solr.core.convert.GenericConverter . getConvertibleTypes ( ) ) { void ( new org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext ( org.springframework.data.solr.core.convert.ConvertiblePair , boolean , boolean ) ) ; } } else if ( java.lang.Object instanceof Converter ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = GenericTypeResolver . resolveTypeArguments ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , Converter .class ) ; void ( new org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext ( java.lang.Class<?>[] [ NUMBER ] , java.lang.Class<?>[] [ NUMBER ] , boolean , boolean ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private void void ( org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext ) { ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair = org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext . org.springframework.data.solr.core.convert.ConvertiblePair ( ) ; if ( org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext . boolean ( ) ) { java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> . add ( org.springframework.data.solr.core.convert.ConvertiblePair ) ; } if ( org.springframework.data.solr.core.convert.CustomConversions.ConvertibleContext . boolean ( ) ) { java.util.Set<org.springframework.data.solr.core.convert.ConvertiblePair> . add ( org.springframework.data.solr.core.convert.ConvertiblePair ) ; java.util.Set<java.lang.Class<?>> . boolean ( org.springframework.data.solr.core.convert.ConvertiblePair . getSourceType ( ) ) ; } }  <METHOD_END>
<METHOD_START> public void ( ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair , boolean boolean , boolean boolean ) { Assert . notNull ( org.springframework.data.solr.core.convert.ConvertiblePair , STRING ) ; this . org.springframework.data.solr.core.convert.ConvertiblePair = org.springframework.data.solr.core.convert.ConvertiblePair ; this . boolean = boolean ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> , boolean boolean , boolean boolean ) { this( new ConvertiblePair ( java.lang.Class<> , java.lang.Class<> ) , boolean , boolean ); }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.convert.ConvertiblePair org.springframework.data.solr.core.convert.ConvertiblePair ( ) { return org.springframework.data.solr.core.convert.ConvertiblePair ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>