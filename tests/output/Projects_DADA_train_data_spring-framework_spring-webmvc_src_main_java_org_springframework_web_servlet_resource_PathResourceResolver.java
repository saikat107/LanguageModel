<METHOD_START> public void void ( Resource ... org.springframework.web.servlet.resource.Resource[] ) { this . org.springframework.web.servlet.resource.Resource[] = org.springframework.web.servlet.resource.Resource[] ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.resource.Resource [] org.springframework.web.servlet.resource.Resource[] ( ) { return this . org.springframework.web.servlet.resource.Resource[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.resource.Resource org.springframework.web.servlet.resource.Resource ( HttpServletRequest org.springframework.web.servlet.resource.HttpServletRequest , java.lang.String java.lang.String , java.util.List<? extends org.springframework.web.servlet.resource.Resource> < ? extends Resource > java.util.List<? extends org.springframework.web.servlet.resource.Resource> , ResourceResolverChain org.springframework.web.servlet.resource.ResourceResolverChain ) { return org.springframework.web.servlet.resource.Resource ( java.lang.String , java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String , java.util.List<? extends org.springframework.web.servlet.resource.Resource> < ? extends Resource > java.util.List<? extends org.springframework.web.servlet.resource.Resource> , ResourceResolverChain org.springframework.web.servlet.resource.ResourceResolverChain ) { return ( StringUtils . hasText ( java.lang.String ) && org.springframework.web.servlet.resource.Resource ( java.lang.String , java.util.List<> ) != null ? java.lang.String : null ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.resource.Resource org.springframework.web.servlet.resource.Resource ( java.lang.String java.lang.String , java.util.List<? extends org.springframework.web.servlet.resource.Resource> < ? extends Resource > java.util.List<? extends org.springframework.web.servlet.resource.Resource> ) { for ( Resource org.springframework.web.servlet.resource.Resource : java.util.List<> ) { try { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.servlet.resource.Resource ) ; } Resource org.springframework.web.servlet.resource.Resource = org.springframework.web.servlet.resource.Resource ( java.lang.String , org.springframework.web.servlet.resource.Resource ) ; if ( org.springframework.web.servlet.resource.Resource != null ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.servlet.resource.Resource ) ; } return org.springframework.web.servlet.resource.Resource ; } else if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.servlet.resource.Resource ) ; } } catch ( java.io.IOException java.io.IOException ) { logger . trace ( STRING , java.io.IOException ) ; } } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.resource.Resource org.springframework.web.servlet.resource.Resource ( java.lang.String java.lang.String , Resource org.springframework.web.servlet.resource.Resource ) throws java.io.IOException { Resource org.springframework.web.servlet.resource.Resource = org.springframework.web.servlet.resource.Resource . createRelative ( java.lang.String ) ; if ( org.springframework.web.servlet.resource.Resource . exists ( ) && org.springframework.web.servlet.resource.Resource . isReadable ( ) ) { if ( boolean ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ) { return org.springframework.web.servlet.resource.Resource ; } else if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.String + STRING + STRING + org.springframework.web.servlet.resource.Resource . getURL ( ) + STRING + STRING + org.springframework.web.servlet.resource.Resource . getURL ( ) + STRING + STRING + java.util.Arrays . java.util.List ( org.springframework.web.servlet.resource.Resource[] ( ) ) ) ; } } return null ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( Resource org.springframework.web.servlet.resource.Resource , Resource org.springframework.web.servlet.resource.Resource ) throws java.io.IOException { if ( boolean ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ) { return true ; } if ( org.springframework.web.servlet.resource.Resource[] ( ) != null ) { for ( Resource org.springframework.web.servlet.resource.Resource : org.springframework.web.servlet.resource.Resource[] ( ) ) { if ( boolean ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ) { return true ; } } } return false ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( Resource org.springframework.web.servlet.resource.Resource , Resource org.springframework.web.servlet.resource.Resource ) throws java.io.IOException { if ( org.springframework.web.servlet.resource.Resource . getClass ( ) != org.springframework.web.servlet.resource.Resource . getClass ( ) ) { return false ; } java.lang.String java.lang.String ; java.lang.String java.lang.String ; if ( org.springframework.web.servlet.resource.Resource instanceof UrlResource ) { java.lang.String = org.springframework.web.servlet.resource.Resource . getURL ( ) . toExternalForm ( ) ; java.lang.String = StringUtils . cleanPath ( org.springframework.web.servlet.resource.Resource . getURL ( ) . toString ( ) ) ; } else if ( org.springframework.web.servlet.resource.Resource instanceof ClassPathResource ) { java.lang.String = ( ( ClassPathResource ) org.springframework.web.servlet.resource.Resource ) . getPath ( ) ; java.lang.String = StringUtils . cleanPath ( ( ( ClassPathResource ) org.springframework.web.servlet.resource.Resource ) . getPath ( ) ) ; } else if ( org.springframework.web.servlet.resource.Resource instanceof ServletContextResource ) { java.lang.String = ( ( ServletContextResource ) org.springframework.web.servlet.resource.Resource ) . getPath ( ) ; java.lang.String = StringUtils . cleanPath ( ( ( ServletContextResource ) org.springframework.web.servlet.resource.Resource ) . getPath ( ) ) ; } else { java.lang.String = org.springframework.web.servlet.resource.Resource . getURL ( ) . getPath ( ) ; java.lang.String = StringUtils . cleanPath ( org.springframework.web.servlet.resource.Resource . getURL ( ) . getPath ( ) ) ; } if ( java.lang.String . boolean ( java.lang.String ) ) { return true ; } java.lang.String = ( java.lang.String . boolean ( STRING ) || java.lang.String . boolean ( ) ? java.lang.String : java.lang.String + STRING ) ; if ( ! java.lang.String . boolean ( java.lang.String ) ) { return false ; } if ( java.lang.String . boolean ( STRING ) ) { if ( java.net.URLDecoder . java.lang.String ( java.lang.String , STRING ) . boolean ( STRING ) ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.String ) ; } return false ; } } return true ; }  <METHOD_END>