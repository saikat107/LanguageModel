<METHOD_START> void ( java.lang.String java.lang.String , ResolvableType org.springframework.boot.test.mock.mockito.ResolvableType , MockReset org.springframework.boot.test.mock.mockito.MockReset , boolean boolean , QualifierDefinition org.springframework.boot.test.mock.mockito.QualifierDefinition ) { super( java.lang.String , org.springframework.boot.test.mock.mockito.MockReset , boolean , org.springframework.boot.test.mock.mockito.QualifierDefinition ); Assert . notNull ( org.springframework.boot.test.mock.mockito.ResolvableType , STRING ) ; this . org.springframework.boot.test.mock.mockito.ResolvableType = org.springframework.boot.test.mock.mockito.ResolvableType ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.mock.mockito.ResolvableType org.springframework.boot.test.mock.mockito.ResolvableType ( ) { return this . org.springframework.boot.test.mock.mockito.ResolvableType ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = super. int ( ) ; int = int * int + ObjectUtils . nullSafeHashCode ( this . org.springframework.boot.test.mock.mockito.ResolvableType ) ; return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == this ) { return true ; } if ( java.lang.Object == null || java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) != java.lang.Class<? extends org.springframework.boot.test.mock.mockito.SpyDefinition> ( ) ) { return false ; } org.springframework.boot.test.mock.mockito.SpyDefinition org.springframework.boot.test.mock.mockito.SpyDefinition = ( org.springframework.boot.test.mock.mockito.SpyDefinition ) java.lang.Object ; boolean boolean = super. boolean ( java.lang.Object ) ; boolean = boolean && ObjectUtils . nullSafeEquals ( this . org.springframework.boot.test.mock.mockito.ResolvableType , org.springframework.boot.test.mock.mockito.SpyDefinition . org.springframework.boot.test.mock.mockito.ResolvableType ) ; return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return new ToStringCreator ( this ) . append ( STRING , getName ( ) ) . append ( STRING , this . org.springframework.boot.test.mock.mockito.ResolvableType ) . append ( STRING , getReset ( ) ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.Object java.lang.Object ) { return java.lang.Object ( getName ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . isInstanceOf ( this . org.springframework.boot.test.mock.mockito.ResolvableType . resolve ( ) , java.lang.Object ) ; if ( Mockito . mockingDetails ( java.lang.Object ) . isSpy ( ) ) { return ( T ) java.lang.Object ; } MockSettings org.springframework.boot.test.mock.mockito.MockSettings = MockReset . withSettings ( getReset ( ) ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { org.springframework.boot.test.mock.mockito.MockSettings . name ( java.lang.String ) ; } org.springframework.boot.test.mock.mockito.MockSettings . spiedInstance ( java.lang.Object ) ; org.springframework.boot.test.mock.mockito.MockSettings . defaultAnswer ( Mockito . CALLS_REAL_METHODS ) ; return ( T ) Mockito . mock ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.boot.test.mock.mockito.MockSettings ) ; }  <METHOD_END>