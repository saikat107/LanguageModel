<METHOD_START> void ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { super( HttpMethod . POST , java.lang.String , java.lang.Object[] ); super. contentType ( MediaType . MULTIPART_FORM_DATA ) ; }  <METHOD_END>
<METHOD_START> void ( java.net.URI java.net.URI ) { super( HttpMethod . POST , java.net.URI ); super. contentType ( MediaType . MULTIPART_FORM_DATA ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder ( java.lang.String java.lang.String , byte [] byte[] ) { this . java.util.List<org.springframework.test.web.servlet.request.MockMultipartFile> . add ( new MockMultipartFile ( java.lang.String , byte[] ) ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder ( MockMultipartFile org.springframework.test.web.servlet.request.MockMultipartFile ) { this . java.util.List<org.springframework.test.web.servlet.request.MockMultipartFile> . add ( org.springframework.test.web.servlet.request.MockMultipartFile ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder ( Part ... org.springframework.test.web.servlet.request.Part[] ) { Assert . notEmpty ( org.springframework.test.web.servlet.request.Part[] , STRING ) ; for ( Part org.springframework.test.web.servlet.request.Part : org.springframework.test.web.servlet.request.Part[] ) { this . org.springframework.test.web.servlet.request.MultiValueMap<java.lang.String,org.springframework.test.web.servlet.request.Part> . add ( org.springframework.test.web.servlet.request.Part . getName ( ) , org.springframework.test.web.servlet.request.Part ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return this ; } if ( java.lang.Object instanceof MockHttpServletRequestBuilder ) { super. merge ( java.lang.Object ) ; if ( java.lang.Object instanceof org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder ) { org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder = ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder ) java.lang.Object ; this . java.util.List<org.springframework.test.web.servlet.request.MockMultipartFile> . addAll ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder . java.util.List<org.springframework.test.web.servlet.request.MockMultipartFile> ) ; org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder . org.springframework.test.web.servlet.request.MultiValueMap<java.lang.String,org.springframework.test.web.servlet.request.Part> . keySet ( ) . stream ( ) . forEach ( name -> this . parts . putIfAbsent ( name , parentBuilder . parts . get ( name ) ) ) ; } } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING ) ; } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final org.springframework.test.web.servlet.request.MockHttpServletRequest org.springframework.test.web.servlet.request.MockHttpServletRequest ( ServletContext org.springframework.test.web.servlet.request.ServletContext ) { MockMultipartHttpServletRequest org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( org.springframework.test.web.servlet.request.ServletContext ) ; this . java.util.List<org.springframework.test.web.servlet.request.MockMultipartFile> . stream ( ) . forEach ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest :: addFile ) ; this . org.springframework.test.web.servlet.request.MultiValueMap<java.lang.String,org.springframework.test.web.servlet.request.Part> . values ( ) . stream ( ) . flatMap ( java.util.Collection :: stream ) . forEach ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest :: addPart ) ; if ( ! this . org.springframework.test.web.servlet.request.MultiValueMap<java.lang.String,org.springframework.test.web.servlet.request.Part> . isEmpty ( ) ) { new StandardMultipartHttpServletRequest ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest ) . getMultiFileMap ( ) . values ( ) . stream ( ) . flatMap ( java.util.Collection :: stream ) . forEach ( org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest :: addFile ) ; } return org.springframework.test.web.servlet.request.MockMultipartHttpServletRequest ; }  <METHOD_END>
