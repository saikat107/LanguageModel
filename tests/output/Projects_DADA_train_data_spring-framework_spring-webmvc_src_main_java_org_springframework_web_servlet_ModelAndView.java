<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.Object = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( View org.springframework.web.servlet.View ) { this . java.lang.Object = org.springframework.web.servlet.View ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { this . java.lang.Object = java.lang.String ; if ( java.util.Map<java.lang.String,> != null ) { org.springframework.web.servlet.ModelMap ( ) . addAllAttributes ( java.util.Map<java.lang.String,> ) ; } }  <METHOD_END>
<METHOD_START> public void ( View org.springframework.web.servlet.View , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { this . java.lang.Object = org.springframework.web.servlet.View ; if ( java.util.Map<java.lang.String,> != null ) { org.springframework.web.servlet.ModelMap ( ) . addAllAttributes ( java.util.Map<java.lang.String,> ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , HttpStatus org.springframework.web.servlet.HttpStatus ) { this . java.lang.Object = java.lang.String ; this . org.springframework.web.servlet.HttpStatus = org.springframework.web.servlet.HttpStatus ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , HttpStatus org.springframework.web.servlet.HttpStatus ) { this . java.lang.Object = java.lang.String ; if ( java.util.Map<java.lang.String,> != null ) { org.springframework.web.servlet.ModelMap ( ) . addAllAttributes ( java.util.Map<java.lang.String,> ) ; } this . org.springframework.web.servlet.HttpStatus = org.springframework.web.servlet.HttpStatus ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.String ; org.springframework.web.servlet.ModelAndView ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void ( View org.springframework.web.servlet.View , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . java.lang.Object = org.springframework.web.servlet.View ; org.springframework.web.servlet.ModelAndView ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.Object = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( this . java.lang.Object instanceof java.lang.String ? ( java.lang.String ) this . java.lang.Object : null ) ; }  <METHOD_END>
<METHOD_START> public void void ( View org.springframework.web.servlet.View ) { this . java.lang.Object = org.springframework.web.servlet.View ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.View org.springframework.web.servlet.View ( ) { return ( this . java.lang.Object instanceof View ? ( View ) this . java.lang.Object : null ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.lang.Object != null ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.lang.Object instanceof java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . org.springframework.web.servlet.ModelMap ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.ModelMap org.springframework.web.servlet.ModelMap ( ) { if ( this . org.springframework.web.servlet.ModelMap == null ) { this . org.springframework.web.servlet.ModelMap = new ModelMap ( ) ; } return this . org.springframework.web.servlet.ModelMap ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return org.springframework.web.servlet.ModelMap ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( HttpStatus org.springframework.web.servlet.HttpStatus ) { this . org.springframework.web.servlet.HttpStatus = org.springframework.web.servlet.HttpStatus ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.HttpStatus org.springframework.web.servlet.HttpStatus ( ) { return this . org.springframework.web.servlet.HttpStatus ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.ModelAndView org.springframework.web.servlet.ModelAndView ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { org.springframework.web.servlet.ModelMap ( ) . addAttribute ( java.lang.String , java.lang.Object ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.ModelAndView org.springframework.web.servlet.ModelAndView ( java.lang.Object java.lang.Object ) { org.springframework.web.servlet.ModelMap ( ) . addAttribute ( java.lang.Object ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.ModelAndView org.springframework.web.servlet.ModelAndView ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { org.springframework.web.servlet.ModelMap ( ) . addAllAttributes ( java.util.Map<java.lang.String,> ) ; return this ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.lang.Object = null ; this . org.springframework.web.servlet.ModelMap = null ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.lang.Object == null && CollectionUtils . isEmpty ( this . org.springframework.web.servlet.ModelMap ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . boolean && boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( STRING ) ; if ( boolean ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . java.lang.Object ) . java.lang.StringBuilder ( STRING ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . java.lang.Object ) . java.lang.StringBuilder ( ']' ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . org.springframework.web.servlet.ModelMap ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
