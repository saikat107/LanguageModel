<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isInstanceOf ( java.util.Date .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( HttpStatus . NOT_FOUND . getReasonPhrase ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( STRING ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . resolveException ( this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest , null , null , java.lang.RuntimeException ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , new java.lang.RuntimeException ( STRING ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getError ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes ) ) . isSameAs ( java.lang.RuntimeException ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) . isNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( java.lang.RuntimeException .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( STRING ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , java.lang.RuntimeException ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getError ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes ) ) . isSameAs ( java.lang.RuntimeException ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( java.lang.RuntimeException .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , new java.lang.RuntimeException ( ) ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( java.lang.RuntimeException .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( STRING ) ; ServletException org.springframework.boot.autoconfigure.web.servlet.error.ServletException = new ServletException ( new ServletException ( java.lang.RuntimeException ) ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , org.springframework.boot.autoconfigure.web.servlet.error.ServletException ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getError ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes ) ) . isSameAs ( org.springframework.boot.autoconfigure.web.servlet.error.ServletException ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( java.lang.RuntimeException .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Error java.lang.Error = new java.lang.OutOfMemoryError ( STRING ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , java.lang.Error ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getError ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes ) ) . isSameAs ( java.lang.Error ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( java.lang.OutOfMemoryError .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BindingResult org.springframework.boot.autoconfigure.web.servlet.error.BindingResult = new MapBindingResult ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) , STRING ) ; org.springframework.boot.autoconfigure.web.servlet.error.BindingResult . addError ( new ObjectError ( STRING , STRING ) ) ; java.lang.Exception java.lang.Exception = new BindException ( org.springframework.boot.autoconfigure.web.servlet.error.BindingResult ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.BindingResult , java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BindingResult org.springframework.boot.autoconfigure.web.servlet.error.BindingResult = new MapBindingResult ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) , STRING ) ; org.springframework.boot.autoconfigure.web.servlet.error.BindingResult . addError ( new ObjectError ( STRING , STRING ) ) ; java.lang.Exception java.lang.Exception = new MethodArgumentNotValidException ( null , org.springframework.boot.autoconfigure.web.servlet.error.BindingResult ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.BindingResult , java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> private void void ( BindingResult org.springframework.boot.autoconfigure.web.servlet.error.BindingResult , java.lang.Exception java.lang.Exception ) { this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , java.lang.Exception ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( org.springframework.boot.autoconfigure.web.servlet.error.BindingResult . getAllErrors ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( STRING ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , java.lang.RuntimeException ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , true ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) . java.lang.String ( ) ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.RuntimeException java.lang.RuntimeException = new java.lang.RuntimeException ( STRING ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , java.lang.RuntimeException ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletRequest . setAttribute ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorAttributes . getErrorAttributes ( this . org.springframework.boot.autoconfigure.web.servlet.error.RequestAttributes , false ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
