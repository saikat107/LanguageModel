<METHOD_START> public void ( FileItem org.springframework.web.multipart.commons.FileItem ) { this . org.springframework.web.multipart.commons.FileItem = org.springframework.web.multipart.commons.FileItem ; this . long = this . org.springframework.web.multipart.commons.FileItem . getSize ( ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.web.multipart.commons.FileItem org.springframework.web.multipart.commons.FileItem ( ) { return this . org.springframework.web.multipart.commons.FileItem ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.multipart.commons.FileItem . getFieldName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = this . org.springframework.web.multipart.commons.FileItem . getName ( ) ; if ( java.lang.String == null ) { return STRING ; } if ( this . boolean ) { return java.lang.String ; } int int = java.lang.String . int ( STRING ) ; int int = java.lang.String . int ( STRING ) ; int int = ( int > int ? int : int ) ; if ( int != - NUMBER ) { return java.lang.String . java.lang.String ( int + NUMBER ) ; } else { return java.lang.String ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.multipart.commons.FileItem . getContentType ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . long == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( ) { if ( ! boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } byte [] byte[] = this . org.springframework.web.multipart.commons.FileItem . get ( ) ; return ( byte[] != null ? byte[] : new byte [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { if ( ! boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.io.InputStream java.io.InputStream = this . org.springframework.web.multipart.commons.FileItem . getInputStream ( ) ; return ( java.io.InputStream != null ? java.io.InputStream : StreamUtils . emptyInput ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.File java.io.File ) throws java.io.IOException , java.lang.IllegalStateException { if ( ! boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( java.io.File . boolean ( ) && ! java.io.File . boolean ( ) ) { throw new java.io.IOException ( STRING + java.io.File . java.lang.String ( ) + STRING ) ; } try { this . org.springframework.web.multipart.commons.FileItem . write ( java.io.File ) ; if ( org.springframework.web.multipart.commons.Log . isDebugEnabled ( ) ) { java.lang.String java.lang.String = STRING ; if ( ! this . org.springframework.web.multipart.commons.FileItem . isInMemory ( ) ) { java.lang.String = ( boolean ( ) ? STRING : STRING ) ; } org.springframework.web.multipart.commons.Log . debug ( STRING + java.lang.String ( ) + STRING + java.lang.String ( ) + STRING + java.lang.String ( ) + STRING + java.lang.String + STRING + java.io.File . java.lang.String ( ) + STRING ) ; } } catch ( FileUploadException org.springframework.web.multipart.commons.FileUploadException ) { throw new java.lang.IllegalStateException ( org.springframework.web.multipart.commons.FileUploadException . getMessage ( ) , org.springframework.web.multipart.commons.FileUploadException ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { throw java.lang.IllegalStateException ; } catch ( java.io.IOException java.io.IOException ) { throw java.io.IOException ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.io.IOException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { if ( this . org.springframework.web.multipart.commons.FileItem . isInMemory ( ) ) { return true ; } if ( this . org.springframework.web.multipart.commons.FileItem instanceof DiskFileItem ) { return ( ( DiskFileItem ) this . org.springframework.web.multipart.commons.FileItem ) . getStoreLocation ( ) . exists ( ) ; } return ( this . org.springframework.web.multipart.commons.FileItem . getSize ( ) == this . long ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( this . org.springframework.web.multipart.commons.FileItem . isInMemory ( ) ) { return STRING ; } else if ( this . org.springframework.web.multipart.commons.FileItem instanceof DiskFileItem ) { return STRING + ( ( DiskFileItem ) this . org.springframework.web.multipart.commons.FileItem ) . getStoreLocation ( ) . getAbsolutePath ( ) + STRING ; } else { return STRING ; } }  <METHOD_END>