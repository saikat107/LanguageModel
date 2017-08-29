<METHOD_START> public void ( RequestMethod ... org.springframework.web.servlet.mvc.condition.RequestMethod[] ) { this( java.util.List<org.springframework.web.servlet.mvc.condition.RequestMethod> ( org.springframework.web.servlet.mvc.condition.RequestMethod[] ) ); }  <METHOD_END>
<METHOD_START> private void ( java.util.Collection<org.springframework.web.servlet.mvc.condition.RequestMethod> < RequestMethod > java.util.Collection<org.springframework.web.servlet.mvc.condition.RequestMethod> ) { this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> = java.util.Collections . java.util.Set<java.lang.Object> ( new java.util.LinkedHashSet <> ( java.util.Collection<org.springframework.web.servlet.mvc.condition.RequestMethod> ) ) ; }  <METHOD_END>
<METHOD_START> private static java.util.List<org.springframework.web.servlet.mvc.condition.RequestMethod> < RequestMethod > java.util.List<org.springframework.web.servlet.mvc.condition.RequestMethod> ( RequestMethod ... org.springframework.web.servlet.mvc.condition.RequestMethod[] ) { return ( org.springframework.web.servlet.mvc.condition.RequestMethod[] != null ? java.util.Arrays . java.util.List ( org.springframework.web.servlet.mvc.condition.RequestMethod[] ) : java.util.Collections . java.util.List<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> < RequestMethod > java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) { return this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<org.springframework.web.servlet.mvc.condition.RequestMethod> < RequestMethod > java.util.Collection<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) { return this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ) { java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> < RequestMethod > java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> = new java.util.LinkedHashSet <> ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ) ; java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . addAll ( org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ) ; return new org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { if ( CorsUtils . isPreFlightRequest ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ) { return org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ; } if ( java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) . isEmpty ( ) ) { if ( RequestMethod . OPTIONS . name ( ) . equals ( org.springframework.web.servlet.mvc.condition.HttpServletRequest . getMethod ( ) ) && ! DispatcherType . ERROR . equals ( org.springframework.web.servlet.mvc.condition.HttpServletRequest . getDispatcherType ( ) ) ) { return null ; } return this ; } return org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( org.springframework.web.servlet.mvc.condition.HttpServletRequest . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { if ( java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) . isEmpty ( ) ) { return this ; } java.lang.String java.lang.String = org.springframework.web.servlet.mvc.condition.HttpServletRequest . getHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD ) ; return org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( java.lang.String java.lang.String ) { HttpMethod org.springframework.web.servlet.mvc.condition.HttpMethod = HttpMethod . resolve ( java.lang.String ) ; if ( org.springframework.web.servlet.mvc.condition.HttpMethod != null ) { for ( RequestMethod org.springframework.web.servlet.mvc.condition.RequestMethod : java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) ) { if ( org.springframework.web.servlet.mvc.condition.HttpMethod . matches ( org.springframework.web.servlet.mvc.condition.RequestMethod . name ( ) ) ) { return new org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ( org.springframework.web.servlet.mvc.condition.RequestMethod ) ; } } if ( org.springframework.web.servlet.mvc.condition.HttpMethod == HttpMethod . HEAD && java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> ( ) . contains ( RequestMethod . GET ) ) { return org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition , HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { if ( org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . size ( ) != this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . size ( ) ) { return org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . size ( ) - this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . size ( ) ; } else if ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . size ( ) == NUMBER ) { if ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . contains ( RequestMethod . HEAD ) && org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . contains ( RequestMethod . GET ) ) { return - NUMBER ; } else if ( this . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . contains ( RequestMethod . GET ) && org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition . java.util.Set<org.springframework.web.servlet.mvc.condition.RequestMethod> . contains ( RequestMethod . HEAD ) ) { return NUMBER ; } } return NUMBER ; }  <METHOD_END>
