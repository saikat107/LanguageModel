<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.GrantedAuthority> < GrantedAuthority > java.util.List<org.springframework.boot.autoconfigure.security.oauth2.resource.GrantedAuthority> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.lang.String java.lang.String = STRING ; if ( java.util.Map<java.lang.String,java.lang.Object> . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ) ; } return AuthorityUtils . commaSeparatedStringToAuthorityList ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; if ( java.lang.Object instanceof java.util.Collection ) { java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; java.lang.Object = java.util.Collection<> . java.lang.Object[] ( new java.lang.Object [ NUMBER ] ) ; } if ( ObjectUtils . isArray ( java.lang.Object ) ) { java.lang.Object [] java.lang.Object[] = ( java.lang.Object [] ) java.lang.Object ; for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { if ( java.lang.Object instanceof java.lang.String ) { java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } else if ( java.lang.Object instanceof java.util.Map ) { java.util.List<java.lang.Object> . boolean ( java.lang.Object ( ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ) ) ; } else { java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } } return StringUtils . collectionToCommaDelimitedString ( java.util.List<java.lang.Object> ) ; } return java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) { if ( java.util.Map<,> . int ( ) == NUMBER ) { return java.util.Map<,> . java.util.Collection<> ( ) . java.util.Iterator<> ( ) . next ( ) ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( java.util.Map<,> . boolean ( java.lang.String ) ) { return java.util.Map<,> . get ( java.lang.String ) ; } } return java.util.Map<,> ; }  <METHOD_END>