<METHOD_START> public void ( ) { setContentType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.document.HttpServletResponse ) throws java.lang.Exception { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = createTemporaryOutputStream ( ) ; Document org.springframework.web.servlet.view.document.Document = org.springframework.web.servlet.view.document.Document ( ) ; PdfWriter org.springframework.web.servlet.view.document.PdfWriter = org.springframework.web.servlet.view.document.PdfWriter ( org.springframework.web.servlet.view.document.Document , java.io.ByteArrayOutputStream ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.document.PdfWriter , org.springframework.web.servlet.view.document.HttpServletRequest ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.document.Document , org.springframework.web.servlet.view.document.HttpServletRequest ) ; org.springframework.web.servlet.view.document.Document . open ( ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.document.Document , org.springframework.web.servlet.view.document.PdfWriter , org.springframework.web.servlet.view.document.HttpServletRequest , org.springframework.web.servlet.view.document.HttpServletResponse ) ; org.springframework.web.servlet.view.document.Document . close ( ) ; writeToResponse ( org.springframework.web.servlet.view.document.HttpServletResponse , java.io.ByteArrayOutputStream ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.view.document.Document org.springframework.web.servlet.view.document.Document ( ) { return new Document ( PageSize . A4 ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.view.document.PdfWriter org.springframework.web.servlet.view.document.PdfWriter ( Document org.springframework.web.servlet.view.document.Document , java.io.OutputStream java.io.OutputStream ) throws org.springframework.web.servlet.view.document.DocumentException { return PdfWriter . getInstance ( org.springframework.web.servlet.view.document.Document , java.io.OutputStream ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , PdfWriter org.springframework.web.servlet.view.document.PdfWriter , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest )			throws org.springframework.web.servlet.view.document.DocumentException { org.springframework.web.servlet.view.document.PdfWriter . setViewerPreferences ( int ( ) ) ; }  <METHOD_END>
<METHOD_START> protected int int ( ) { return PdfWriter . ALLOW_PRINTING | PdfWriter . PageLayoutSinglePage ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , Document org.springframework.web.servlet.view.document.Document , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest ) {	}  <METHOD_END>
<METHOD_START> protected abstract void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , Document org.springframework.web.servlet.view.document.Document , PdfWriter org.springframework.web.servlet.view.document.PdfWriter , HttpServletRequest org.springframework.web.servlet.view.document.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.document.HttpServletResponse ) throws java.lang.Exception ;  <METHOD_END>
