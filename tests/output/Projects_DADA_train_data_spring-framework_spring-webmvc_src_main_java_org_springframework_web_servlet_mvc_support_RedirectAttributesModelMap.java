<METHOD_START> public void ( DataBinder org.springframework.web.servlet.mvc.support.DataBinder ) { this . org.springframework.web.servlet.mvc.support.DataBinder = org.springframework.web.servlet.mvc.support.DataBinder ; }  <METHOD_END>
<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( ) { return this . org.springframework.web.servlet.mvc.support.ModelMap ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { super. addAttribute ( java.lang.String , java.lang.String ( java.lang.Object ) ) ; return this ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return null ; } return ( org.springframework.web.servlet.mvc.support.DataBinder != null ) ? org.springframework.web.servlet.mvc.support.DataBinder . convertIfNecessary ( java.lang.Object , java.lang.String .class ) : java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.lang.Object java.lang.Object ) { super. addAttribute ( java.lang.Object ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.util.Collection<?> < ? > java.util.Collection<?> ) { super. addAllAttributes ( java.util.Collection<> ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { for ( java.lang.String java.lang.String : java.util.Map<java.lang.String,> . java.util.Set<java.lang.String> ( ) ) { org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.lang.String , java.util.Map<java.lang.String,> . get ( java.lang.String ) ) ; } } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { for ( java.lang.String java.lang.String : java.util.Map<java.lang.String,> . java.util.Set<java.lang.String> ( ) ) { if ( ! containsKey ( java.lang.String ) ) { org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap ( java.lang.String , java.util.Map<java.lang.String,> . get ( java.lang.String ) ) ; } } } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return super. put ( java.lang.String , java.lang.String ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Map<? extends java.lang.String,? extends java.lang.Object> < ? extends java.lang.String , ? extends java.lang.Object > java.util.Map<? extends java.lang.String,? extends java.lang.Object> ) { if ( java.util.Map<,> != null ) { for ( java.lang.String java.lang.String : java.util.Map<,> . java.util.Set<> ( ) ) { java.lang.Object ( java.lang.String , java.lang.String ( java.util.Map<,> . get ( java.lang.String ) ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributes org.springframework.web.servlet.mvc.support.RedirectAttributes ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . org.springframework.web.servlet.mvc.support.ModelMap . addAttribute ( java.lang.String , java.lang.Object ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.mvc.support.RedirectAttributes org.springframework.web.servlet.mvc.support.RedirectAttributes ( java.lang.Object java.lang.Object ) { this . org.springframework.web.servlet.mvc.support.ModelMap . addAttribute ( java.lang.Object ) ; return this ; }  <METHOD_END>
