<METHOD_START> public void ( ) { setContentType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.document.HttpServletResponse ) throws java.lang.Exception { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = createTemporaryOutputStream ( ) ; PdfReader org.springframework.web.servlet.view.document.PdfReader = org.springframework.web.servlet.view.document.PdfReader ( ) ; PdfStamper org.springframework.web.servlet.view.document.PdfStamper = new PdfStamper ( org.springframework.web.servlet.view.document.PdfReader , java.io.ByteArrayOutputStream ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.document.PdfStamper , org.springframework.web.servlet.view.document.HttpServletRequest , org.springframework.web.servlet.view.document.HttpServletResponse ) ; org.springframework.web.servlet.view.document.PdfStamper . close ( ) ; writeToResponse ( org.springframework.web.servlet.view.document.HttpServletResponse , java.io.ByteArrayOutputStream ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.view.document.PdfReader org.springframework.web.servlet.view.document.PdfReader ( ) java.io.IOException { return new PdfReader ( getApplicationContext ( ) . getResource ( getUrl ( ) ) . getInputStream ( ) ) ; }  <METHOD_END>
<METHOD_START> protected abstract void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , PdfStamper org.springframework.web.servlet.view.document.PdfStamper , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.document.HttpServletResponse ) throws java.lang.Exception ;  <METHOD_END>