<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] , ParameterNameDiscoverer org.springframework.context.expression.ParameterNameDiscoverer ) { super( java.lang.Object ); this . java.lang.reflect.Method = java.lang.reflect.Method ; this . java.lang.Object[] = java.lang.Object[] ; this . org.springframework.context.expression.ParameterNameDiscoverer = org.springframework.context.expression.ParameterNameDiscoverer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = super. lookupVariable ( java.lang.String ) ; if ( java.lang.Object != null ) { return java.lang.Object ; } if ( ! this . boolean ) { void ( ) ; this . boolean = true ; java.lang.Object = super. lookupVariable ( java.lang.String ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( ObjectUtils . isEmpty ( this . java.lang.Object[] ) ) { return; } java.lang.String [] java.lang.String[] = this . org.springframework.context.expression.ParameterNameDiscoverer . getParameterNames ( this . java.lang.reflect.Method ) ; int int = ( java.lang.String[] != null ? java.lang.String[] . int : this . java.lang.reflect.Method . int ( ) ) ; int int = this . java.lang.Object[] . int ; for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.Object java.lang.Object = null ; if ( int > int && int == int - NUMBER ) { java.lang.Object = java.util.Arrays . java.lang.Object[] ( this . java.lang.Object[] , int , int ) ; } else if ( int > int ) { java.lang.Object = this . java.lang.Object[] [ int ] ; } setVariable ( STRING + int , java.lang.Object ) ; setVariable ( STRING + int , java.lang.Object ) ; if ( java.lang.String[] != null ) { setVariable ( java.lang.String[] [ int ] , java.lang.Object ) ; } } }  <METHOD_END>