<METHOD_START> public void ( java.lang.String ... java.lang.String[] ) { this( java.lang.String[] , ( java.lang.String [] ) null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String [] java.lang.String[] , java.lang.String [] java.lang.String[] ) { this( java.lang.String[] , java.lang.String[] , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String [] java.lang.String[] , java.lang.String [] java.lang.String[] , ContentNegotiationManager org.springframework.web.servlet.mvc.condition.ContentNegotiationManager ) { this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> = new java.util.ArrayList<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> <> ( java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( java.lang.String[] , java.lang.String[] ) ) ; java.util.Collections . void ( this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; this . org.springframework.web.servlet.mvc.condition.ContentNegotiationManager = ( org.springframework.web.servlet.mvc.condition.ContentNegotiationManager != null ? org.springframework.web.servlet.mvc.condition.ContentNegotiationManager : new ContentNegotiationManager ( ) ) ; }  <METHOD_END>
<METHOD_START> private void ( java.util.Collection<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.Collection<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> , ContentNegotiationManager org.springframework.web.servlet.mvc.condition.ContentNegotiationManager ) { this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> = new java.util.ArrayList<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> <> ( java.util.Collection<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; java.util.Collections . void ( this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; this . org.springframework.web.servlet.mvc.condition.ContentNegotiationManager = ( org.springframework.web.servlet.mvc.condition.ContentNegotiationManager != null ? org.springframework.web.servlet.mvc.condition.ContentNegotiationManager : new ContentNegotiationManager ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( java.lang.String [] java.lang.String[] , java.lang.String [] java.lang.String[] ) { java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> <> ( ) ; if ( java.lang.String[] != null ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { HeaderExpression org.springframework.web.servlet.mvc.condition.HeaderExpression = new HeaderExpression ( java.lang.String ) ; if ( STRING . boolean ( expr . name ) ) { for ( MediaType org.springframework.web.servlet.mvc.condition.MediaType : MediaType . parseMediaTypes ( expr . value ) ) { java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( new org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( org.springframework.web.servlet.mvc.condition.MediaType , expr . isNegated ) ) ; } } } } if ( java.lang.String[] != null ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( new org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( java.lang.String ) ) ; } } return java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.web.servlet.mvc.condition.MediaTypeExpression> < MediaTypeExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.MediaTypeExpression> ( ) { return new java.util.LinkedHashSet <> ( this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> ( ) { java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.MediaType> <> ( ) ; for ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression : this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) { if ( ! org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . isNegated ( ) ) { java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> . add ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . getMediaType ( ) ) ; } } return java.util.Set<org.springframework.web.servlet.mvc.condition.MediaType> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) { return this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ) { return ( ! org.springframework.web.servlet.mvc.condition.ProducesRequestCondition . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( ) ? org.springframework.web.servlet.mvc.condition.ProducesRequestCondition : this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { if ( CorsUtils . isPreFlightRequest ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ) { return org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ; } if ( boolean ( ) ) { return this ; } java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ; try { java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> = java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ; } catch ( HttpMediaTypeException org.springframework.web.servlet.mvc.condition.HttpMediaTypeException ) { return null ; } java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> <> ( java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; for ( java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> = java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) ; java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( ) ;) { org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression = java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( ) ; if ( ! org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . boolean ( java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) ) { java.util.Iterator<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . void ( ) ; } } if ( ! java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( ) ) { return new org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ( java.util.Set<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> , this . org.springframework.web.servlet.mvc.condition.ContentNegotiationManager ) ; } else if ( java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> . contains ( MediaType . ALL ) ) { return org.springframework.web.servlet.mvc.condition.ProducesRequestCondition ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition , HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) { try { java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> = java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ; for ( MediaType org.springframework.web.servlet.mvc.condition.MediaType : java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) { int int = this . int ( org.springframework.web.servlet.mvc.condition.MediaType ) ; int int = org.springframework.web.servlet.mvc.condition.ProducesRequestCondition . int ( org.springframework.web.servlet.mvc.condition.MediaType ) ; int int = int ( this , int , org.springframework.web.servlet.mvc.condition.ProducesRequestCondition , int ) ; if ( int != NUMBER ) { return int ; } int = this . int ( org.springframework.web.servlet.mvc.condition.MediaType ) ; int = org.springframework.web.servlet.mvc.condition.ProducesRequestCondition . int ( org.springframework.web.servlet.mvc.condition.MediaType ) ; int = int ( this , int , org.springframework.web.servlet.mvc.condition.ProducesRequestCondition , int ) ; if ( int != NUMBER ) { return int ; } } return NUMBER ; } catch ( HttpMediaTypeNotAcceptableException org.springframework.web.servlet.mvc.condition.HttpMediaTypeNotAcceptableException ) { throw new java.lang.IllegalStateException ( STRING , org.springframework.web.servlet.mvc.condition.HttpMediaTypeNotAcceptableException ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ( HttpServletRequest org.springframework.web.servlet.mvc.condition.HttpServletRequest ) throws org.springframework.web.servlet.mvc.condition.HttpMediaTypeNotAcceptableException { java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> = this . org.springframework.web.servlet.mvc.condition.ContentNegotiationManager . resolveMediaTypes ( new ServletWebRequest ( org.springframework.web.servlet.mvc.condition.HttpServletRequest ) ) ; return java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> . isEmpty ( ) ? java.util.Collections . java.util.List ( MediaType . ALL ) : java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ; }  <METHOD_END>
<METHOD_START> private int int ( MediaType org.springframework.web.servlet.mvc.condition.MediaType ) { for ( int int = NUMBER ; int < java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . int ( ) ; int ++ ) { MediaType org.springframework.web.servlet.mvc.condition.MediaType = java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( int ) . getMediaType ( ) ; if ( org.springframework.web.servlet.mvc.condition.MediaType . getType ( ) . equalsIgnoreCase ( org.springframework.web.servlet.mvc.condition.MediaType . getType ( ) ) && org.springframework.web.servlet.mvc.condition.MediaType . getSubtype ( ) . equalsIgnoreCase ( org.springframework.web.servlet.mvc.condition.MediaType . getSubtype ( ) ) ) { return int ; } } return - NUMBER ; }  <METHOD_END>
<METHOD_START> private int int ( MediaType org.springframework.web.servlet.mvc.condition.MediaType ) { for ( int int = NUMBER ; int < java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . int ( ) ; int ++ ) { if ( org.springframework.web.servlet.mvc.condition.MediaType . includes ( java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( int ) . getMediaType ( ) ) ) { return int ; } } return - NUMBER ; }  <METHOD_END>
<METHOD_START> private int int ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition , int int , org.springframework.web.servlet.mvc.condition.ProducesRequestCondition org.springframework.web.servlet.mvc.condition.ProducesRequestCondition , int int ) { int int = NUMBER ; if ( int != int ) { int = int - int ; } else if ( int != - NUMBER ) { org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression = org.springframework.web.servlet.mvc.condition.ProducesRequestCondition . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( int ) ; org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression = org.springframework.web.servlet.mvc.condition.ProducesRequestCondition . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) . org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ( int ) ; int = org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . compareTo ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression ) ; int = ( int != NUMBER ) ? int : org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . getMediaType ( ) . compareTo ( org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression . getMediaType ( ) ) ; } return int ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> < org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression > java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ( ) { return ( this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> . boolean ( ) ? java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> : this . java.util.List<org.springframework.web.servlet.mvc.condition.ProducesRequestCondition.ProduceMediaTypeExpression> ) ; }  <METHOD_END>
<METHOD_START> void ( MediaType org.springframework.web.servlet.mvc.condition.MediaType , boolean boolean ) { super( org.springframework.web.servlet.mvc.condition.MediaType , boolean ); }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public final boolean boolean ( java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) { boolean boolean = boolean ( java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) ; return ( ! isNegated ( ) ? boolean : ! boolean ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) { for ( MediaType org.springframework.web.servlet.mvc.condition.MediaType : java.util.List<org.springframework.web.servlet.mvc.condition.MediaType> ) { if ( getMediaType ( ) . isCompatibleWith ( org.springframework.web.servlet.mvc.condition.MediaType ) ) { return true ; } } return false ; }  <METHOD_END>