<METHOD_START> protected void ( ) {	}  <METHOD_END>
<METHOD_START> protected void ( CacheManager org.springframework.cache.interceptor.CacheManager ) { this . org.springframework.cache.interceptor.CacheManager = org.springframework.cache.interceptor.CacheManager ; }  <METHOD_END>
<METHOD_START> public void void ( CacheManager org.springframework.cache.interceptor.CacheManager ) { this . org.springframework.cache.interceptor.CacheManager = org.springframework.cache.interceptor.CacheManager ; }  <METHOD_END>
<METHOD_START> public org.springframework.cache.interceptor.CacheManager org.springframework.cache.interceptor.CacheManager ( ) { return this . org.springframework.cache.interceptor.CacheManager ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Assert . notNull ( this . org.springframework.cache.interceptor.CacheManager , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<? extends org.springframework.cache.interceptor.Cache> < ? extends Cache > java.util.Collection<? extends org.springframework.cache.interceptor.Cache> ( CacheOperationInvocationContext < ? > org.springframework.cache.interceptor.CacheOperationInvocationContext<?> ) { java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = java.util.Collection<java.lang.String> ( org.springframework.cache.interceptor.CacheOperationInvocationContext<> ) ; if ( java.util.Collection<java.lang.String> == null ) { return java.util.Collections . java.util.List<org.springframework.cache.interceptor.Cache> ( ) ; } else { java.util.Collection<org.springframework.cache.interceptor.Cache> < Cache > java.util.Collection<org.springframework.cache.interceptor.Cache> = new java.util.ArrayList<org.springframework.cache.interceptor.Cache> <> ( ) ; for ( java.lang.String java.lang.String : java.util.Collection<java.lang.String> ) { Cache org.springframework.cache.interceptor.Cache = this . org.springframework.cache.interceptor.CacheManager . getCache ( java.lang.String ) ; if ( org.springframework.cache.interceptor.Cache == null ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING + org.springframework.cache.interceptor.CacheOperationInvocationContext<> . getOperation ( ) ) ; } java.util.Collection<org.springframework.cache.interceptor.Cache> . add ( org.springframework.cache.interceptor.Cache ) ; } return java.util.Collection<org.springframework.cache.interceptor.Cache> ; } }  <METHOD_END>
<METHOD_START> protected abstract java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ( CacheOperationInvocationContext < ? > org.springframework.cache.interceptor.CacheOperationInvocationContext<?> );  <METHOD_END>
