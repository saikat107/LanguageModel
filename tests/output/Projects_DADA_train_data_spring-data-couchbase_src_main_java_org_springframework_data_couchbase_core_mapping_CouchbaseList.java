<METHOD_START> public void ( ) { this( new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ); }  <METHOD_END>
<METHOD_START> public void ( final java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ) { this( java.util.List<java.lang.Object> , null ); }  <METHOD_END>
<METHOD_START> public void ( final SimpleTypeHolder org.springframework.data.couchbase.core.mapping.SimpleTypeHolder ) { this( new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) , org.springframework.data.couchbase.core.mapping.SimpleTypeHolder ); }  <METHOD_END>
<METHOD_START> public void ( final java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> , final SimpleTypeHolder org.springframework.data.couchbase.core.mapping.SimpleTypeHolder ) { this . java.util.List<java.lang.Object> = java.util.List<java.lang.Object> ; java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> = new java.util.HashSet<java.lang.Class<?>> < java.lang.Class<?> < ? > > ( ) ; java.util.Set<java.lang.Class<?>> . boolean ( CouchbaseDocument .class ) ; java.util.Set<java.lang.Class<?>> . boolean ( org.springframework.data.couchbase.core.mapping.CouchbaseList .class ) ; if ( org.springframework.data.couchbase.core.mapping.SimpleTypeHolder != null ) { this . org.springframework.data.couchbase.core.mapping.SimpleTypeHolder = new SimpleTypeHolder ( java.util.Set<java.lang.Class<?>> , org.springframework.data.couchbase.core.mapping.SimpleTypeHolder ) ; } else { this . org.springframework.data.couchbase.core.mapping.SimpleTypeHolder = new SimpleTypeHolder ( java.util.Set<java.lang.Class<?>> , true ) ; } }  <METHOD_END>
<METHOD_START> public final org.springframework.data.couchbase.core.mapping.CouchbaseList org.springframework.data.couchbase.core.mapping.CouchbaseList ( final java.lang.Object java.lang.Object ) { void ( java.lang.Object ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; return this ; }  <METHOD_END>
<METHOD_START> public final java.lang.Object java.lang.Object ( final int int ) { return java.util.List<java.lang.Object> . java.lang.Object ( int ) ; }  <METHOD_END>
<METHOD_START> public final int int ( ) { return int ( false ) ; }  <METHOD_END>
<METHOD_START> public final int int ( final boolean boolean ) { int int = java.util.List<java.lang.Object> . int ( ) ; if ( ! boolean || int == NUMBER ) { return int ; } int int = int ; for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { if ( java.lang.Object instanceof CouchbaseDocument ) { int += ( ( CouchbaseDocument ) java.lang.Object ) . size ( true ) ; } else if ( java.lang.Object instanceof org.springframework.data.couchbase.core.mapping.CouchbaseList ) { int += ( ( org.springframework.data.couchbase.core.mapping.CouchbaseList ) java.lang.Object ) . int ( true ) ; } } return int ; }  <METHOD_END>
<METHOD_START> public final java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( java.util.List<java.lang.Object> ) ; int int = NUMBER ; for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { if ( java.lang.Object instanceof CouchbaseDocument ) { java.util.List<java.lang.Object> . java.lang.Object ( int ) ; java.util.List<java.lang.Object> . void ( int , ( ( CouchbaseDocument ) java.lang.Object ) . export ( ) ) ; } else if ( java.lang.Object instanceof org.springframework.data.couchbase.core.mapping.CouchbaseList ) { java.util.List<java.lang.Object> . java.lang.Object ( int ) ; java.util.List<java.lang.Object> . void ( int , ( ( org.springframework.data.couchbase.core.mapping.CouchbaseList ) java.lang.Object ) . java.util.List<java.lang.Object> ( ) ) ; } int ++ ; } return java.util.List<java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public final boolean boolean ( final java.lang.Object java.lang.Object ) { return java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public final boolean boolean ( ) { return java.util.List<java.lang.Object> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( final java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return; } final java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; if ( org.springframework.data.couchbase.core.mapping.SimpleTypeHolder . isSimpleType ( java.lang.Class<> ) ) { return; } throw new java.lang.IllegalArgumentException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + STRING + java.util.List<java.lang.Object> + '}' ; }  <METHOD_END>